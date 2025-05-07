package am;

import java.util.Scanner;

public class Ex5_Oper {

	public static void main(String[] args) {
		// 프로그램 시작 
		
		// 삼항연산자(조건연산자) == if문으로도 만들 수 있다, 그치만 단순한 식이면 삼항연산자로 
		// [구성]
		// (조건식) ? (참값) : (거짓값);
		int a = 7;
		int b = 5;
		
		// 변수 result는 거짓값과 참값을 모두 지정할 수 있는 변수의 타입이어야 한다.  
		// 삼항연산자는 반드시 조건을 수행하는 식이 존재해야 함 
		int result = (a < b) ? 1 : 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 값");
		a = scanner.nextInt(); // 변수 a에 받아줄 값 
		
		System.out.println("두번째 값");
		b = scanner.nextInt(); // 변수 b에 받아줄 값 
		
		// 참과 거짓값이 String(문자열로 받기 때문에) str의 타입은 String으로 지정해줌
		String str = (a >= b) ? "a가 크다" : "a가 작다";
		System.out.println(str);
	}

}
