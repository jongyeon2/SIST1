package am;

public class Ex2_Bullet extends Thread {
	// 스페이스바를 눌렀을때 생성되는 총알객체를 의미하는 클래스 
	
	int x, y; //총알의 위치 
	int w = 8, h = 20;
	
	Ex2_Frame f; // 이 주소가 있어야 ArrayList와 JPanel을 접근할 수 있다.  
	
	public Ex2_Bullet(Ex2_Frame f, int x, int y) {
		this.f = f;
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void run() {
		// 현재 쓰레드가 해야할 일 (y좌표 감소 - 그림 다시 그리기)
		
		// 일정 시간동안 쉬면서 y좌표를 감소하는 반복문 
		while(true) {
			y -= 5;
			
			// 좌표가 변경되었음으로 그림을 다시 그리자!
			f.p.repaint();
			
			if(y < 0)
				break; // 무한반복문 유일한 탈출구!
			
			try {
				Thread.sleep(20);
			} catch (Exception e) {}
			
		}// 무한반복의 끝  
		//스레드가 소멸 직전 f에 있는 ArrayList에서 자신을 삭제한다.
		f.al.remove(this);
		f.p.repaint(); 
	}
	
}
