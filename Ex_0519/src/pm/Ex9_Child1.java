package pm;

public class Ex9_Child1 extends Ex9_Parent {
	
	private String msg = "Child1";
	private int value; // 0
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getValue() { //메서드 재정의 
		return value; // 부모의 value가 아닌 자신의 value를 반환 
	}
	public void setValue(int value) {
		this.value = value;
	}
}

// 메서드 재정의
// 클래스간 상속관계에서 똑같은 기능과 똑같은 이름을 가진 메서드는
// 자식클래스의 메서드가 호출이 되고, 부모클래스는 숨김처리가 된다.