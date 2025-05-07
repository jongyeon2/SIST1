package pm;

public class Ex8_Oper {

	public static void main(String[] args) {
		// 프로그램 시작 
		
		int a = 10;
		int b = 7;
					// a = a + 2	  //b = b + 2 
//		boolean res = ((a+=2) > 10) && ((b+=2)>10);
		boolean res = ((a+=2) > 10) || ((b+=2)>10);
		
		// &&(AND)와 ||(OR) 다름 
		System.out.println(a); // 12
		System.out.println(b); // 9 앞에서 ((a+=2) > 10)가 true로 뒤에 식 ((b+=2)>10)까지 수행했기 때문에 a,b의 값이 달라졌다 
		// ||(OR)일 경우 앞의 식이 참이기 때문에 수행 하지 않아서 7이 나옴 
		System.out.println(res); // &&(false), ||(true) 
		System.out.println("--------------------------------------");
		
		
		res = ((a+=2)>15) || ((b+=2)>15);
		System.out.println(a); // 14, ||(OR)일 경우 앞의 식 이 위에 영향을 받아 12+2이기 떄문에 false
		System.out.println(b); // 9 앞의 식((a+2)>15)이 false거짓이므로 뒤에 있는 식((b+=2)>15)을 수행하지 않았기 때문에 위의 결과 와 똑같은 값 9가 나온다.
								// ||(OR)의 경우 앞의 식이 false가 나왔기 떄문에 뒤의 식이 수행됨 따라서 7+2 = 9 값은 9가 나오고 값은 false
		System.out.println(res); // ||(OR)앞의 식과 뒤의 식의 값이 false여서 결과는 false
		
		// ||(OR)는 왼쪽의 식이 true일 경우 뒤의 식을 수행하지 않는다.
		// 만약 왼쪽의 식이 false일 경우 뒤의 식을 수행한다 왜? OR는 말 그대로 둘 중 하나 가 true일 경우 true이기 때문에!
		
	}

}
