package pm;

import javax.swing.JFrame;

public class Ex6_Homework extends JFrame {
	
	HomeworkPanel p;
	
	// 생성자 
	public Ex6_Homework() {
	
		this.add(p = new HomeworkPanel());
		
		//창 만들기
		setBounds(300, 100, 500, 400);
		setVisible(true);
		
		// 이벤트 감지자 등록
		this.addWindowListener(new TestWindowAdap());
		this.addKeyListener(new TestKeyAdap(this));
	}

	public static void main(String[] args) {
		// 프로그램 시작
		new Ex6_Homework();

	}

}
