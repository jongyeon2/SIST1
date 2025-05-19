package pm;

import java.util.*;
import java.util.Scanner;

import mj.Company;

public class Ex4_Main {

	public static void main(String[] args) {
//		선택:
//		사번검색:1,	이름검색:2,	직책검색:3,	부서검색:4
//			(사용자로부터 번호검색)
//		1 -> 검색할 사번: 
//		-> 2022 -> 
//		검색기능 구현하기 
		
//		Ex4_Company 클래스는 모드 메서드와 리스트가 static이라 인스턴스 생성 필요 없음 
//		Ex4_Company company = new Ex4_Company(); // 회사 객체 생성 
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("선택");
		System.out.println("사번검색:1, 이름검색:2, 직책검색:3, 부서검색:4");
		int cmd = scan.nextInt(); // 사용자로부터 선택 받는 정수형 변수 
		
		
		switch(cmd) {
			case 1:{ //사번검색 
				System.out.print("사원번호를 입력해주세요");
				int answer = scan.nextInt();
				Ex4_Company.getEin(answer);	// static 클래스의 메서드를 사용함으로 객체 생성했던 comapny.이아닌 
//												클래스 이름을 붙여서 호출해줌 
				break;
			}
			case 2: { // 이름검색 
				System.out.print("이름을 입력해주세요");
				String answer = scan.next();
				Ex4_Company.getName(answer);
				break;
			}
			case 3: { // 직책검색
				System.out.println("직책을 입력해주세요");
				String answer = scan.next();
				Ex4_Company.getJob(answer);
				break;
			}
			case 4: { // 부서검색 
				System.out.println("부서명을 입력해주세요");
				String answer = scan.next();
				Ex4_Company.getDepartment(answer);
				break;
			}
			default:
				System.out.println("잘못 입력하셨습니다.");
		
		} // swtich의 끝 

		
	}

}