package pm;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

public class Ex4_Dialog extends JDialog implements WindowListener, ActionListener {
	
	JButton redBt, greenBt, blueBt;
	JPanel dialogP;
	Ex4_Frame f; 
	
	// Ex4_Frame을 인자로 받으며 주소를 준다.
	public Ex4_Dialog(Ex4_Frame n) {
		f = n;
		
		// 화면 구성 
		dialogP = new JPanel();
		dialogP.add(redBt = new JButton("Red"));
		dialogP.add(greenBt = new JButton("Green"));
		dialogP.add(blueBt = new JButton("Blue"));
		
		this.add(dialogP); // 현재창 가운데에 panel 추가

		setBounds(400, 150, 250, 160);
		setVisible(true);
		
		// 종료 이벤트 
		this.addWindowListener(this);
		redBt.addActionListener(this);
		greenBt.addActionListener(this);
		blueBt.addActionListener(this);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// 종료버튼 클릭할 때 호출되는 곳 
		this.dispose(); // 현재 대화창 객체만 메모리에서 삭제(dispose())
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 이벤트가 발새한 버튼객체 얻어내기 
		Object obj = e.getSource();
		if(obj == redBt)
			f.centerP.setBackground(Color.red);
		else if(obj == greenBt)
			f.centerP.setBackground(Color.green);
		else if(obj == blueBt)
			f.centerP.setBackground(Color.BLUE);		
	}
	
}
