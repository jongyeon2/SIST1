package pm;

public class Ex8_Test {

	public static void main(String[] args) {
//		정수 6개를 이거하는 배열 생성!
//		난수를 발생하여 배열 채우기 (1~45)
		
		int[] lotto = new int[6];
		for(int i = 0; i < lotto.length; ) {
			
			lotto[i] = (int)(Math.random() * 45 + 1);
			boolean chk = true;
			
			for(int j = 0; j < i ; j++) {
				if(lotto[i] == lotto[j]) {
					chk = false;
					break;
				}
			}
			if(chk)
				++i;
		}
		
	}
	
}
