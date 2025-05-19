package am;

public class Ex4_Main {

	public static void main(String[] args) {
//		원하는 객체 생성 
		Ex4_Args a = new Ex4_Args();
		
//		이름을 똑같이 정의하지만 메서드에 들어가는 인자값이 다르고 반환값이 다르다.
		a.test(10, 20);
		a.test(10, 20, 30);
		
	}

}
