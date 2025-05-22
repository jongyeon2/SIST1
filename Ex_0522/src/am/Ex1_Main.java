package am;

public class Ex1_Main {

	public static void main(String[] args) {
		// 추상 클래스는 인터페이스와 같이 인스턴스를 직접 생성하지 못한다.
		
		Ex1_Child c1 = new Ex1_Child();
		Ex1_Child2 c2 = new Ex1_Child2();
		
		Ex1_Main m = new Ex1_Main();
		
		m.print(c2);
		m.print(c1);
	}
	
	public void print(Ex1_Abs n) {
		n.test(); // test함수가 자식클래스에서 재정의가 반드시 되어 있음으로
				  // 자식객체의 test가 호출된다. 
	}
	
}
