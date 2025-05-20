package am;

public class Ex2_Main {
	
	public void test(Ex2_Inter n) {
//		Ex2_Inter를 구현한 객체들은 모두 getValue를 재정의하고 있음을 
//		알고 있기 때문에 이안에서 무조건 getValue를 호출하자!
		System.out.println(n.getValue());
		
	}

	public static void main(String[] args) {
//		인터페이스는 추상메서드(미완성적 개념)이 있어 직접 생성
//		인스턴스를 생성 할 수 없다.
//		Ex2_Inter inter = new Ex2_Inter(); -> 오류
		
//		인터페이스는 다른 클래스로부터 구현하도록 해야 한다. 
		
		Ex2_Class t1 = new Ex2_Class();
		
		Ex2_impl t2 = new Ex2_impl();
		
//		test함수를 호출하기 위해 Ex2_Main생성하자
		Ex2_Main main = new Ex2_Main();
		main.test(t1);
		main.test(t2);
	}

}
