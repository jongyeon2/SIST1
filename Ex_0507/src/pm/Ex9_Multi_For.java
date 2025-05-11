package pm;

public class Ex9_Multi_For {

	public static void main(String[] args) {
		// 화면에 1~5까지 출력하는 반복문
		/*
		 [결과]
		  1 2 3 4 5
		  1 2 3 4 5
		  1 2 3 4 5 
		  */
	for(int x=1; x<=3; x++) {	// 행 
		for(int i=1; i<=5 ; i++) { // 열 
//			System.out.print(i+" ");
			System.out.printf("%-2d ", i); //printf = 형식을 이용해서 출력한다는 의미
//			%d = 숫자를 얘기함 100일경우 100100100 -> 이렇게 붙어서 출력됨
//			%(숫자)d = 정수의 자릿수(숫자)를 얘기한다
//			%-2d = 이경우 숫자가 왼쪽으로 옮겨진다.
		
		}// for의 끝
		System.out.println();
	} 
	System.out.println("-------------------------------");
	
//	* * * * * 
//	* * * * * 
//	* * * * * 
//	* * * * * 
for(int k=1; k<=4; k++) {	// 행 
	for(int i=1; i<=4; i++) { // 열 
		System.out.printf("%2c", '*');
	}
	System.out.println();
}

System.out.println("---------------------------------");

	int num = 1; // 숫자 시작값
	
	for(int i = 0; i < 2; i++) {
		for(int j = 0; j < 4; j++) { // 각 행에 4개의 숫자 출력
			System.out.print(num + "");
			num++; //숫자 증가 
		}
		System.out.println();
	}

		}

}
// 1 2 3 4
// 5 6 7 8 
// 를 다중for문으로 작성하려고 할때 
// 한번에 해결하려는것이 아닌 일단 1,2,3,4를 for문으로 두줄을 작성후
// 5 6 7 8을 어떻게 출력할 것인지 고민해보아야 한다.




