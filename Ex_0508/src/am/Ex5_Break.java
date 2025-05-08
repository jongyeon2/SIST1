package am;

import java.util.Scanner;

public class Ex5_Break {

	public static void main(String[] args) {
//		문자열을 기억하는 변수 str을 선언하자!
		String str = "";
		
//		앞의 문자가 대문자일경우 객체 자료다.
		Scanner scann = new Scanner(System.in); // System.in(키보드 입력)
		System.out.println("문자열 입력:");
		
//		키보드로 부터 문자열을 받아서 str 에 저장하자
		str = scann.nextLine();  // nextLine()키보드로부터 한줄을 입력해라 
		
		System.out.println("str: " + str);
		
//		사용자가 키보드로 입력한 모든 값들이 하나의 문자열로 만들어져서
//		변수 str에 저장된 상태다.
//		이때 str에 있는 문자열을 한자씩 얻어내어 출력하는 반복문을 만들어보자
		
//				레이블 개념 = 반드시 반복문 앞에다가만 붙일 수 있음 
//							  반복문의 이름을 정해주는것	
		bk1: for(int i=0; i < str.length(); i++) { //bk1이라는 명칭을 가지고 있는 for문 
			char ch = str.charAt(i); // 문자 추출
			System.out.printf("%-2c", ch); // 출력하여 확인
			
//			만약에 문자가 '0'과 같은 것을 만나면 반복문을 탈출하자.
//			if(ch == '0')ㄴㄴ
//				break; //탈출 
//			결과를 확인해보면 0을 만나면 바로 반복문을 탈출한다.
			
			switch(ch) {
			case '0':
				System.out.println("0이네"); // switch문에서 break문이 잘 작동되는지 확인하기 위한 println
				break bk1; // bk1이라는 반복문을 탈출한다.
			case 'a' : 
				System.out.println("a");
				break;  // 반복문을 탈출하지 못하고 switch문만 탈출함
			}
		}
	}

}
