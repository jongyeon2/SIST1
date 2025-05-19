package pm;

public class Ex9_Child2 extends Ex9_Parent {
	
	private String msg = "Child2";
	private int value = 10; 
	
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
