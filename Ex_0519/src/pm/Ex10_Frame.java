package pm;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class Ex10_Frame extends JFrame {

//	JFrame 클래스를 상속 받은 클래스 
	
	public static void main(String[] args) {
//		프로그램 시작 
		
//		현재객체 생성 
		Ex10_Frame frame = new Ex10_Frame();
		frame.setSize(500, 400); //창 크기 설정 메서드 int형
		frame.setLocation(300, 200); // 창 위치 설정 
		frame.setVisible(true); // 창 보여주기 
	
		
	}
	

}
