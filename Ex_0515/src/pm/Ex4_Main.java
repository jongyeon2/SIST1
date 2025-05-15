package pm;

import java.util.Scanner;

public class Ex4_Main {

	public static void main(String[] args) {
//		선택:
//		사번검색:1,	이름검색:2,	직책검색:3,	부서검색:4
//			(사용자로부터 번호검색)
//		1 -> 검색할 사번: 
//		-> 2022 -> 
//		검색기능 구현하기 
		
		Ex4_Company e1 = new Ex4_Company(); // init 자동화
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("선택:");
		System.out.print("사번검색:1,  이름검색:2,  직책검색:3,  부서검색:4");
		int push = scanner.nextInt();
		
		switch(push) {
		case 1 : // 사번검색
			System.out.print("검색할 사번");
			int answer = scanner.nextInt();
			e1.getCleanup(answer);
			
		case 2 :	
			System.out.println("검색할 이름");
			
		}
		
		
	}

}
