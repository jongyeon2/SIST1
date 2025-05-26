package am;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex2_Frame extends JFrame {
	// 필요한 것들 
	JPanel p; // 화면 나오는것 
	int w = 80; // 상자의 너비
	int h = 30; // 상자의 높이 
	int x, y; // 상자의 위치 
	
	// 스페이스바를 누를 때 마다 생성되는 총알 객체(thread)를 저장할 ArrayList
	ArrayList<Ex2_Bullet> al = new ArrayList<>();
	
	public Ex2_Frame() {
		this.add(p = new JPanel() {

			@Override
			protected void paintComponent(Graphics g) {
				//더블 버퍼링 기법을 사용 - 현 JPanel과 같은 크기의 Image객체를 준비하자 
				Image buf = createImage(this.getWidth(), this.getHeight());
				
				// 준비된 이미지 객체에만 그림을 그릴 수 있는 붓 
				Graphics buf_g = buf.getGraphics();
				
				// 상자 그리기
				buf_g.fillRect(x, y, w, h); // 상자의 위치, 높이, 넓이
				
				// 총알들 그리기 위해 필요한 반복문 
				for(int i = 0; i < al.size(); i++) {
					//총알 객체를 ArrayList로부터 하나씩 얻어내어 변수에 저장하자
					Ex2_Bullet b = al.get(i);
					
					// 얻어낸 총알을 그린다.
					// b가 가지고있는 위치 높이, 넓이
					buf_g.fillRect(b.x, b.y, b.w, b.h);
				}
				// 이렇게 그려진 Image를 다시 현 JPanel에 이미지를 넣는다.
				g.drawImage(buf, 0, 0, this);
			}
			
		});
		
		this.setBounds(300, 100, 600, 500);
		p.setFocusable(true); // p가 무조건 활성화가 됨 
		
		this.setVisible(true); // 창 보여주기 
		// 상자의 위치를 잡아주기 위해 setVisible 이후에 x,y좌표를 지정해야 한다.
		x = p.getWidth()/2 - w/2; // 화면의 정 가운데에다 놓기위한 수식
		y = p.getHeight() - (h+10); // 5를 추가해서 상자의 위치를 좀더 위로 올림 
		
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0); // 프로그램 종료 
			}
			
		});
		
		p.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				// 먼저 사용자가 누른 키의 값을 얻어내기
				int keyCode = e.getKeyCode();
				switch(keyCode) {
					case KeyEvent.VK_SPACE :  
						// 스페이스바를 누를때 마다 어떤걸 할거니?
						// 상자의 x와 y좌표 
						Ex2_Bullet b = new Ex2_Bullet(Ex2_Frame.this, x + 35, y);
					
						// 생성된 총알객체를 ArrayList에 저장 
						al.add(b);
						
						// 총알은 스스로 올라가기 위해 Thread로 부터 상속받았다.
						b.start(); // 스레드 구동
						break;
					case KeyEvent.VK_RIGHT: // 오른쪽 방향키를 눌렀을때
						x += 5;
						if(x > p.getWidth() - w)
							x = p.getWidth()-w;
						break;
					case KeyEvent.VK_LEFT: // 왼쪽 방향키를 눌렀을때
						x -= 5;
						if(x < 0) 
							x = 0;
						break;
				}//switch의 끝
				p.repaint(); // 그림 다시 그리기 
			}
			
		});
		
	}// 생성자 
	
	
	public static void main(String[] args) {
		// 프로그램 시작
		new Ex2_Frame();

	}

}
