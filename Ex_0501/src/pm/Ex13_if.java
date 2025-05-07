package pm;

import java.util.Scanner;

public class Ex13_if {

	public static void main(String[] args) {
		// 프로그램 시작 
		
		// 키보드로 부터 점수를 하나 받아 score에 저장.(0~100)
		// 그 점수가 80~100점이면 "우수"
		// 60~79점이면 "보통"
		// 40~59점이면 "좀 걱정"
		// 그 이하는 "나오지 마"

		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력해주세요");
		int score = scanner.nextInt();
		String s = ""; // 각 점수에 관련된 성적을 나타내는 String 변수
		
		
		// 유효하지 않는 값들 걸러내기 
		if(0 > score || score >100) { // 0~100사이의 점수만 받을 수 있음
			System.out.println("잘 못된 값"); // 잘 못된 값을 알려줌
			return;							// 그만(더 이상 수행하지 않는다)
			
			// 제어가 여기에 왔을 때는 score 의 최대 값은 100이다.
			
		} else if(80 <= score) { // 80~100점이면?
			s = "우수";						// 우수
			System.out.println(s);		
		} else if(60 <= score) {		// 60~79점이면 
			s = "보통";                // 보통
			System.out.println(s);
		} else if(40 <= score ) { 	// 40~ 59점이면
			s = "좀 걱정";			// 좀 걱정
			System.out.println(s);
		} else {					// 나머지는?
			s = "나오지 마";		//접으셈
			System.out.println(s);
		}			
	}

}
