package pm;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex6_Mouse extends JFrame implements MouseListener {
	// 멤버변수 선언
	JPanel center_p;
	int count; 
	Color color; //java.awt의 color 타입의 color 변수 선언 
	
	public Ex6_Mouse() {
		center_p = new JPanel();
		this.add(center_p);
		
		this.setBounds(300, 100, 400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		color = center_p.getBackground(); // 배경색 얻기 
		
		//이벤트 감지자 등록 
		center_p.addMouseListener(this);
	}

	public static void main(String[] args) {
		//프로그램 시작
		new Ex6_Mouse();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// 마우스 클릭때 마다 
		this.setTitle(++count + "회 클릭"); // 누를때 마다 제목에 몇회 클릭이 나옴 
		
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
		// center_p에 마우스가 들어가면 수행하는 곳 
		int red = (int)(Math.random()*256); // 0~255까지의 난수 
		int green = (int)(Math.random()*256); // 0~255까지의 난수 
		int blue = (int)(Math.random()*256); // 0~255까지의 난수 
		
		Color c = new Color(red, green, blue); // 랜덤 rgb값이 들어감으로 랜덤 색상 객체가 생성됨 
		// 위에서 만든 색상객체를 center_p의 배경색으로 지정하자 
		center_p.setBackground(c);
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// 마우스가 center_p에서 빠져나오면 수행하는 곳 
		center_p.setBackground(color);
	}

}
