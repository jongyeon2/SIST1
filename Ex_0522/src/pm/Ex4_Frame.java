package pm;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex4_Frame extends JFrame implements ActionListener{
	JPanel northP, centerP;
	JButton	bt;
	
	public Ex4_Frame() {
		
		// 화면구성
		northP = new JPanel();
		northP.add(bt = new JButton("색상"));
		this.add(northP, BorderLayout.NORTH);
		
		this.add(centerP = new JPanel()); // panel을 만들어 줌과 동시에 중앙으로 배치 
		
		setBounds(300, 100, 450, 450);
		setVisible(true);
		
		// 이벤트 감지자 
		this.addWindowListener(new Ex2_Myadap()); // windowlistner의 기능을 구현한 클래스를 인자(new Ex2_Myadap)로 넣어줌 
		bt.addActionListener(this); // 이 창에서 bt라는 감지자
		
	}
	
	
	public static void main(String[] args) {
	// 프로그램 시작 
		new Ex4_Frame();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// 색상 버튼을 클릭할 때마다 수행하는 곳 
		new Ex4_Dialog(this); // 버튼을 클릭할 때 Dialog를 생성한다.
		
		
	}

}
