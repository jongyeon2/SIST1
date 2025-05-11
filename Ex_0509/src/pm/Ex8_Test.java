package pm;

public class Ex8_Test {

	public static void main(String[] args) {
//		정수 6개를 이거하는 배열 생성!
//		난수를 발생하여 배열 채우기 (1~45)
		
		int[] lotto = new int[6]; // 로또 번호를 입력받을 배열을 선언해준다.
		
		for(int i = 0 ; i < lotto.length; i++) {
			int ball = (int)(Math.random() * 45 + 1); // 1~45까지의 임의의 수를 받는다.
				lotto[i] = ball;
				
				for(int j = 0; j < i; j ++) { // 중복된 번호가 있으면 이전 포문으로 돌아가 다시 시행한다.
					if(lotto[i] == lotto[j]) {
						i--;
						break;
					}
				} // 내부 for문의 끝 
				
				System.out.print(lotto[i] + " "); // 로또번호를 출력한다.
		
		}	
					
	}
	
}
