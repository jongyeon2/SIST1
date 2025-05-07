package pm;

public class Ex4_Oper {

	public static void main(String[] args) {
		//프로그램 시작 
		
		//정수 10을 기억하는 v1이라는 변수를 만들자!
		long v1 = 10L;
		
		//정수 7을 기억하는 v2라는 변수를 만들자!
		long v2 = 7L;
		
		long result = v1 + v2;
		System.out.println("v1 + v2 = " + result); 
		//연산자는 피연산자들 중 하나라도 문자열이 있다면
		//다른 피연산자 또한 복사하여 문자열로 변환됨 
		
		//한마디로 저 출력의 결과는 result변수의 long형이 아닌 String타입이다.
		
		//실수형 : float, double
		float f1 = 3.14f; // 자바에서는 소수점을 가지는 값들은 기본적으로 double로 인식한다.
						  // 그래서 float으로 인식시키기 위해 값뒤에 f를 붙인다.
		double d1 = 2.1;
		
		//나머지 값 구하기 : %
		double d2 = f1%d1;
		System.out.println("f1 % d1 = " + d2);
		// f1의 값 3.14를 의 값 2.1로 나누고 나온 나머지 값(d2) : 1.0400001049041747
 	}

}
