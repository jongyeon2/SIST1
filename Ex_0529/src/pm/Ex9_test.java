package pm;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Ex9_test extends JFrame {
	
	JPanel north_p;
	JLabel lb;
	JTextField url_tf;
	JButton chk_bt;
	JTable table;
	
	String[] c_name = {"파일명", "수정일", "용량"};
	Object[][] ar;
	
	// 생성자
	public Ex9_test() {
		
		// 테이블 삽입 
		
		north_p = new JPanel();
		north_p.add(new JLabel("경로 : "));
		north_p.add(url_tf = new JTextField(30));
		north_p.add(chk_bt = new JButton("확인"));
		
		add(north_p,BorderLayout.NORTH);
		
		
		// 이벤트 감지자 
		this.setBounds(300, 100, 800, 800);
		this.setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
		chk_bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String url_path = url_tf.getText();
				getTable(url_path);

				DefaultTableModel model = new DefaultTableModel(ar, c_name);
				table = new JTable(model);
				
				Ex9_test.this.add(new JScrollPane(table));
				Ex9_test.this.setVisible(true);
				// 파일명을 얻어내기 위해 url_tf에 있는 문자열을 가져옴 
			}
		});
	}// 생성자끝

	public void getTable(String path) {
		
		File f = new File(path);
		
		if(f.isDirectory()) {
			// 디렉토리일 경우에만 수행하도록 한다. 
			File[] sub = f.listFiles();
			
			ar = new String[sub.length][c_name.length];
			for(int i = 0; i < sub.length; i++) {
				// 파일 하나 얻기 
				File sub_file = sub[i];
				try {
				// 얻어낸 파일의 정보를 얻어내기 위해 Map구조 생성 
				Map<String,	Object> att = Files.readAttributes(Paths.get(sub_file.getAbsolutePath()),"*");
				
					ar[i][0] = sub_file.getName(); // 파일명
					FileTime ft = (FileTime)att.get("lastModifiedTime"); //FileTime으로 캐스팅, 최종 수정일 
					
					ar[i][1] = ft.toString(); // String타입으로 삽입해야 되기 때문
					
					ar[i][2] = String.valueOf(sub_file.length()); // 용량 
				} catch (Exception e) {}
			}// for의 끝 
		}
	}
	public static void main(String[] args) {
		// 프로그램 시작
		new Ex9_test();
	}

}
