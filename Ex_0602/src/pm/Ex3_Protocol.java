package pm;

import java.io.Serializable;

public class Ex3_Protocol implements Serializable {
	// Protocol -> 내가 정한 규칙 
	int cmd; // 1: 접속, 2: 채팅 3: 종료 
	String msg; // 채팅메시지 
	
	public int getCmd() {
		return cmd;
	}
	public void setCmd(int cmd) {
		this.cmd = cmd;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
