package pm;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TestKeyAdap extends KeyAdapter {
	
	Ex6_Homework f; // 이곳에 반드시 Homework을 받아야하는 것은 아니다.
	// 즉, 필요한 객체의 변수를 선언해도 된다. 다시 말해서 
	// HomewokrPanel을 선언해도 된다. 
	
	public TestKeyAdap(Ex6_Homework f) {
		this.f = f;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// 키를 누를때마다 호출되는곳 
		// 이때 왼쪽, 오른쪽 방향키만 선별하자! 
		int keyCode = e.getKeyCode();  // key의 코드값을 얻는 메서드 
		
		switch(keyCode) {
		case KeyEvent.VK_LEFT:
			// HomeworkPanle 안에 있는 x의 값을 5정보 뺴준다.
			f.p.x -= 5;
			if(f.p.x < 0)
				f.p.x = 0;
			break;
		case KeyEvent.VK_RIGHT:
			f.p.x += 5;
			if(f.p.x > f.p.getWidth()-80)
				f.p.x = f.p.getWidth()-80;
			break;
		}// switch의 끝 
		f.p.repaint(); // x좌표가 변경되었으니 그림을 다시 그린다. 
	
	}
	
	
}
