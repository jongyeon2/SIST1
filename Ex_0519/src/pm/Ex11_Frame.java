package pm;

import javax.swing.JFrame;

public class Ex11_Frame extends JFrame {
	
	public Ex11_Frame() {
		this.setTitle("내가 만든 창"); // 창의 이름 
		
//		현재 객체(this)가 상속받아서 가지고 있는 호출이 가능한 setSize 호출 
		this.setSize(500, 400);
		this.setLocation(300, 200);
		this.setVisible(true);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // 창을 닫으면 알아서 콘솔 터미널에서 종료됨 
		
	}

	public static void main(String[] args) {
//		프로그램 시작 
		Ex11_Frame f = new Ex11_Frame();
		
	}

}
