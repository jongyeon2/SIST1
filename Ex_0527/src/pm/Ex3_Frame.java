package pm;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import am.Ex2_Meteor;
import am.Me;

public class Ex3_Frame extends JFrame {
	// 현재 클래스가 필요하는것 
	
	Dimension d = new Dimension(390, 590); // 넓이, 높이 (멤버변수 2개)
	     
	// 필요한 이미지 선언
	Image back_img, me_img;
	JPanel p;
	
	// me객체의 위치와 크기는 me객체의 rect라는 참조변수 안에 있다.
	Me me = new Me();
	
	// 2번째 작업 ------------------------
	Image meteor_img;
	ArrayList<Ex3_Meteor> m_list = new ArrayList<>();
	
		
	// 운석을 주기적으로 생성하여 m_list에 저장하는 스레드 
	Thread makeMeteor = new Thread() {

		@Override
		public void run() {
			// 1초 간격으로 운석객체를 생성하여 m_list에 추가한다.
			// 반드시 p의 paintComponent에서 그림을 그려야 한다.
			// 생성된 운석객체의 스레드를 구동시키면서 마무리
			while(true) {
				// 운석객체 생성 
				Ex3_Meteor m = new Ex3_Meteor(Ex3_Frame.this, 
						meteor_img.getWidth(p), //너비32 - 운석객체 안에 있는 rect에 w로 지정
						meteor_img.getHeight(p)); // 이미지파일의 높이28 - 운석객체 안에 있는 rect에 h로 지정 
				
				// 운석의 x좌표값
				int x = (int)(Math.random() * p.getSize().width - m.rect.width);
				
				m.rect.x = x;
				m.rect.y = -30; // 화면 위에서 시작 
				
				m_list.add(m); // 생성된 운석객체를 ArrayList에 저장(추가)
				m.start(); // 운석객체가 스레드임으로 스스로 움직인다. 
				
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}//while의 끝 
		}
	};
	//===========================================
	
	//세번째 작업 --------------------------------------------
	// 폭발객체(Ex3_Explosion)가 저장될 ArrayList
	ArrayList<Ex3_Explosion> ex_list = new ArrayList<>();
	
	// 폭발이미지들을 배열로 준비 
	Image[] exp_ar = new Image[27];
	// -------------------------------------------------------

	// 총알 작업 
	Image bullet_img;
	ArrayList<Ex3_Bullet> b_list = new ArrayList<>();
	
	// 기본생성자
	public Ex3_Frame() {
		// 이미지 생성
		
		back_img = new ImageIcon("src/images/back.jpg").getImage();
		me_img = new ImageIcon("src/images/me.png").getImage();
		meteor_img = new ImageIcon("src/images/meteor.png").getImage();
		bullet_img = new ImageIcon("src/images/bullet.png").getImage();
		
		// 폭발 이미지들을 만들어 배열에 저장하는 반복문 
		for(int i = 0; i < exp_ar.length; i++) {
			// 반복문 돌때마다 문자열이 만들어짐 
			String img_path = String.format("src/images/exp_enemy_1/exp_%d.png", i+1);
			Image exp = new ImageIcon(img_path).getImage();
			
			// 로드된 이미지객체를 배열에 저장 
			exp_ar[i] = exp;
		}// 폭발이미지 생성 반복문의 끝 
		
		p = new JPanel() { // 익명 내부클래스를 지정해주어야 그림 그리는 기능을 오버라이딩 할 수 있음

			@Override
			protected void paintComponent(Graphics g) {
				// 배경 그리기 
				// 0, 0 panel의 왼쪽 위 모서리 
				g.drawImage(back_img, 0, 0, this); 
				
				// 주인공 그리기 
				g.drawImage(me_img, me.rect.x, me.rect.y, this);
				
				// 2번째 예제에서 추가된 내용 --------------------
				// 운석들을 모두 그리는 반복문 
				for(int i = 0; i < m_list.size(); i++) {
					Ex3_Meteor m = m_list.get(i);
					
					g.drawImage(meteor_img, m.rect.x, m.rect.y, this);
				}//for의 끝
				
				// 총알객체들을 모두 그리는 반복문
				for(int i = 0; i < b_list.size(); i++) {
					//총알객체 하나 얻어내기 
					Ex3_Bullet b = b_list.get(i);
					
					g.drawImage(bullet_img, b.rect.x, b.rect.y, b.rect.height, b.rect.width, this);
				}
				
				// 폭발객체는 모두 ex_list에 저장되어 있다. 이거 하나당 27개의 
				// 이미지를 표현해야 한다. 
				for(int i = 0; i < ex_list.size(); i++) {
					// 폭발객체 하나 얻어내기
					Ex3_Explosion exp = ex_list.get(i);
					
					// 폭발객체 안에 있는 index를 이용하여 
					// exp_ar이라는 배열의 index로 이용한다. 그리고자 하는 이미지를 
					// 가져온다.
					Image img = exp_ar[exp.index];
					g.drawImage(img, exp.pt.x, exp.pt.y, this);
					
					if(exp.move_index()) // true인 경우는 폭발객체가 가지고 있는 index가 
										 // 27이상일 때다. 즉 폭발이 끝났다
										 // 폭발객체를 ex_list에서 삭제한다.
						ex_list.remove(exp);
				}
			} 
		};
		init_game(); //게임초기화 메서드 호출  
					 // 이 메서드를 호출해야 Panel의 사이즈가 지정된다.
		
		init_me_pos(); 
		
		
		this.setLocation(300, 50); //위치
		this.pack(); // 창(JPanel)내부에 들어온 컴포넌트들의 크기에 맞도록 
					 // 현재 창의 사이즈를 설정 우린 창에 JPanel만 추가 함으로
					 // JPanel의 크기를(Dimention)에 맞춘다.
		
		this.setResizable(false); // 창 크기 조정 불가 
		p.setFocusable(true); // 2번째 작업에서 추가된 내용 
		this.setVisible(true); // 창을 보여줌
		
		makeMeteor.start();

		//이벤트 감지자 등록 
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		p.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				int step = 10; // 움직이는 이동값 
				
				switch(keyCode) {
				case KeyEvent.VK_RIGHT:
					me.rect.x = Math.min(me.rect.x + step, p.getWidth() - me.rect.width);
					break;
				case KeyEvent.VK_LEFT:
					me.rect.x = Math.max(me.rect.x - step, 0);
					break; 
				case KeyEvent.VK_SPACE:
					int x = me.rect.x + (me.rect.width/2 - bullet_img.getWidth(p)/2);
					int y = me.rect.y;
					Ex3_Bullet b = new Ex3_Bullet(Ex3_Frame.this, x, y);
					b_list.add(b);
					b.start();
					break;
				}
				p.repaint(); // 좌표가 변경되었음으로 다시 그리기 
			}
		});
	}
	
	// 외부에서 절대 호출하지 않을경우(private)
	// setLocation을 가기전에 이 메서드로 옴 
	private void init_game() {
		// 크기객체(Dimension)을 가지고 JPanel의 크기로 예약하자(지정했다)
		p.setPreferredSize(d);
		
		// 크기가 지정된 JPanel을 현재 창 가운데에 추가
		this.add(p);
	}
	
	private void init_me_pos() {
		// 주인공 이미지의 초기 위치를 지정하는 함수 
		
		// 주인공 이미지의 너비와 높이를 지정하자 
		int imgWidth = me_img.getWidth(this); // 이미지파일이 가지고 있는 너비
		int imgHeight = me_img.getHeight(this); // 이미지파일이 가지고 있는 높이 
		
//		System.out.printf("w:%d, h:%d\r\n", imgWidth, imgHeight);
		
		//Me객체 안에 Rectangle의 x,y,width,height를 지정하자 
		me.rect.x = (d.width - imgWidth)/2;
		me.rect.y = d.height - imgHeight - 5; // imgHeight만 할 경우 너무 붙어있어서 5를 더빼줌
		
		// 캐릭터의 크기 지정 
		me.rect.width = imgWidth; // 여기에 있는 너비와 높이가 없어도 이미지는 표현된다.
		me.rect.height = imgHeight;// rect의 너비와 높이가 필요한 이유는
								   // 운석객체와 주인공 객체가 충돌하는지 알아낼 때 필요하다.
		
	}
	
	public static void main(String[] args) {
		// 프로그램 시작 
		new Ex3_Frame();

	}

}
