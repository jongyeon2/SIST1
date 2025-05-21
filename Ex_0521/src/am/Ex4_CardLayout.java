package am;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex4_CardLayout extends JFrame implements ActionListener {
	//화면에 쓰일 카드
	JPanel card1, card2;
	ImageIcon icon1, icon2;
	JButton bt1, bt2; 
	CardLayout cl; 
	
	public Ex4_CardLayout() {
		//첫번째 화면 작업
		card1 = new JPanel();
		JLabel lb = new JLabel("첫번째 화면"); 
		card1.add(lb); // 카드1에 레이블을 넣었다.
		icon1 = new ImageIcon("src/images/1.gif"); 
		JLabel lb2 = new JLabel(icon1);
		card1.add(lb2); // 매개변수가 아이콘인것이 들어가야함 
		
		bt1 = new JButton("다음");
		card1.add(bt1); // 카드1에 버튼이 들어감 
		
		//두번째 화면 작업
		card2 = new JPanel();
		JLabel lb3 = new JLabel("두번째 화면"); 
		card2.add(lb3); // 카드2에 레이블을 넣었다.
		icon2 = new ImageIcon("src/images/2.gif"); 
		JLabel lb4 = new JLabel(icon2);
		card2.add(lb4); // 매개변수가 아이콘인것이 들어가야함 
		
		bt2 = new JButton("이전");
		card2.add(bt2); // 카드1에 버튼이 들어감 
		
		// 현재 창의 레이아웃(borderlayout)을 카드레이아웃으로 변경한다.
		cl = new CardLayout();
		this.getContentPane().setLayout(cl); // getContentpane(담는 객체로 변경후), setLayout으로 변경 
		
		// 현재 창 안에 각 카드를 등록한다.
		this.getContentPane().add("card1",card1); // card1이라는 이름으로 card1을 추가한다.
		this.getContentPane().add("card2",card2); // card1이라는 이름으로 card2을 추가한다.
		
		// cardlayout클래스 안에 있는 함수 show
		cl.show(this.getContentPane(), "card2"); // card2라는 이름으로 저장된 카드를 보고싶다라는 의미 
		
		
		// 버튼에 감지자 를 추가 
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		
		setBounds(300, 100, 500, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	public static void main(String[] args) {
		//프로그램 시작
		new Ex4_CardLayout();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource(); // 이벤트를 발생시킨 버튼객체를 가져온다.
		
		if(obj == bt1 ) {
			// 카드를 두 번째 카드로 변경한다.
			cl.show(this.getContentPane(), "card2");
		}else if(obj == bt2){
			cl.show(this.getContentPane(), "card1");
		}
		
	}

}
