package pm;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

// 현재 객체는 JFrame으로부터 상속을 받았음으로
// 현재 객체를 생성하는 것이 바로 창틀을 만드는것 과 같다.
public class Ex12_Frame extends JFrame {

//	현재 창 객체가 가지는 모든 것들을 멤버변수로 선언한다.
	private JButton bt1, bt2, bt3; // 버튼 선언 
	
	public Ex12_Frame() {
		setTitle("버튼을 가진 창");
		
//		버튼객체를 생성
		
		bt1 = new JButton("버튼1"); // 버튼1라고 나오는 버튼을 생성 
		bt2 = new JButton("버튼2"); // 버튼2라고 나오는 버튼을 생성 
		bt3 = new JButton("버튼3"); // 버튼3라고 나오는 버튼을 생성 
		
//		현재 창(this)에 추가(add)해야 한다.
		this.add(bt1, BorderLayout.NORTH); // 북쪽 NORTH 영역에 bt1추가 
		this.add(bt2, BorderLayout.CENTER); // 생략도 가능, 
		this.add(bt3, BorderLayout.EAST); // East영역에 bt3 추가 
//		맨 마지막에 추가한 버튼3밖에 표시안됨
		
		setSize(500, 400);
		setLocation(300, 100);
		setVisible(true);
		
//		종료버튼을 클릭할 때 프로그램 종료
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}// 생성자의 끝
	
	public static void main(String[] args) {
//		프로그램 시작 
		Ex12_Frame f = new Ex12_Frame();
	}

}
