package am;

import java.util.Scanner;

public class Ex8_if {

	public static void main(String[] args) {
		// 프로그램 시작
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("나이 입력:");
		int age = scanner.nextInt(); // 키보드로 나이의 입력을 받을 변수 선언 
		
		if(30 > age && age <= 20) { // 조건식 age(나이)가 20대 이상 30대 미만 일경우
			System.out.println("20대 입니다"); // 20대 입니다~라고 알려줌 
		} else { // 20대가 아니면?					 
			System.out.println("20대가 아닙니다"); // 20대가 아닌경우 알려줌
		}
	
	}

}
