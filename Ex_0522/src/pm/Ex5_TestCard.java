package pm;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		this.addWindowListener(new Ex2_Myadap());		
	
		// 이벤트 감지자
		login.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
		new Ex5_TestCard();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == login){
			
			String n = name_tf.getText().trim();
			if(n.length() > 0) {
				//대화명을 1자라도 입력한 경우 card 변경 
				card.show(this.getContentPane(),"chat2");
			}else 
				JOptionPane.showMessageDialog(this, "대화명을 입력하세요");
		}
	}

}
