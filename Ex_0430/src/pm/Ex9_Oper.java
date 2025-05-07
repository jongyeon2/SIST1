package pm;

import java.util.Scanner;

public class Ex9_Oper {

	public static void main(String[] args) {
		// 키보드로 부터 정수를 하나 받아 변수 v1에 저장한다.
		// v1의 값이 20대인지? 아닌지? 판단하는 프로그램을 구현하시오 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력받은 정수가 20대 일까?");
		
		int v1 = scanner.nextInt(); //키보드로 부터 정수를 하나 받아 변수 v1에 저장 
		
		System.out.println((20 <= v1) && (v1 < 30));
		// 문제의 정답이 v1의 값이 20대인지 확인하는 거기 때문에 v1이 20보다 크거나 같고 30보다 작아야 하기 떄문에 
		// 20 <= v1 && v1 < 30 으로 표현 하면 20대의 숫자만 걸러짐
	}

}
