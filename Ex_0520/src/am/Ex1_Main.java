package am;

public class Ex1_Main {

//	인자가 부모클래스이기 떄문에 부모의 데이터를
	public void test(Ex1_Parent n) {
		n.myData(); // 사용범위가 부모로 재설정되었지만,
//		myData함수는 재정의가 되었으므로 부모의 myData가 숨겨지고
//		Ex1_Child의 myData가 우선권가져서 사용범위에서 벗어났다고 해도 
//		myData만큼은 Ex1_Child의 함수로 호출된다.
	}
	
	public static void main(String[] args) {
//		원하는 객체 생성 
		Ex1_Child c1 = new Ex1_Child();
		
//		test함수를 호출하기 위해서
//		test함수를 가지고 있는 클래스를 객체 생성함
		Ex1_Main main = new Ex1_Main();
		main.test(c1); // Child my Data
	}

}
