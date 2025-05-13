package am;

public class Ex1_Color {// 클래스 해더 
	
	// 속성 : 변수/상수 == 멤버필드(멤버변수)
	private String color;
	
	// 메서드를 만들때 목적과 인자값을 생각 해야함 
	// 메서드이름 : set(변수에 설정), get(변수에서 가져오기)
	
//	기능 : 멤버메서드(함수)
//	색상을 의미하는 문자열을 하나 인자로 받아서 color라는
//	멤버필드에 저장하는 기능 : setColor 
	
	public void setColor(String args) {
		// 받은 인자를 color라는 변수에게 저장한다.
		color = args; // color는 args라는 값으로 대입(저장)한다
	}
	
//접근제어자, 반환할타입, 함수이름()  
	public String getColor() {
//		호출한 곳으로 멤버필드 color의 값을 반환(retrun)한다.
		return color;
	}
	
	
	
	
}// 클래스 영역 
