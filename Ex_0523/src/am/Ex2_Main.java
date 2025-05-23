package am;

public class Ex2_Main {

	public static void main(String[] args) {
		// 내부 클래스 생성 - 반드시 바깥쪽클래스를 거쳐야 한다. 
//		Ex2_Outer.Inner inner = new Ex2_Outer().new Inner();
		
		// 바깥 클래스가 이미 객체 생성이 된 경우 
		Ex2_Outer outer = new Ex2_Outer();
		Ex2_Outer.Inner inner = outer.new Inner();
		
		inner.print();
	}

}
