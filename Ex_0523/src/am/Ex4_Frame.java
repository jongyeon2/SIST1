package am;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex4_Frame extends JFrame {
	
	JPanel p;
	int x = 220;
	int y = 170;
	
	public Ex4_Frame() {
		
		p = new JPanel() {
			// 현재 영역은 JPanel상속받는 익명의 내부클래스 영역 
			@Override
			protected void paintComponent(Graphics g) {
				Image buf = createImage(this.getWidth(), this.getHeight());
				
				Graphics buf_g = buf.getGraphics();
				
				int red = (int)(Math.random()*256);
				int green = (int)(Math.random()*256);
				int blue = (int)(Math.random()*256);
				Color c = new Color(red, green, blue); // 랜덤 색깔 
				buf_g.setColor(c); 
				
				buf_g.fillRect(x, 235, 80, 30); // buf라는 이미지에 사각형을 그린다.
				
				// 사각형이 그려진 이미지 객체를 현재 JPanel을 넣는다.
				g.drawImage(buf, 0, 0, this); 				
			}
		};
		
		add(p); // 화면 가운데에 패널객체 넣기
		
		//화면 구성
		setBounds(300, 100, 500, 400);
		setVisible(true);
		
		//이벤트 감지자
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		// keyAdapter를 상속받는 내부 클래스를 만들어서 감지자로 지정해 준다.
		addKeyListener(new KeyAdapter() {
			
			// 현재 영역은 keyAdapter를 상속받는 익명의 내부 클래스영역이다.
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				switch(keyCode) {
				case KeyEvent.VK_LEFT: // 왼쪽 방향키 
					x -= 5;
					if(x < 0)
						x = 0;
					break;
				case KeyEvent.VK_RIGHT: //오른쪽 방향키
					x += 5;
					if(x > p.getWidth() - 80)
						x = p.getWidth() - 80;
					break;
				}//switch문의 끝 
				p.repaint(); // paintcomponent를 무조건 다시 호출함 
			}
			
		});
	
	}// 생성자의 끝 
	
	
	public static void main(String[] args) {
		new Ex4_Frame();
	}

}
