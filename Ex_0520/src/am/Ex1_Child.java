package am;

public class Ex1_Child extends Ex1_Parent {

	public Ex1_Child() {}
	
	public Ex1_Child(int value) {
		super(10);
	}

	
//	오버라이딩 자식 객체가 우선순위를 가짐 
	@Override
	public void myData() {
		// TODO Auto-generated method stub
		System.out.println("Child my Data");
	}
	
	
	
}
