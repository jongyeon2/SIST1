package pm;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Ex3_MouseMotion extends MouseMotionAdapter {

	Ex3_Frame f; // 생성자에서 인자로 받아서 저장해야 함 
	
	public Ex3_MouseMotion(Ex3_Frame n) {
		// n은 지역변수임으로 곧 사라진다. 그래서
		// 멤버변수에 저장해야함
		f = n;
	}
	
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// 드래그할 때 위치값(x,y)얻기
		int x = e.getX(); // getx(x좌표의값) 얻기
		int y = e.getY();
		
		// 위에서 얻은 x,y값을 JPanel의 x,y에 전달해야 한다.
		// JPanel의 그림을 다시 그리도록 해야 한다. (repaint호출)
		f.p.x = x; 
		f.p.y = y;
		f.p.repaint(); // 위에서 x,y값이 변경되었음으로 그림을 다시 그린다.
	}

	
}
