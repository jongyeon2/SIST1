package am;

import java.util.Scanner;

public class Ex9_if {

	public static void main(String[] args) {
		// 프로그램 시작 
		// 키보드로 부터 점수(0~100)를 받아서 
		// 60점 이상이면 "합격"그렇지 않으면
		// "다시 도전"을 출력하세요
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력해주세요");
		int score = scanner.nextInt(); // 키보드로부터 점수를 받는 변수 score

		// if 문의 {}블럭 범위가 중요 
		// 먼저 score의 값이 100을 넘었는지? 확인하는 비교문
		
		if(score <= 100) {
			// 제어가 이 안에 들어오면 즉 score의 최대 값은 100이다.
			if(score >= 60)
				System.out.println("합격");
			else
				System.out.println("다시 도전");
		} else {
			System.out.println("잘못 입력하셨습니다.");
			// score가 100을 넘은 경우! 
		}
		
	}
}
