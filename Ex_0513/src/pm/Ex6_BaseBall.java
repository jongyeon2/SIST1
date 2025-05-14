package pm;

import java.util.Scanner;

public class Ex6_BaseBall {
	 int[] computer = new int[3];
	 int[] user = new int[3];
	 int Strikecount = 0;
	 int ballCount = 0;
	 int cnt = 0;
	
	public void init() { // computer 중복제거후 배열에 넣는 초기화 
		for(int i = 0; i < computer.length;) {
			computer[i] = (int)(Math.random() * 9 + 1);
			boolean chk = true;
			for(int j = 0; j < i ; j++) { // 중복체크하는 반복문 
				if(computer[i] == computer[j]) {  
					chk = false; 
					break;	// 같은 값을 찾았거나, 중복된 값이 생겼거나.
				}
			}
			if(chk) // 같은 값을 찾았니?
				++i;
		}
	}// init 메서드의 끝 
	

//	컴퓨터가 가지는 값을 문자열로 반환하는 기능
	public String getCom() {
		StringBuffer sb = new StringBuffer();
//		com배열에 있는 숫자 3개를 하나씩 얻어내어 sb에 추가하는 반복문 
		for(int i = 0; i < computer.length; i++) {
			sb.append(computer[i]);
			
//			마지막에는 ","를 넣지 않도록 하기 위한 비교문
			if(i < computer.length-1) // i가 2보다 작을 때만 
				sb.append(","); // 콤마를 추가한다.
		}
		return sb.toString();
	}
	
	public void user(String str) {
		
		for(int i = 0 ; i <str.length(); i++) { //사용자가 입력한 문자를 하나씩 빼서 user라는 배열에 넣어주기 위해 
			char ch = str.charAt(i);
//			 '1'이 코드값으로 49이므로 48을 빼면 1이 user[i]번째에 
			user[i] = ch-48;
		}
	}
	
	public int strikeCount() {
		for(int i = 0; i < computer.length; i++) {
			if(user[i] == computer[i])
				 Strikecount++;
		}
		return Strikecount;
	}
	
	public int ballCount() {
		for(int i = 0; i < computer.length; i++) {
			if(user[i] == computer[(i+1)%computer.length]) // 비교하려는 자리의 한 칸 뒤 
				ballCount++;
			else if(user[i] == computer[(i+2)%computer.length]) // 비교하려는 자리의 두칸 뒤 
				ballCount++;
		}
		return ballCount;
	}
}
