package pm;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex6_URL extends JFrame {
	
	JPanel center_p;
	JTextField url_tf;
	JButton down_bt;
	
	//파일 처리를 위한 스트림 객체들 
	BufferedInputStream bis;
	BufferedOutputStream bos;
	
	// 생성자 
	public Ex6_URL() {
		//화면 구성
		
		center_p = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		center_p.add(new JLabel("URL : "));
		center_p.add(url_tf = new JTextField(60));
		center_p.add(down_bt = new JButton("다운로드"));
		
		this.add(center_p); 
		
		
		this.setBounds(300, 100, 800, 150);
		this.setVisible(true);
		
		// 이벤트 감지자 등록 
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// 지금 바로 프로그램 종료
				System.exit(0);
			}
		});
		
		down_bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 다운로드 버튼을 클릭할 때만 수행하는 곳 
				JFileChooser jfc = new JFileChooser("c:/my_study");
				
				// 파일명만 얻어내기 위해 url_tf에 있는 문자열을 가져온다.
				String url_path = url_tf.getText().trim();
				
				// 가장 뒤에 있는"/"의 위치값을 알아낸다.
				int idx = url_path.lastIndexOf("/");
				
				//위에서 얻어낸 마지막 "/"위치값을 가지고 파일명만 얻어낸다.
				String fname = url_path.substring(idx + 1);
				
				//추출한 파일명을 파일선택기에 지정한다.
				jfc.setSelectedFile(new File(fname));
				
				int cmd = jfc.showSaveDialog(Ex6_URL.this);
				
				if(cmd == JFileChooser.APPROVE_OPTION) {
					// [저장] 버튼을 클릭한 경우
					// 이런 경우에는 사용자가 반드시 파일을 선택한 경우다.
					// 선택된 파일을 얻어내자
					File f = jfc.getSelectedFile(); // 선택된 파일이 넘어온다.
					
					try {
						URL url = new URL(url_path); // 웹상의 경로를 객체화 
						
						// 웹 상에 존재하는 이미지 경로와 연결된 스트림 생성 
						bis = new BufferedInputStream(url.openStream()); // url 클래스에 inputStream을 가지고 있다.
						
						// 웹 상에 이미지를 저장할 파일(f)과 연결하는 스트림 생성 
						bos = new BufferedOutputStream(new FileOutputStream(f));
						
						int size = -1;
						byte[] buf = new byte[4098];
						
						while((size = bis.read(buf)) != -1) { 
							// 읽은 자원들은 모두 buf라는 배열에 저장된 상태다.
							// 읽기한 수는 size가 기억함으로 buf의 0번지부터 size수만큼
							// 쓰기하면 된다.
							bos.write(buf, 0, size);
							bos.flush();
						}// while의 끝 
						
						//파일의 끝을 만났을 때 여기를 수행함
						JOptionPane.showMessageDialog(Ex6_URL.this, "저장완료");
						
						
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
			}
		});
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex6_URL();

	}

}
// JDBC를 가지고 현업에 쓰는 기술은 없다.
// 라이브러리를 경험해보고 라이브러리를 직접 써보는것이 더 좋다.
// 웹에서 2차프로젝트 할때 더욱 수월해 질 수 있다.
// mybatis까지 배우고 2차 진행 