package pm;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class Ex9_Emp extends JFrame implements ActionListener{
	
	JPanel west_p, south_p, p1, p2, p3, p4;
	JTextField empno_tf, enam_tf, pos_tf, dept_tf;
	JButton total_bt, add_bt, search_bt, del_bt, cancel_bt;
	JTextArea ta;
	
	final int TOTAL = 1;
	final int ADD = 2;
	final int SEARCH = 3;
	final int DEL = 4;
	final int CANCEL = 0;
	
	int cmd; // 현재 눌려진 버튼값을 저장할 곳 
	
	public Ex9_Emp () {
		
		south_p = new JPanel(new FlowLayout(FlowLayout.RIGHT)); //panel을 생성하면서 오른쪽 정렬 
		south_p.add(total_bt = new JButton("전체"));
		south_p.add(add_bt = new JButton("추가"));
		south_p.add(search_bt = new JButton("검색"));
		south_p.add(del_bt = new JButton("삭제"));
		south_p.add(cancel_bt = new JButton("취소"));
		
		// 현재 창 south영역에 south_p를 추가 
		this.add(south_p, BorderLayout.SOUTH);
		
		west_p = new JPanel(new GridLayout(6, 1));
		west_p.add(new JLabel()); // 첫번째 칸에 빈공간 삽입 
		// 2번째 셀에는 사번:________이 들어가는 p1을 만들어야 한다.
		p1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p1.add(new JLabel("사번: "));
		p1.add(empno_tf = new JTextField(8)); // 8칸 입력할 수 있는 text필드 
		west_p.add(p1);
		
		// 3번째 셀에는 사번:________이 들어가는 p1을 만들어야 한다.
		p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p2.add(new JLabel("이름: "));
		p2.add(enam_tf = new JTextField(8)); // 8칸 입력할 수 있는 text필드 
		west_p.add(p2);
		
		// 4번째 셀에는 사번:________이 들어가는 p1을 만들어야 한다.
		p3 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p3.add(new JLabel("직책: "));
		p3.add(pos_tf = new JTextField(8)); // 8칸 입력할 수 있는 text필드 
		west_p.add(p3);
		
		// 5번째 셀에는 사번:________이 들어가는 p1을 만들어야 한다.
		p4 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p4.add(new JLabel("부서: "));
		p4.add(dept_tf = new JTextField(8)); // 8칸 입력할 수 있는 text필드 
		west_p.add(p4);
		
		this.add(west_p, BorderLayout.WEST);
		this.add(new JScrollPane(ta = new JTextArea())); // 가운데 추가 
		
		setBounds(300, 100, 500, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		// 이벤트 감지자 등록 
		total_bt.addActionListener(this);
		add_bt.addActionListener(this);
		search_bt.addActionListener(this);
		del_bt.addActionListener(this);
		cancel_bt.addActionListener(this);
		
	}
	
	public void setButton() { 
		//각 버튼을 눌렀을때 비활성화 되는 버튼을 구현하는 함수 
		add_bt.setEnabled(false);
		total_bt.setEnabled(false);
		search_bt.setEnabled(false);
		del_bt.setEnabled(false);
		
		switch(cmd) {
			case ADD :
				add_bt.setEnabled(true);
				break;
			case SEARCH :
				search_bt.setEnabled(true);
				break;
			case DEL :
				del_bt.setEnabled(true);
				break;
			case CANCEL : 
				add_bt.setEnabled(true);
				total_bt.setEnabled(true);
				search_bt.setEnabled(true);
				del_bt.setEnabled(true);
		}
	}
	
	public void viewData() { // 수행했던 버튼을 같이 눌렀을 경우 
		cmd = 0;
		// 데이터를 불러서 ta에 표현했다
		setButton();
	}
	
	
	public static void main(String[] args) {
		new Ex9_Emp();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 각 버튼을 클릭할 떄 수행하는 곳 
		Object obj = e.getSource();
		
		if(obj == total_bt) {
			// 전체 버튼을 눌렀을때 
		
		}else if(obj == add_bt) {
			if(cmd == ADD) 
				viewData();
			else {
				cmd = ADD; 
				setButton();
			}
		}else if(obj == search_bt) {
			if(cmd == SEARCH)
				viewData();
			else {
				cmd = SEARCH;
				setButton();
			}
		}else if(obj == del_bt) {
			if(cmd == DEL)
				viewData();
			else {
				cmd = DEL;
				setButton();
			}			
		}else {
			add_bt.setEnabled(true);
			total_bt.setEnabled(true);
			search_bt.setEnabled(true);
			del_bt.setEnabled(true);
		} 
		
	}

}
