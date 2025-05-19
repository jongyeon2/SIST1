package am;

public class Ex1_Main {

	public static void main(String[] args) {
		Ex1_Value a = new Ex1_Value(); // 객체 생성 
		int value = 100;  //인자로 전달할 값 
		
//		value값을 넣어서 a의 test함수 호출 
		a.test(value);

//		주소전달을 한것이 아닌 기본자료형(값)을 전달 받은것 이기 때문에 100이 그대로 출력됨
//		test메서드의 기능을 수행한 기본자료형의 값을 받고 싶으면
//		return문을 사용해서 반환을 받아야 한다.
		System.out.println(value); 
	}

}
