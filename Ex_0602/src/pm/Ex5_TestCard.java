package pm;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ex5_TestCard extends JFrame implements ActionListener{
	//화면에 쓰일 카드 
	JPanel panel1, panel2; // 화면1, 화면2
	JPanel p1_south_p, s_p1, s_p2, p2_south_p; 
	JTextField name_tf, input_tf;
	JButton sendMessage, login;
	JTextArea textArea;
	ImageIcon image1;
	JLabel image, label;
	
	CardLayout card;
	
	// 서버 접속에 필요한 객체들
	Socket s;
	ObjectInputStream in;
	ObjectOutputStream out;
	
	// 서버로부터 전달되어오는 프로토콜을 받는 스레드
	Thread t = new Thread() {

		@Override
		public void run() {
			// 항상 in.readObject를 수행해야 한다.
			bk: while(true) {
				try {
					Object obj = in.readObject();
					if(obj != null) {
						Ex3_Protocol protocol = (Ex3_Protocol) obj;
						switch(protocol.cmd) {
						case 2: 
							textArea.append(protocol.getMsg());
							textArea.append("\r\n");
							break;
						case 3:
							break bk;
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}// 무한반복 끝
			try {
				if(in != null)
					in.close();
				if(out != null)
					out.close();
				if(s != null)
					s.close();
				System.exit(0); // 프로그램 종료 
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	};
	
	// 생성자 
	public Ex5_TestCard() {
		
		// 현재 창의 레이아웃을 cardlayout으로 지정 
		card = new CardLayout();
		this.getContentPane().setLayout(card); // 현재 객체를 컨테이너로 지정 
		
		//첫번째 화면 작업 
		panel1 = new JPanel(new BorderLayout());
		image1 = new ImageIcon("src/image/icon1.png");
		image = new JLabel(image1);
		panel1.add(image); // 첫번째 화면 가운데에 이미지 표현 
		
		s_p1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		s_p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		s_p1.add(new JLabel("대화명:"));
		s_p1.add(name_tf = new JTextField(8));
		s_p2.add(login = new JButton("    로그인     "));
		
		p1_south_p = new JPanel(new GridLayout(2,1));
		p1_south_p.add(s_p1);
		p1_south_p.add(s_p2);
		
		panel1.add(p1_south_p, BorderLayout.SOUTH);
		
		this.getContentPane().add("chat1",panel1);
		
		//두번째 화면 
		panel2 = new JPanel(new BorderLayout());
		panel2.add(new JScrollPane(textArea = new JTextArea()));
		p2_south_p = new JPanel(new BorderLayout());
		p2_south_p.add(input_tf = new JTextField());
		p2_south_p.add(sendMessage = new JButton("보내기"), BorderLayout.EAST);
		panel2.add(p2_south_p, BorderLayout.SOUTH);
		
		this.getContentPane().add("chat2",panel2);
		
//		card.show(this.getContentPane(),"chat2");
		
		setBounds(300, 100, 400, 500);
		setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// 접속이 안되었다면 프로그램 종료!
				if(s == null)
					System.exit(0);
				else {
					// 프로토콜 생성, cmd에 3저장 후 서버로 프로토콜 전송 
					Ex3_Protocol p = new Ex3_Protocol();
					p.cmd = 3;
					try {
						out.writeObject(p); // 접속 해제를 위한 프로토콜 보내기 
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}
			}
			
		});
		
		login.addActionListener(this); 
		sendMessage.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
		new Ex5_TestCard();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == login){
			// 로그인 버튼을 클릭했을 때 
			String n = name_tf.getText().trim();
			if(n.length() > 0) {
				try {
					// 접속!!!
					s = new Socket("192.168.10.107",5555);
					
					// 나의 복사본(Ex3_CopyClient)이 서버에 들어갔다.
					// 복사본과 통신하기 위해 스트림을 생성하자 
					out = new ObjectOutputStream(s.getOutputStream());
					in = new ObjectInputStream(s.getInputStream());
					
					// in을 계속 read하는 스레드 구동 시켜야 한다. 
					Ex3_Protocol p = new Ex3_Protocol(); // 서버로 보낼 프로토콜 생성
					p.cmd = 1; //접속  
					p.msg = n;
					
					out.writeObject(p); // 서버로 보내기 
					
					
				//대화명을 1자라도 입력한 경우 card 변경 
				card.show(this.getContentPane(),"chat2"); // 2번째 창으로 바꿈 
				t.start();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				
			}else 
				JOptionPane.showMessageDialog(this, "대화명을 입력하세요");
		}
		else if(obj == sendMessage) {
			// 메세지 보내기 눌렀을때
			String chatMessage = input_tf.getText().trim();
			if(chatMessage.length() > 0 ) {
				Ex3_Protocol p = new Ex3_Protocol(); // 서버로 보낼 프로토콜 생성
				p.cmd = 2; //접속  
				p.msg = chatMessage;
				try {
					out.writeObject(p);
					out.flush();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
	}
	
}
