package am;

public interface Ex2_Inter {
//	상수와 추상메서드만 정의할 수 있다.
//	final은 변수,메서드,클래스 앞에만 붙일 수 있다.
	
//	메서드 앞에 final이 붙으면 오버라이딩이 불가하다.
//	클래스 앞에 final이 붙으면 상속 못 받는다.
	int MAX_VALUE = 100; // 상수는 이름을 모두 대문자로 표기한다.
	
//	추상메서드는 일반 메서드와 달리 body{}를 가지지 못한다.
	public int getValue();
}
