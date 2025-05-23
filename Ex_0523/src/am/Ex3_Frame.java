package am;

import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex3_Frame extends JFrame {

	JPanel p;
	private String msg = "쌍용교육센터";
	
	// 생성자
	public Ex3_Frame() {
		
		p = new JPanel() {

			@Override
			protected void paintComponent(Graphics g) {
				g.drawString(msg, 10, 50);
			}
		};
		
		this.add(p); // p를 화면 가운데에 추가 
		
		this.setBounds(300, 100, 400, 400);
		this.setVisible(true);
		
		// 이벤트 감지자 등록
		this.addWindowListener(new WindowAdapter() {

			// 현재 영역은 WindowAdapter를 상속받는 이름없는 내부 클래스다.
			// class ?(이름없음) extends WindowAdapter{}
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0); // 프로그램 종료 
			}
		});
		
	}
	
	public static void main(String[] args) {
		// 프로그램 시작 
		new Ex3_Frame();
	}

}
