package am;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex2_FlowLayout extends JFrame implements ActionListener {
	// 멤버변수
	JPanel north_p;
	JButton bt1, bt2, bt3;
	
	// 기본생성자
	public Ex2_FlowLayout() { // 이와 같은 생성자는 객체가 생성될 때 단 한번 호출되면서 
							  // 멤버변수들에 대한 초기화를 목적으로 한다.
		north_p = new JPanel();
		bt1 = new JButton("Left");
		bt2 = new JButton("Center");
		bt3 = new JButton("Right");
		
	    // 버튼 3개를 JPanel에 넣어준다. 
		north_p.add(bt1);
		north_p.add(bt2);
		north_p.add(bt3);
		
		
		// 버튼 3개를 가지는 north_p를 현재 창의 N
		this.add(north_p, BorderLayout.NORTH);
		
		setBounds(300, 100, 500, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료할 때 뒤처리를 못한다.
		
		// 이벤트 감지자 등록, 
		bt1.addActionListener(this); // 인자는 ActionListener를 구현한 객체의 주소가 들어가야한다.
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		
	}// 생성자의 끝 
	
	
	
	public static void main(String[] args) {
	// 프로그램 시작
		new Ex2_FlowLayout();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 각 버튼을 클릭할 떄마다 수행하는곳 
		String str = e.getActionCommand(); // 클릭한 버튼의 문자열을 얻어낸다.
		if(str.equals("Left")) {
			// 버튼들을 왼쪽맞춤 수행 
			FlowLayout fl = new FlowLayout(FlowLayout.LEFT); // 왼쪽 맞춤하는 레이아웃을 만듬 
			
			// 위에서 만든 레이아웃을 다시 north_p에 적용시키자
			north_p.setLayout(fl);
			north_p.updateUI(); // UI를 업데이트해서 다시 읽자 
		} else if(str.equals("Right")) {
			FlowLayout fl = new FlowLayout(FlowLayout.RIGHT);
			
			north_p.setLayout(fl);
			north_p.updateUI();
		} else if(str.equals("Center")) { // 대,소문자 구분없이 비교
			FlowLayout fl = new FlowLayout(FlowLayout.CENTER);
			
			north_p.setLayout(fl);
			north_p.updateUI();
		}
			
	}

}
