package pm;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class Ex8_Test extends JFrame implements MouseListener {
//	멤버변수 선언
	JPanel north_Jp, center_Jp;
	JButton[] bt_ar = new JButton[8];
	JTextArea ta;
	
	
//	기본생성자
	public Ex8_Test() {
		north_Jp = new JPanel();
		center_Jp = new JPanel();
		ta = new JTextArea();
		
//	button객체에 숫자 넣기
		for(int i = 0; i < bt_ar.length; i++) {
			bt_ar[i] = new JButton(String.valueOf(i+2));
		}
				
//		north 나무 판자에 버튼 8개를 넣는다.	
	for(int k = 0; k < bt_ar.length; k ++) {
		north_Jp.add(bt_ar[k]);
	}
	
//	for문을 이용해서 감시자를 각 버튼에 넣어주는 메서드
	for(int l = 0; l <bt_ar.length; l ++) {
		bt_ar[l].addMouseListener(this);
	}
//		jpanle의 위치를 지정
		this.add(north_Jp,BorderLayout.NORTH);
		this.add(ta,BorderLayout.CENTER);
		
//		화면의 크기 창
		setBounds(300, 100, 500, 500); // setSize + setLocation을 합친 메서드 
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// 생성자의 끝 
	
	
	public static void main(String[] args) {
	new Ex8_Test();
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// 마우스 클릭하면 나오는 이벤트
		Object obj = e.getSource();
		int number;
		if(obj instanceof JButton)
			((JButton) obj).getText();
		

		
//		for (int i = 0; i < bt_ar.length; i++) {
//			int j = i + 2;
//				for(int k =1; k<=9; k++) {
//					if(obj == bt_ar[i]) {
//						StringBuffer sb = new StringBuffer();
//						sb.append(j);
//						sb.append("단\r\n");
//						sb.append(j);
//						sb.append("x");
//						sb.append(k);
//						sb.append("=");
//						sb.append(j * k );
//						sb.append("\r\n");
//						
//						ta.append(sb.toString());
//					}
//				}
//		}
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
