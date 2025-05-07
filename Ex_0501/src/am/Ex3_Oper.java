package am;

public class Ex3_Oper {

	public static void main(String[] args) {
		//프로그램 시작 
		
		int a = 10;
		int b = 7;
		
		boolean result = (10 >= a++) || (++b > 7);
		// 			    true(10 = 10) OR 앞에 식이 true 였기 때문에 뒤에 식을 수행 안하기 떄문에 b는 그대로 7	
		System.out.println(result); //
		// 각 변수들 a, b, result의 값을 예측하자면 
		// a++는 증감연산자가 변수 뒤에존재하므로 연산이
		// 줄바꿈할 때 수행한다. 그래서 
		// 먼저 10 >= 10을 수행하여 result에 결과 true가 저장된다.
		// 그리고 
		// 논리 연산자 ||로 인해 두번째 조건을 수행하지 않는다! 
		// 즉(++b > 7) 이 연산을 하지 않고 다음 행으로 전환된다.
		// a = 11 , b = 7, result = true
		
		System.out.println(a);
		System.out.println(b);
	
	}

}
