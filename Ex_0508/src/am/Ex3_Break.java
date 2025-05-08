package am;

public class Ex3_Break {

	public static void main(String[] args) {
//		[결과]
//		
//		1 2 3 4
//		1 2 3 4
		
		int k = 0;
		while(k++ < 4) {
			int i = 0;
			while(i < 4) {
				System.out.printf("%-2d", ++i);
//				i가 3의 배수일 때 반복문을 탈출!
				if(i%3 == 0)  // i의 값이 3의 배수이면? 즉 4번째(0,1,2,3) 자리인 4만 탈출 
					break; // 가장 가까운 반복문 탈출~ 안쪽 반복문 while(i < 4)
			}
			System.out.println(); // 줄바꿈
		}
		// 반복문 안에 break 문이 있으면 가장 가까운 반복문을 탈출하고
//		반복문 안에 switch문의 break가 있으면 switch문의 break이다.
	}

}
