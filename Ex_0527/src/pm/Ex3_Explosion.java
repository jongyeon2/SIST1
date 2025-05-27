package pm;

import java.awt.Point;

public class Ex3_Explosion {
	// 운석이 폭발하는 의미를 가지는 객체 
	int size = 128;
	
	Point pt = new Point();
	
	// 현재 객체가 하나 생성될 때는 운석이 주인공이랑 충돌할 때다.
	// 이때 운석이 폭발하면서 사라져야 한다.
	
	// 폭발이미지는 총 27개이며 이들은 Ex3_Frame에 배열로 미리 준비 둔다.
	
	// 배열을 접근하는 index값을 준비하자 
	int index; // 0
	int delay = 5; // 반복수행이 delay만큼 될때 index증가
	int interval = delay;
	
	// move_index
	public boolean move_index() {
		if(interval == delay) // 5일때만 index 증가 
			index++;
		
		interval--;
		if(interval == 0)
			interval = delay;
		
		// 인덱스 값은 27이 되면 현재 함수는 폭발이미지 27개를 모두 
		// 표현한 상태가 된다. 그래서 폭발이 끝났음을 알려야 한다.
		return index >=27;
	}
}
