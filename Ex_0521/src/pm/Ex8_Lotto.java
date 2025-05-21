package pm;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Iterator;
import java.util.TreeSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex8_Lotto extends JFrame implements MouseListener {

	JLabel[] numbers = new JLabel[6];
	JPanel northPanel, centerPanel;
	TreeSet<Integer> ts;
	ImageIcon[] number;
	GridLayout grid;
	JButton creatNum;
	FlowLayout flow;
	
public Ex8_Lotto(){
		
		number = new ImageIcon[6];
		flow = new FlowLayout(FlowLayout.RIGHT);
		northPanel = new JPanel(flow);
		
		
		northPanel.add(creatNum = new JButton("번호 생성"));
		
		grid = new GridLayout(1, 6);
		centerPanel = new JPanel(grid);
		
		this.add(northPanel);
		
		
		
		setBounds(300, 300, 1200, 700);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		creatNum.addMouseListener(this);
		// 이벤트 감지자 등록 
	}
	
	public static void main(String[] args) {
		// 프로그램 시작 
		new Ex8_Lotto();
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		// 새로운 로또 번호를 받아야 할때 
		while(ts.size() < 6) {
			int random = (int)(Math.random()*45 + 1);
			ts.add(random);
		}
		
		Iterator<Integer> it = ts.iterator();
		while(it.hasNext()) {
			int su = it.next();
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i< numbers.length; i++) {
				sb.append("src").append("/").append("images").append("/").append(su).append(".").append("gif");
				number[i] = new ImageIcon(sb.toString());
			}
		}
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
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
