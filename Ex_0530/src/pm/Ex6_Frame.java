package pm;

import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Ex6_Frame extends JFrame {

	JTable table;
	
	// 컬럼명
	String[] c_name = {"사번","이름","직책","입사일","부서코드"};
	
	Object[][] data;
	
	ArrayList<Ex6_emp> e_list = new ArrayList<>();
	
	JMenuBar bar;
	JMenu file_menu;
	JMenuItem new_item, add_item, open_item, save_item, exit_item;
	
	// 파일로부터 자원을 읽기하기 위한 스트림 
	ObjectInputStream ois;
	ObjectOutputStream oos;
	File selectedFile = new File("c:/my_study/test/abc.txt"); //선택된 파일 
	
	
	//생성자
	public Ex6_Frame() {
		
		// 화면 구성
		this.add(new JScrollPane(table = new JTable(new DefaultTableModel(null, c_name))));
		
		// 메뉴 
		new_item = new JMenuItem("새파일");
		add_item = new JMenuItem("추가");
		open_item = new JMenuItem("열기", new ImageIcon("src/images/folder.png"));
		save_item = new JMenuItem("저장", new ImageIcon("src/images/save.png"));
		exit_item = new JMenuItem("종료");
		
		file_menu = new JMenu("파일");
		
		// 생성된 파일 메뉴에 메뉴아이템들을 추가 
		file_menu.add(new_item);
		file_menu.add(add_item);
		file_menu.add(open_item);
		file_menu.add(save_item);
		file_menu.addSeparator();// 구분선 
		file_menu.add(exit_item);
		
		// 메뉴바 생성 
		bar = new JMenuBar();
		
		// 메뉴바에 메뉴 추가 
		bar.add(file_menu);
		
		// 현재 창에 메뉴바 설정 
		this.setJMenuBar(bar);
		
		setBounds(300, 100, 500, 500);
		this.setVisible(true);
		
		readFile();
		
		
		// 이벤트 감지자등록
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				
				saveFile();
				closed();

			}
		
		});
		
		add_item.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Ex6_AddDialog add = new Ex6_AddDialog(Ex6_Frame.this);
			}
		});
		
		// [저장]
		save_item.addActionListener(new ActionListener() {
			// save_item을 눌렀을때 
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				saveFile();
				JOptionPane.showMessageDialog(Ex6_Frame.this, "저장완료");
			}
		});
	
		open_item.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				readFile();
				
			}
		});
	}

		
	private void saveFile() { // 저장 
		try {
			oos = new ObjectOutputStream(new FileOutputStream(selectedFile));
			oos.writeObject(e_list);
			oos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private void readFile() { // 파일을 읽는 메소드 
		
		try {
			ois = new ObjectInputStream(new FileInputStream(selectedFile));
			
			Object obj = ois.readObject(); // 객체읽기
			if(obj != null)
				e_list = (ArrayList<Ex6_emp>) obj;
			
			viewTable();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void closed() {
		// 사용되는 스트림이 있다면 먼저 닫아야 한다.
		try {
			if(ois != null)
				ois.close(); // 스트림 닫기 
			if(oos != null)
				oos.close(); // pw스트림 닫기 
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.exit(0);
	}
	
	public void addData(String empno, String ename, 
			String pos, String hdate, String deptno) {
		Ex6_emp emp = new Ex6_emp(empno, ename, pos, hdate, deptno);
		e_list.add(emp); // 멤버변수인 e_list라는 ArrayList에 저장 
		
		viewTable(); // 테이블을 보여준다.
	}
	
	public void viewTable() {
		// 멤버 변수인 e_list를 가지고 2차원 배열을 만든다.
							//행            //열 
		data = new Object[e_list.size()][c_name.length];
		
		for(int i = 0; i < e_list.size(); i++) {
			// arraylist에서 저장된 요스를 가져와야 함 
			Ex6_emp emp = e_list.get(i);
			
			data[i][0] = emp.getEmpno(); // 사번
			data[i][1] = emp.getEname(); // 이름 
			data[i][2] = emp.getPos(); // 직책 
			data[i][3] = emp.getHire_date(); // 입사일
			data[i][4] = emp.getDeptno(); //부서코드 
		}
		//위의 반복문으로 테이블에 사용할 모델 자원이 준비되었다.
		// 모델 객체 생성한 후 그것을 테이블에 적용 하면 된다.
		table.setModel(new DefaultTableModel(data, c_name));
	}
	public static void main(String[] args) {
		// 프로그램 시작
		new Ex6_Frame();

	}

}
