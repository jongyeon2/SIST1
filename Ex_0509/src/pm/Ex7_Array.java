package pm;

import java.util.Scanner;

public class Ex7_Array {

	public static void main(String[] args) {
//		각 월의 마지막 날을 저장한 배열(데이터를 알고 있는 경우)
//		선언, 생성, 초기화를 한번에!
		int[] month_array = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

//		키보드로 월을 입력 받아 해당 월이 몇일까지 있는지?
//		출력해 보자 
		
		Scanner scan = new Scanner(System.in);
		String cmd = "";
		do {
//			월 입력을 유도하자!
			System.out.println("월 입력(1~12):");
			int month = scan.nextInt(); //월 받기 
			
			System.out.printf("%-3d월은 %d일까지 입니다.\n", month, month_array[month-1]);
			
//			숫자는 month에 들어갔지만 엔터값은 아직 스캐너에 남아있다.
			scan.nextLine();//엔터값 처리를 해야한다. 빨리 엔터값을 버려야 한다.
			
//			* scan.nextXXX가 2번 나왔기 때문에 3 + Enter를 두번 키보드로 입력하기 떄문에
			
			System.out.println("계속 하시겠습니까?(y/n): ");
			cmd = scan.nextLine();
			
			System.out.println("프로그램 종료!");
		} while(!cmd.equalsIgnoreCase("n")); // n이 아닐 때 반복수행
//		  while(cmd.equalsIgnoreCase("n") = cmd에 n이 들어올 때 반복수행 
//		  !는 부정의 의미 따라서 위의 얘기는 n이 아닐 때 
		
	}

}
