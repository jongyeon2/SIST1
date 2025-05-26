package pm;

import java.awt.Image;

public class Ex3_Bullet extends Thread {
	// 스페이스바를 눌렀을때 생성되는 총알 객체를 의미하는 클래스 
	
	int x, y; // 총알의 위치
	int w = 19, h = 88;
	Image missile;
	
	Ex3_Game g; 
	
	// 생성자 space를 누를때마다 x,y좌표를 구해야 하기 때문에 
	public Ex3_Bullet(Ex3_Game g, int x, int y) {
		this.g = g;
		this.x = x;
		this.y = y;
	}

	@Override
	public void run() {
		// 현재 쓰레드가 해야할 일 (y좌표 감소 - 그림 다시그리기)
		
		// 일정시간동안 쉬면서 y좌표를 감소하는 반복문
		while(true) {
			y -= 5;
			
			// 좌표가 변경되었음으로 그림을 다시 그림 
			g.p.repaint();
			
			if(y < 0)
				break;
			
			try {
				Thread.sleep(20);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}// 무한반복의 끝
		// 스레드가 소멸 직전 g에 있는 AraayList에서 자신을 삭제
		g.al.remove(this);
		g.p.repaint();
	}
	
	
}
