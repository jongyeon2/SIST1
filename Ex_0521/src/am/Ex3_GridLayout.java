package am;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex3_GridLayout extends JFrame {
	// GridLayout은 
	
	//멤버 변수 
	JButton[] button = new JButton[5];
	GridLayout gl;	// 레이아웃을 멤버변수로 선언
	JPanel center_p;
	
	// 생성자 
	public Ex3_GridLayout() {
		center_p = new JPanel();
		gl = new GridLayout(3, 3, 20, 20); // 3행 3열 즉, 9개의 셀이 만들어진다. 
										   // 10, 10 박스 사이의 간격이 벌려진다.
		
		center_p.setLayout(gl); // 기본레이아웃이 FlowLayout이었던 것을 GridLayout으로 변경 
		
		for(int i = 0; i < button.length; i ++) {
			button[i] = new JButton(String.valueOf(i+1));
			center_p.add(button[i]); // center_p에 버튼 객체를 추가 
		}
		
		for(int i = 0; i < 3; i++) { // 3행 3열의 모양을 유지하기 위해 공백을 JLabl로 만들어서 추가하는 반복문
			center_p.add(new JLabel()); 
		}
		
		// 창 가운데에 jpanel을 추가 
		this.add(center_p);
		
		setBounds(300, 100, 500, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// 프로그램 시작 
		new Ex3_GridLayout();
	}

}
