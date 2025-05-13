package pm;

import java.util.Scanner;

public class Ex3_Main {

	public static void main(String[] args) {
// 		구구단을 출력하는 프로그램을 만들자!
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("단:" );
		int i = scanner.nextInt();
		
		Ex3_Gugudan g1 = new Ex3_Gugudan();
		g1.setDan(i); // 키보드로부터 받은 값을 구구단객체에 저장한다.
		
//		해당 단을 출력하는 기능을 호출하자.
		g1.printGugudan();
	}

}
