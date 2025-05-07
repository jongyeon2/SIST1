package am;

import java.util.Scanner;

public class Ex10_if {

	public static void main(String[] args) {
		// 프로그램의 시작 

		// 키보드로 부터 점수(0~100)를 받아서 
		// 60점 이상이면 "합격"그렇지 않으면
		// "다시 도전"을 출력하세요
				
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력해주세요");
		int score = scanner.nextInt(); // 키보드로부터 점수를 받는 변수 score
		
		//단순 if문
		if(score > 100 || score < 0) { // 함수가 아니라 제어문임으로 return이 여기로 돌아오지 않는다. 
			System.out.println("잘 못 입력하셨습니다.");
			return;  // 제어권 반환(호출한 곳으로 돌아간다.)
		}
		// if else 문 
		//score의 값이 100이하인 경우만 수행하는 곳! 
		if(score >= 60)
			System.out.println("합격");
		else 
			System.out.println("재도전");
	} // main 함수가 끝났음으로 프로그램이 종료 

}

// 함수란 명령어들의 집합이다. 호출해야만 수행한다. 함수는 수행후 "호출"한 곳으로 돌아감
// 프로그램은 흐름이다. 흐름을 알면 맥락을 알게 됨 
// 자바가상머신(JVM)이 main함수를 호출하기 떄문(2번을 호출하지 않음)에
// return은 main함수를 호출한 곳으로 돌아간다. 
// JVM으로 돌아갔다 = 프로그램이 끝났다.
// 함수는 반드시 class 안에 있어야 함 