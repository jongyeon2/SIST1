package am;

public class Ex2_Oper {

	public static void main(String[] args) {
		// 프로그램 시작 
		// 증감연산자 : ++, --
		
		// 변수 앞에 있으면 우선순위가 가장 높음 변수뒤에 있으면 우선순위가 가장 낮음 
		
		// 정수 8을 기억하는 변수 a를 만들자!
		int a = 8;
		
		int b = ++a + 3; // 지금 현재로서는 a가 9가 됨
		
		System.out.println("a = "+a); // 증감연산자 ++이 앞에 왔기 때문에 
		System.out.println("b = "+b); // (8+1) + 3 = 9
		
		b = a++ + 3; // 증감연산자 ++이 뒤에 있으면 우선순위가 가장 낮음 (9 + 3 = 12)식이 실행됨 
		//가장 낮아서 제어가 다음행으로 이동될 때 1증가하게 된다.
		
		System.out.println("a = "+a); // 10 위에 증감연산자가 실행된 후 다음행이기 때문에 ++증감연산자가 실행됨
		System.out.println("b = "+b); // 12  
		// 한마디로 증감연산자가 변수 뒤에 붙어 있을 경우 다음줄에 결과가 바뀌어서 실행됨 
		
		System.out.println(a++);
		System.out.println(a); // 11 
	}

}
