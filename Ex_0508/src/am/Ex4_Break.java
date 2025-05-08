package am;

public class Ex4_Break {

	public static void main(String[] args) {
//		문자열을 기억하는 str이라는 변수 선언
		String str = "100239384";

//		str이 기억하는 문자열의 길이만큼 반복문을 수행하자!
		int i = 0;
		while(i<9) {
			// str에서 문자를 하나 얻어낸다.
			char ch = str.charAt(i);
			
			//얻어낸 값이 '5'이상이면 탈출하자!
			if(ch >= '5') // 문자가 5 이상이면? 탈출 10023 "9"이기 떄문에 10023출력				
				// if 안에 들어오는 조건문이 문자형 이기 떄문에 비교하는 
//				피연산자도 ''를 붙여 문자형으로 만들어 주면 비교가능하다.
				break;			
			++i;
			System.out.printf("%-2c", ch);
//			charAt(int index) "문자열"의 index에 있는 문자를 하나 얻어온다.
		} // while의 끝
		
	}

}
