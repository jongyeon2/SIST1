package pm;

import javax.swing.JFrame;

public class Ex2_Frame extends JFrame {

	// 생성자
	public Ex2_Frame() {
		
		
		
		setBounds(300, 100, 400, 450);
		setVisible(true);
		
		// 이벤트 감지자 등록
		this.addWindowListener(new Ex2_Myadap());
	}
	
	public static void main(String[] args) {
		// 프로그램 시작
		 new Ex2_Frame();
		
	}

}
