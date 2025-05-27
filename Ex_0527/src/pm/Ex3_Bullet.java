package pm;

import java.awt.Rectangle;

public class Ex3_Bullet extends Thread {
	Rectangle rect = new Rectangle();
	
	Ex3_Frame f;
	boolean chk = true;
	
	//생성자
	public Ex3_Bullet(Ex3_Frame f, int x, int y) {
		this.f = f;
		
		rect.x = x;
		rect.y = y;
		rect.width = 10;
		rect.height = 10;
		
	}

	@Override
	public void run() {
		while(chk) {
			rect.y -= 5;
			
		// 화면상단에 도달했는지?
			if(rect.y <= 0)
				break;
		
		try {
			Thread.sleep(20);
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		f.p.repaint();	
		}
		// 무한반복문을 빠져나가면 총알객체가 사라지기 떄문에 지워주어야 함 
		f.b_list.remove(this);
	}
}
