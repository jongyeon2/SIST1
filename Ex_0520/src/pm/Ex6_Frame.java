package pm;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class Ex6_Frame extends JFrame implements MouseListener {
	
//	this(현재 객체)
	
//	현재 창에 들어가는 모든 것들을 멤버로 선언
	JPanel north_p; // 북쪽에 들어가는 나무 판자 
	JButton bt1, bt2, bt3;
	JTextArea ta; //메모장같은 텍스트를 쓸 수 있는 박스 
	
//	생성자 
	public Ex6_Frame() {
		north_p = new JPanel();
		bt1 = new JButton("Red"); // 빨간색 버튼
		bt2 = new JButton("Green"); // 초록색
		bt3 = new JButton("Blue"); // 파란색 
		ta = new JTextArea();
	
//		위에서 생성한 객체들을 배치시켜야 한다.
//		먼저 north영역에 들어갈 버튼들을 north_p에 추가 
		
		north_p.add(bt1); //north_p판자에 버튼 3개를 추가 
		north_p.add(bt2);
		north_p.add(bt3);
		
//		현재창 North영역에 north_p를 추가한다.
		this.add(north_p, BorderLayout.NORTH); // NORTH영역에 north_p를 추가한다.
		
//		스크롤바의 역활을 하는 객체 생성
		JScrollPane jp = new JScrollPane(ta);
		this.add(jp, BorderLayout.CENTER); // 명시하지 않으면 가운데에 
		
//		이벤트 감지자 등록(무조건 생성자 안에서)
		bt1.addMouseListener(this);
		bt2.addMouseListener(this);
		bt3.addMouseListener(this);

//		창 사이즈, 창이 뜨는 위치, 창이 보이니?"ture", 화면을 닫을때 알아서 종료됨 
		setSize(500, 500);
		setLocation(300, 100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
//		프로그램 시작 
		Ex6_Frame f = new Ex6_Frame();
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// 마우스 버튼을 누를 때마다 호출하여 수행하는 곳
		
//		이벤트를 발생시킨 객체를 얻어낸다.
//		obj가 이벤트를 발생시킨 객체이다.
//		아니면 obj에 있는 string의 toString()을 오버라이딩한다면?
		Object obj = e.getSource();	 	
		
//		obj주소와 bt1의 주소값 비교 
		if(obj == bt1) { 
//			이벤트를 발생 시킨 객체가 bt1이니?
			ta.append("Red\r\n");
		} else if (obj == bt2) {
			ta.append("Green\r\n");
		} else {
			ta.append("Blue\r\n");
		}
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
