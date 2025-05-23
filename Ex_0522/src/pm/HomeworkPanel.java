package pm;

import java.awt.Graphics;

import javax.swing.JPanel;

public class HomeworkPanel extends JPanel {

	int x = 220; // 시작위치 
	
	@Override
	protected void paintComponent(Graphics g) {
		// 그림을 그리는 동작, Graphics g가 바로 붓과 같은 객체다.
		super.paintComponent(g); // 함수가 호출되면 지우는 함수를 호출한다.
		g.fillRect(x, 235, 80, 30);
	}
	
}
