package am;

import java.awt.Color;

// 클릭할 때마다 생성되는 타원을 의미하는 클래스 
public class Ex1_MyThread extends Thread {
	int x, y;
	int width, height;
	Color bg;
	int Speed;
	
	Ex1_Frame f; // Ex1_Frame안에 있는 p를 접근하여 
				 // 필요할 때 p에게 다시 그림을 그리도록 해야 하기 때문에 
				 // p를 가지고 있는 객체 즉, Ex1_Frame의 주소를 
				 // 현재 객체가 생성될 때 받아야 한다. 
	
	// 생성자에서 x,y좌표를 받아야함 
	public Ex1_MyThread(int x, int y, Ex1_Frame f) {
		width = 100; 
		height = 100;
		this.x = x - (width/2);
		this.y = y - (height/2); // 클릭한 지점을 타원 가운데로 맞추기 위해 
		this.f = f;
		
		int red = (int)(Math.random() * 256);
		int green = (int)(Math.random() * 256);
		int blue = (int)(Math.random() * 256);
		bg = new Color(red, green, blue); // 랜덤 색상
		
		Speed = (int)(Math.random() * 651 + 50); // 50~700사이의 난수발생 
	}
	// Thread가 해야할 일 (메서드 재정의)
	@Override
	public void run() {
		// 현재 스레드는 JPanel의 높이값에서 height(높이)값을 뺀 값까지를
		// y좌표의 한계점으로 본다.
		while(true) { // 무한반복문
			y += 5;
			
			// JPanel의 높이값과 y의 값을 비교 
			// 무한반복을 탈출할지? 말지? 판단!!
			if(y >= f.p.getHeight() - height)
				break; // 무한반복 탈출 스레드 소멸!
				
			// JPanel의 그림을 다시 그리도록 한다.
			f.p.repaint(); // 그림을 다시 그린다.
			
			// 일정시간동안 휴식!
			try {
				Thread.sleep(Speed); // 0.5초 쉬기 
			} catch (Exception e) {
				// TODO: handle exception
			}
		}// while문의 끝 
		// 스레드 소멸 직전?
		// 현재객체가 저장된 ArrayList에서 자신을 삭제
		// 현재객체(this)가 사라져야 하기 때문에 this
		f.al.remove(this); 
	}
	
}
