package am;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_WinAdap extends WindowAdapter {

	@Override
	public void windowClosing(WindowEvent e) {
		// 프로그램 종료 
		System.exit(0);
	}
	
	
	
}
