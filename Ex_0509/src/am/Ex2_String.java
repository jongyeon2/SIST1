package am;

import java.util.Scanner;

public class Ex2_String {

	public static void main(String[] args) {
//		키보드로 문자열을 받는다.
//		그것이 숫자인지? 아닌지?를 판단하는 프로그램을 완성하시오
		
		Scanner scanner = new Scanner(System.in);
		
		String s = scanner.nextLine();
//		s에서 한 문자씩 얻어내어 그것이 0~9까지의 수들 중 하나인지?
//		아닌지? 판단(boolean)하자
		
		boolean res = true; // res가 ture이면 숫자, 그렇지 않으면 문자열로 인식 
		
		for(int i = 0; i < s.length(); i++) {
			//str로부터 문자 하나를 가져온다.
			char ch = s.charAt(i);
			//i가 0이면 첫번째 문자가 오고, i가 1이면 두번째 문자가 온다.
			
			// 얻어낸 문자(ch)가 0~9범위에 포함되는지? 판단
			if(ch < '0' || ch > '9') {
				res = false;
				break; // 반복문 탈출 
			} //if 문의 끝 
		}// for의 끝 
		if(res)
			System.out.println("숫자입니다.");
		else
			System.out.println("문자입니다.");
	}

}
