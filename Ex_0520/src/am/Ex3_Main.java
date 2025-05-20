package am;

public class Ex3_Main {
	
//	Ex3_Inter라는 인터페이스를 구현한 클래스만 이 메서드 사용 가능!
	public void test(Ex3_Inter n) {
		n.print();
		n.testValue();
//		n.getValue(); // 오류~~~
//		이유는 현재 메서드로 들어오면서 사용범위가 Ex3_Inter로 변경되어 getValue는 없기 때문이다.
	}

	public static void main(String[] args) {
		
		Ex3_Class t1 = new Ex3_Class();
		Ex3_Impl t2 = new Ex3_Impl();
		
//		현재 클래스가 가지고 있는 test 함수를 호출하기 위해 
//		현재객체 생성
		Ex3_Main main = new Ex3_Main();
		main.test(t1);
		main.test(t2);
		
	}

}
