package pm;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex2_Myadap extends WindowAdapter {

	@Override
	public void windowClosing(WindowEvent e) {
		// 프로그램 종료 
		System.exit(0);
	}

	//종료 버튼(X) 눌렀을 때 호출되는 기능
	// WindowClosing
	
}
