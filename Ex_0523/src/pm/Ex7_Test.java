package pm;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex7_Test extends JFrame {
	JPanel p;
	int x = 220;
	int y = 170;
	int num = 0;
	final int UP = KeyEvent.VK_UP;
	final int DOWN = KeyEvent.VK_DOWN;
	final int RIGHT = KeyEvent.VK_RIGHT;
	final int LEFT = KeyEvent.VK_LEFT;
	
	public Ex7_Test() {
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				// 해당 스레드가 해야할 일 
				while(true) {
					if(num == RIGHT) 
						x +=5;						
					 else if (num == LEFT) 
						x -=5; 
					 else if (num == UP) 
						y -=5; 
					 else if (num == DOWN) 
						y += 5;
					if((x > p.getWidth()-40 || y > p.getHeight() - 40)|| (x < 0 || y < 0)) 
						break;
					 try {
						Thread.sleep(30);
						p.repaint(); // 그림 다시 그리기 
					    } catch (Exception e) {
							// TODO: handle exception
						}
					}
				}//무한 반복 끝, 벽에 닿으면 소멸 
		};
		
		p = new JPanel() {
			
			@Override
			protected void paintComponent(Graphics g) {
				Image buf = createImage(this.getWidth(), this.getHeight()); // 현재 panel과 똑같은 크기로 만듬
				
				Graphics buf_g = buf.getGraphics(); // 이미지에 그리는 전용 붓 
				buf_g.setColor(Color.black);
				
				buf_g.fillRect(x, y, 40, 40); // 이미지 객체에 사각형을 그렸다.
				
				// 사각형이 그려진 이미지를 JPanel에 넣기 
				g.drawImage(buf, 0, 0, this); // 여기서 this는 JPanel을 상속받는 익명 객체를 의미한다.
			}
		};
		
		this.add(p);
		
		setBounds(300, 100, 500, 400);
		setVisible(true);
		
		// 이벤트 감지자 등록 
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// 스페이스키만 선별 
				int keyCode = e.getKeyCode();
					if(keyCode == KeyEvent.VK_SPACE) {
						num = (int)(Math.random() * 4 + 37);
						t1.start();						
					}else if(keyCode == KeyEvent.VK_UP) {
						num = 38;
					}else if(keyCode == KeyEvent.VK_DOWN) {
						num = 40;
					}else if(keyCode == KeyEvent.VK_LEFT) {
						num = 37;
					}else if (keyCode == KeyEvent.VK_RIGHT) {
						num = 39;
					}
			}
		});
		
	}
	
	public static void main(String[] args) {
		// space를 누르는 순간 키보드 4방향중 한방향을 랜덤으로 지정 
		new Ex7_Test();
	}

}
