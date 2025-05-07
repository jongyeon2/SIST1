package pm;

import java.util.Scanner;

public class Ex11_Multi_if {
	
	public static void main(String[] args) {
		// 프로그램 시작 
		// 다중 if문
		
		System.out.println("값 :");
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();

		// 변수 value의 값이 1, 아니면 2, 아니면 3이 들어간다고 가정하자
		// 1일경우, "초보" 출력하고
		// 2일때, "중급" 출력하고
		// 3일때, "고급" 출력하자
		// 그 외는 "잘못입력하셨습니다"라고 하고싶다
		// 위를 해결하기 위해서는 다중if문을 구현해야 한다.
		// [구성]
		/*
			if(조건1)
				조건1을 만족하는 수행문
			else if(조건2)
				조건1에는 맞지 않지만 조건2를 만족하는 수행문
			else if(조건3)
				조건1,2에 만족하지 않지만 조건3을 만족하는 수행문
			else 
				조건식1,2,3 모두 만족하지 않는 경우의 수행문 
		if(value ==1) {
			System.out.println("초보");
		} else if(value == 2) {         // 여기 까지 왔다는경우 위에 있는 조건식이 아니기 떄문에 값이 1인지 한번더 비교할 필요X
			System.out.println("중급");
		} else if(value == 3) {
			System.out.println("고급");
		} else {
			System.out.println("잘 못 입력하셨습니다");
		} 
		 */
		String str = "";
		if(value == 1)
			str = "초급";
		else if(value == 2)
			str = "중급";
		else if(value == 3)
			str = "고급";
		else 
			str = "잘 못 입력";
		
		// 한 행이 아니라면 {}로 묶어라 (하나의 영역) 
		
		System.out.println(str);
	}

}
