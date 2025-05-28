package am;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.Formatter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Ex2_File extends JFrame {
	
	JPanel north_p; 
	JTextField input_tf; // 경로입력창
	JButton ok_bt, back_bt; 
	JList<String> list; // string만 들어감 
	
	//기본 생성자
	public Ex2_File() {
		
		north_p = new JPanel(); 
		input_tf = new JTextField(20); // 열의 넓이 20
		ok_bt = new JButton("확인");  // 확인버튼
		back_bt = new JButton("뒤로"); // 뒤로버튼 
		
		// 배치시키기
		north_p.add(new JLabel("경로:"));
		north_p.add(input_tf); //경로 입력창 넣기
		north_p.add(ok_bt); // ok버튼 넣기
		north_p.add(back_bt); //뒤로 버튼 넣기
		this.add(north_p, BorderLayout.NORTH); // JPanel을 위에 배치하고 넣겠다.
		
		this.add(new JScrollPane(list = new JList<String>())); 
		
		
		this.setBounds(300, 100, 420, 500);
		this.setVisible(true);
		
	
		
		// 이벤트감지자
		this.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				// 프로그램 종료 
				System.exit(0);
			}
		});
		
		input_tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// JTextField에서 엔터를 치면 ActionEvent다.
				// Action은 Enter만 잡음 
				viewList();
			}
		});
		
		// 버튼 감지자 
		ok_bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ok_bt를 눌렀을때만 수행하는 곳 
				// e.getSource()를 호출하여 객체를 구별할 필요가 없다.
				// 해야할 일은 - 사용자가 입력한 경로를 얻어낸다.
				
				// 사용자가 입력한 경로를 받는 path 변수 
				viewList();
			}
		});
		
		// "뒤로" 버튼 감지자 
		back_bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 뒤로를 눌렀을때만 수행하는 곳 
				
				// 사용자가 입력한 경로를 받는다.
				String path = input_tf.getText().trim();
				 
				// 마지막에 있는 "/"의 위치를 알아낸다 
				int index = path.lastIndexOf("/");
				
				// 0번지부터 알아낸 위치 직전까지만 문자열 검출 
				path = path.substring(0,index);				
				
				// 위에서 검출된 문자열을 input_tf에 지정한다. 
				input_tf.setText(path); 
				
				viewList();
				
			}
		});
		
		list.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// 더블클릭을 했는지? 확인
				int cnt = e.getClickCount(); 
				if(cnt == 2) {
					// 더블클릭할 때 list에 선택된 값을 가져온다.
					String str = list.getSelectedValue();
					
					// list에 선택된 값 string을 
					StringBuilder sb = new StringBuilder(input_tf.getText().trim());
					sb.append("/")
					  .append(str);
					
					// 조합된 문자열은 sb가 가지고 있다. 이것을 다시 
					// input_tf에 지정하자
					input_tf.setText(sb.toString());
					
					viewList();
					
//					JOptionPane.showMessageDialog(Ex2_File.this, str);
				} // 더블클릭했을 경우 
			}
		
			
		});
	}// 생성자의 끝 
	
	public void viewList() {
		String path = input_tf.getText().trim(); 
		
		// path의 글자의 갯수가 3미만이면서, /가 없을경우
		if(path.length() < 3 && !path.contains("/")) {
			path = path.concat("/");
			input_tf.setText(path);
		}
		
		// 두번째 할일은 경로를 얻어냈으니 이 경로로 File 객체를 생성
		File f = new File(path);
		
		// 해당 f가 존재하는지? 그리고 폴더인지? 판단해야 함 
		if(f.exists() && f.isDirectory()) {
			String[] ar = f.list();
			// 받은 배열을 JList에게 적용한다.
			list.setListData(ar);
		}// if의 끝 

	}
	
	public static void main(String[] args) {
		// 프로그램 시작 
		new Ex2_File();

	}

}
