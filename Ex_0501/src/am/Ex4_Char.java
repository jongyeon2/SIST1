package am;

public class Ex4_Char {

	public static void main(String[] args) {
		//프로그램 시작 
			
		char c = 'B';
		System.out.println("c = " + c);
		
		// 자바의 char형은 2byte이며 내부적으로는
		// 유니코드(숫자)값으로 처리된다 즉 'B' => 66 으로 기억됨 
		
		++c; // 문자형인 변수 c에 증감연산자를 넣어도 오류가 나지 않음 
		System.out.println("c = "+ c); // 'C'증가했기 때문에 문자형인 C가 나옴 
		
		int ch = 97;
		System.out.println("ch = " + (char)ch); // 형변환을 시켜줘서 숫자 97이 아닌 문자 'a'로 출력됨 
			
	}

}
