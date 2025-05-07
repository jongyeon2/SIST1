package pm;

public class Ex10_Multi_for {

	public static void main(String[] args) {
		//1 2 3 4
		//5 6 7 8
		int num = 0;
		for(int k=1; k<=2; k++) {
			for(int i=1; i<=4; i++) {
				System.out.printf("%2d", ++num);
			}// inner for
			System.out.println();
		}//outer for 
		
		System.out.println("----------------------------");
		
		/*
		 [결과1]
		 * * * *
		 * * * *
		 * * * *
		 * * * *
		  
		 */
		
		/*
		 [결과2]
		 0 * * *
		 * 0 * *
		 * * 0 *
		 * * * 0		  
		 */
		for(int k=1; k<=4; k++) {
			for(int i=1; i<=4; i++) {
				System.out.printf("%2s", "*");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------");

		for(int k=1; k<=4; k++) {
			for(int i=1; i<=4; i++) {
				if(i==k) { // 만약 i의 값이 k와 같은 값이면 0을 
					System.out.printf("%2d",0);
				} else {// 아니면 별을 
					System.out.printf("%2s", "*");
				}
			}
		System.out.println();
	}
	}

}
