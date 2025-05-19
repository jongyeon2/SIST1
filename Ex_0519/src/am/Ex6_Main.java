package am;

public class Ex6_Main {

	public static void main(String[] args) {
//		원하는 객체 생성
		Ex6_Child child = new Ex6_Child();
		
//		상속받았기 때문에 부모 객체의 기능을 사용할 수 있다.
//		자식클래스가 자신이 가진 것 처럼 사용할 수 있다.
		int money = child.getMoney(); 
		
		System.out.printf("%d조원",money); // 100 
		
	}

}
