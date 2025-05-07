package pm;

public class Ex3 {
	
	public static void main(String[] args) {
		// 프로그램 시작
		// int형 미만들(byte, short) - 32비트 미만들끼리 연산하면 
		// 							32비트로 자동 승격(프로모션)이 일어난다.
		byte b1 = 10;
		byte b2 = 7;
		// b1과 b2를 더하여 새로운 변수 b3에 저장한다.
		
		// byte b3 = b1 + b2일 경우 오류가 난다. 
		int b3 = b1 + b2; // 
		
		// 작은것이 항상 큰것으로 변환 됨 
		// 승격된 자료형을 강제로 형변환 시키는 법(CASTING)
		byte b4 = (byte)(b1 + b2);
	
	}

}
