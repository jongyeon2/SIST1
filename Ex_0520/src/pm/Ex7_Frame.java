package pm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex7_Frame extends JFrame implements ActionListener{
//  창의 멤버변수 선언
	JPanel north_Jp, center_Jp;
	JButton bt1, bt2, bt3;

//	기본생성자
	public Ex7_Frame() {
		north_Jp = new JPanel();
		center_Jp = new JPanel();
		bt1 = new JButton("Red"); 
		bt2 = new JButton("Green");
		bt3 = new JButton("Blue");
		
//		north_Jp 나무판자에 버튼을 넣어주었다.
		north_Jp.add(bt1);
		north_Jp.add(bt2);
		north_Jp.add(bt3);
		
//		north_Jp와 center_JP 를 각 영역에 넣어준다.
//		각 영역에는 하나밖에 넣어줄 수 없다.
		this.add(north_Jp,BorderLayout.NORTH);
		this.add(center_Jp,BorderLayout.CENTER);
		
//		창의 크기, 창이 나오는 위치, 창이 보이니?, 창 종료 
//		setSize(500, 500);
//		setLocation(300, 100);
		
		setBounds(300, 100, 500, 500); // setSize + setLocation을 합친 메서드 
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		이벤트 감지자등록 
//		현재 객체에서 ActionListener인터페이스의 메소드가 있음으로 
		bt1.addActionListener(this); // 이 객체(this)가 actionlistener를 구현하고 있기 떄문에 
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		
	}// 생성자의 끝 
	
	public static void main(String[] args) {
//		프로그램 시작 
//		Ex7_Frame f = new Ex7_Frame();

		
//		참조변수인f가 한번도 안쓰였기 때문에 
//		new 연산자와 생성자로 호출만해주면 된다.
		new Ex7_Frame(); 
		
//		버튼을 누를 때 가운데 있는 패널 색이 바뀌는 기능을 구현하고 싶다.
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		이벤트가 발생할 때마다 수행하는 곳!
//		이벤트를 발생시킨 객체를 알아낸다.
		Object obj = e.getSource();
		
		if(obj == bt1) {
			center_Jp.setBackground(Color.RED);
		}else if (obj == bt2) {
			center_Jp.setBackground(Color.GREEN);
		}else {
			center_Jp.setBackground(Color.BLUE);
		}
		
	}

}
