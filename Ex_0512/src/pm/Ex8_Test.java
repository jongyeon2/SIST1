package pm;

import java.util.Scanner;

public class Ex8_Test {

	public static void main(String[] args) {
//		숫자 야구 프로그램을 만들자
		int[] computer = new int[3]; //문제를 제시할 컴퓨터가 가지고 있는 3개의 난수공간
		int[] user = new int[3];
				
		int Strike = 0; // 이 변수가 3이될 때 프로그램 종료!
		int ballcount = 0;
		int cnt = 0; // 시도한 횟수
		
		//키보드로 부터 입력 받기 위한 스케너 준비
		Scanner scanner = new Scanner(System.in);
		
//		컴퓨터가 가지는 수를 정하는 반복문 - 중복되면 안됨 
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
			
			System.out.printf("%d, %d, %d\r\n", computer[0], computer[1], computer[2]);
			
			
//			사용자로 하여금 입력하도록 유도 한다.
			do {
				Strike = 0;
				ballcount = 0;
				++cnt;
				
				System.out.println(cnt +"차");
				String str = scanner.nextLine();
				for(int i = 0 ; i <str.length(); i++) { //사용자가 입력한 문자를 하나씩 빼서 user라는 배열에 넣어주기 위해 
					char ch = str.charAt(i);
//					 '1'이 코드값으로 49이므로 48을 빼면 1이 user[i]번째에 
					user[i] = ch-48;
				}
//					사용자가 입력한 문자열을 숫자로 변경하여 user 배열에 저장했다.
				
//			스트라이크 카운트하는 반복문 : 같은 자리의 값들만 비교한다.
				for(int i = 0; i < computer.length; i++) {
					if(user[i] == computer[i])
						Strike++;
				}
//			볼 카운트 하는 반복문 
				for(int i = 0; i < computer.length; i++) {
					if(user[i] == computer[(i+1)%computer.length]) // 비교하려는 자리의 한 칸 뒤 
						ballcount++;
					else if(user[i] == computer[(i+2)%computer.length]) // 비교하려는 자리의 두칸 뒤 
						ballcount++;
				}
				System.out.printf("%dStrike, %dBall\r\n", Strike, ballcount); // 이렇게 코드를 작성할 경우 strike와 ballcount가 누적된다.
			}while(Strike !=3); // Strike가 3이 아닐때 까지 반복  		
			
			System.out.printf(--cnt + "회차에 성공!");
			}
	}


