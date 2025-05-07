package pm;

public class Ex12_Test {

	public static void main(String[] args) {
		// [문제1] 다음의 결과와 같은 모양을 출력하는 반복문을 구현하시오
//		   [결과] 
		/* 
			* * * *
			* * *
			* *
			* 
		*/
		for(int k=1; k<=4; k++) {		
			for(int i=1; i<=4; i++) {
				if(i>=k)
					System.out.printf("%2c",'*');
			}
			System.out.println();
		}
		System.out.println("-----------------");
		
		/*[문제2] 다음의 결과와 같은 모양을 출력하는 반복문을 구현하시오
		 * 주석 변경!!!
		  [결과]
		 * * * *
		   * * * 
		     * *
		       *
		*/
		for(int k=1; k<=4; k++) {			
			for(int i=1; i<=4; i++) {
				if(k <= i) //k가 i보다 작으면 
					System.out.printf("%2c",'*');
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("----------------");
		/*[문제3] 구구단을 다음과 같이 출력하는 반복문을 구현하시오 
		  [결과]
		  2*1=2     3*1=3	....	9*1=9
		  2*2=4		3*2=6	....	9*2=18
		  .....		.....			....
		  2*9=18	3*9=27	....	9*9=81	  
		 */
		
		int a = 0;
		for(int i=2; i<=9; i++) {
			for(int k=1; k<=9; k++) {
				a = i * k;
				System.out.printf("%d*%d=%d%n",i,k,a);
			}
			System.out.println();
		
		}
		
	}
}
