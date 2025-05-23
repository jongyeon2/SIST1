package pm;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestWindowAdap extends WindowAdapter{

	// WindowAdapter는 WindowListener를 구현하였으며 추상메서드
	// 모두 Empty로 재정의 되어 현재클래스에서 의무적으로 재정의할
	// 메서드가 없다.
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0); // 지금 바로 모든 프로그램 종료
		
	}

	
	


}
