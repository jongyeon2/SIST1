package am;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Formatter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Ex1_Gugudan extends JFrame implements ActionListener{

	// 현재 창에서 필요한 객체들을 모두 멤버로 선언
	JPanel north_p;
	JButton[] buttonAr;
	JTextArea textArea;
	
	// 생성자
	public Ex1_Gugudan() {
		north_p = new JPanel(); 
		buttonAr = new JButton[8];
		for(int i = 0; i < buttonAr.length; i++) {
			buttonAr[i] = new JButton(String.valueOf(i+2)); 
			
			// 생성된 버튼객체 각각에 이벤트 감지자 등록 
			north_p.add(buttonAr[i]);
			
			//현재 객체가 ActionListener를 구현하고 있기 떄문에 this를 넣어준다.
			buttonAr[i].addActionListener(this);
			
			
		}// for문의 끝
		
		//현재 창 north 영역에 north_p를 추가한다.
		this.add(north_p, BorderLayout.NORTH);
		
		// 현재 창 가운데에 textArea를 추가한다. 이때 스크롤도 적용해야 함
		JScrollPane jp = new JScrollPane(textArea = new JTextArea());
		this.add(jp);
		
		setBounds(300, 100, 500, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	
	public static void main(String[] args) {
		new Ex1_Gugudan();
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// 현재 이벤트를 발생시킨 객체의 문자열을 얻어낸다.
		String str = e.getActionCommand();
		int dan = Integer.parseInt(str);

		StringBuilder sb = new StringBuilder(str);
		sb.append("단\r\n")
		  .append("-------------------\r\n");
		
//		formatter가 stringbuffer를 가지고 있다.
		Formatter formatter = new Formatter(sb);
		for(int i = 1; i < 10; i++) {
			formatter.format("%d*%d=%d\r\n", dan, i, dan * i);		}
		/*
		for(int i = 1; i < 10; i ++) {
			sb.append(str)
			  .append("*")
			  .append(String.valueOf(i))
			  .append("=")
			  .append(String.valueOf(dan*i))
			  .append("\r\n");
		}
		*/
		textArea.setText(sb.toString());
		
//		textArea.setText(str);
//		textArea.append("단\r\n");
//		textArea.append("-----------------\r\n");
//		for(int i = 1; i < 10; i ++) {
//			textArea.append(str);
//			textArea.append("*");
//			textArea.append(String.valueOf(i));
//			textArea.append("=");
//			textArea.append(String.valueOf(dan*i));
//			textArea.append("\r\n");
//		}
	}

}
