package am;

public class Ex2_While {	
		
	public static void main(String[] args) {
//		1~45까지의 수들 중 난수를 발생시켜 출력하는 프로그램을 구현하자
//		난수의 수는 총 6개를 출력해야 하며
//		반드시 while문을 사용해야 한다.
		
		
		int j = 0; // 반복할 횟수의 변수
	
		while(j++< 6) {
			System.out.printf("%2d ", (int)(Math.random() * 45 + 1)); 
		}
		System.out.println("\r\n----------------------------");
//		while문을 이용하여 다음과 같이 출력하자!
//		[결과]
//		* * * *
//		* * * *
//		* * * *
		
		int k = 0;
		while(k++ < 3) {
			int i = 0;	//변수 i 는 무조건 {} 안으로 넣어야 한다. 과정을 생각하면 이해가 가능하다.
			while(i++ < 4) {
				System.out.printf("%-2s","*");
			}
			System.out.println();
		}

	}

}
