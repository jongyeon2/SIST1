package am;

import java.util.Scanner;

public class Ex1_Exception {
	
	public static void main(String[] args) {
		// 프로그램 시작
		
		int v1 = 100;
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력");
		int v2 = scan.nextInt();
		
		try {
		int res = v1/v2;
		if(v2 == 1)
			return; // finally{}안에 있는 코드는 수행 함 
		
		// 위에서 예외가 발생하면 아래 코드 수행 X
		System.out.printf("%d/%d=%d", v1, v2, res);
		
		}catch(ArithmeticException e) {
			// 오류의 종류를 알고 있을때 
			v2 = 1;
			int res = v1/v2;
			System.out.printf("%d/%d=%d", v1, v2, res);
		}catch(Exception e) {
			// 혹시나 다른 예외가 발생할 것을 우려한 영역  
			System.out.println("혹시나~~");
			
		}finally {
			// 예외발생 여부에 대해 상관없이 무조건 수행 하는 곳 
			System.out.println("finally~~~~");
			
		}
		
		System.out.println("프로그램 끝");
	}
}
