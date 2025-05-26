package pm;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex3_Game extends JFrame {
	JPanel p; // 화면 나오는 것
	Image background, gunship, missile;
	int bgy; // 0
	int shipx = 250; 
	int shipy = 600; // 비행기 위치
	int bgHeigth;
	
	// 스페이스바를 누를 때 마다 생성되는 총알 객체(thread)를 저장할 ArrayList
	ArrayList<Ex3_Bullet> al = new ArrayList<>();
	
	// 배경을 움직이게 하는 thread
	Thread t = new Thread() {

		@Override
		public void run() {
			// 계속 돌아야함 
			while(true) {
				p.repaint(); // paintComponent가 호출되며, 여기서 bgy가 증가한다.

				// 배경 위치 업데이트
				// 아래 오버라이딩 구간에 있으면 repaint()로 다시 계속 그려주기 때문에
				// 스레드 블록안에 옮겼음 
				bgy += 2;
				if(bgy >= bgHeigth) // 화면 아래에 도달한 경우 
					bgy = 0; // 다시 초기값 0을 넣어서 위로 올린다.
				try {
					Thread.sleep(30);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}// 무한반복 
		}
		
	}; // thread의 끝 
	
	// 생성자
	public Ex3_Game() {
		
		// 비행기와 우주의 이미지를 얻어옴 imageicon으로
		background = new ImageIcon("src/images/space.jpg").getImage();
		gunship = new ImageIcon("src/images/gunship.png").getImage();
		missile = new ImageIcon("src/images/missile.png").getImage();
		
		this.add(p = new JPanel(){
			
			@Override
			protected void paintComponent(Graphics g) {
				// 더블 버퍼링 기법을 사용 - 현 JPanel과 같은 크기의 Image객체를 준비
				Image buf = createImage(this.getWidth(), this.getHeight());
				
				// 준비된 이미지 객체에만 그림을 그릴 수 있는 붓 
				Graphics buf_g = buf.getGraphics();
				
				// 배경 그리기 
				bgHeigth = background.getHeight(this); // 배경이미지의 높이값
				buf_g.drawImage(background, 0, bgy, getWidth(), bgHeigth, null );
				buf_g.drawImage(background, 0, bgy-bgHeigth, getWidth(), bgHeigth, null );
				
				// 건쉽 그리기 
				buf_g.drawImage(gunship, shipx, shipy,	60, 60, null);
				
				// 총알 그리기 
				for(int i = 0; i < al.size(); i++) {
					Ex3_Bullet b = al.get(i);
					
					buf_g.drawImage(missile, b.x,b.y,this);
				}
				
				
				// 화면에 나타내기 위해 이미지를 패널에 붙여넣는다.
				g.drawImage(buf, 0, 0, this);
				
			}
			
		});
		
		add(p);
		
		this.setBounds(300, 100, 600, 800);
		p.setFocusable(true); // 화면이 무조건 활성화 
		
		this.setVisible(true);
		
		
		t.start(); //배경 움직이는 스레드 시작

		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0); // 프로그램 종료 
			}
		
		});
		p.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				// 사용자가 누른 키의 값을 얻어내기
				int keyCode = e.getKeyCode();
				int step = 5; // 한번 움직이는 이동값 
				switch(keyCode) {
					case KeyEvent.VK_LEFT :
						// max() 둘중 최대값을 반환하는 
						// 0보다 크면 shipx 변수에 저장됨 
						shipx = Math.max(shipx - step, 0);
						break;
					case KeyEvent.VK_RIGHT:
						shipx = Math.min(shipx + step, p.getWidth() - 60);
						break;
					case KeyEvent.VK_UP:
						shipy = Math.max(shipy - step, 0);
						break;
					case KeyEvent.VK_DOWN:
						shipy = Math.min(shipy + step, p.getHeight() - 60);
						break;
					case KeyEvent.VK_SPACE:
						// shipx 라고 지정하면 비행기의 왼쪽에서 나감
						// 비행선의 길이의 반값을 더해주면
						Ex3_Bullet b = new Ex3_Bullet(
								Ex3_Game.this, shipx +(gunship.getWidth(p)/2 - (19/2)), shipy);
						al.add(b); // ArrayList에 추가 
						b.start();
						break;
				}
				p.repaint(); // 비행선의 좌표가 변경되었으니 그림을 다시 그린다.
			}
			
		});
	}// 생성자의 끝 
	
	public static void main(String[] args) {
		// 프로그램 시작 
		new Ex3_Game();
	}

}
