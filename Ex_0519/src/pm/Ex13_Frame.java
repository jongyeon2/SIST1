package pm;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex13_Frame extends JFrame {
	
	private JButton bt1, bt2, bt3, bt4, bt5; 

	public Ex13_Frame() {
		setTitle("5개의 버튼을 가진 창"); // 창의 이름 
		
		bt1 = new JButton("버튼1");
		bt2 = new JButton("버튼2");
		bt3 = new JButton("버튼3");
		bt4 = new JButton("버튼4");
		bt5 = new JButton("버튼5");
		
		this.add(bt1, BorderLayout.NORTH); // 버튼 1을 북쪽으로 
		this.add(bt2, BorderLayout.SOUTH); // 버튼 1을 남쪽으로 
		this.add(bt3, BorderLayout.WEST); // 버튼 1을 북쪽으로 
		this.add(bt4, BorderLayout.EAST); // 버튼 1을 북쪽으로 
		this.add(bt5, BorderLayout.CENTER); // 버튼 1을 북쪽으로
		
		setSize(600, 700);
		setLocation(300, 100);
		setVisible(true);
		
//		종료버튼을 클릭할 때 프로그램 종료
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
	}// 생성자 
	public static void main(String[] args) {
		Ex13_Frame frame = new Ex13_Frame();
	}

}
