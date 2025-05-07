package am;

public class Ex2 {
	public static void main(String[] args) {
		//프로그램 시작 
		
		//	변수 선언
		//	변수는 자료형을 알아야 한다.
		// 	-자바에서는 자료형을 크게 2가지로 나눠진다.
		//	1)기본자료형    2)객체(참조)자료형
		//	boolean: true(참), false(거짓), 참과 거짓을 의미하는 예약어임 
		boolean b1 = true; // 변수 선언
		System.out.println(b1); 	//문장의 끝은 반드시 세미콜론(;)
		
		// char: 하나의 문자를 기억하는 자료형 문자는 홑따옴표로(')로 구분함 
		char b2 = 'A'; // 변수앞에 자료형이 선언되어 있으면 변수선언 
		System.out.println(b2);
		b2 = 'B'; //변수사용(값 변경) [만약 여기서 b2변수 앞에 자료형이 붙었을경우는 변수를 또 새로 선언하기 떄문에 오류가 난다.] 
		System.out.println(b2);
		
		// 정수형 변수 선언 : byte(127), short(약3만2천), int(21억), long 
		byte b3 = 127; //범위: -128~127까지 
 		
		short b4 = 32000;
		int b5 = 2100000000;
		System.out.println(b4 + b5); // 32000 + 2100000000 더한 후 출력 
		long b6 = 2200000000l; //	long형의 값을 의미할 때는 값 뒤에 l또는 L을 기술한다.
		System.out.println(b6);
		
	}
}
