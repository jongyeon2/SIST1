package pm;

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
		
		Ex4_Company comp = new Ex4_Company(); //comp 객체생성 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("선택");
		System.out.println("사번검색:1, 이름검색:2, 직책검색:3, 부서검색:4");
		int cmd = scan.nextInt();
		
		String msg = null;
		String str = null;
		
		switch(cmd) {
			case 1:{
				System.out.println("검색한 사변:");
				str = scan.next();
//				msg = comp.searchEmp(cmd, str);
				break;
			}
			default :
				msg = "잘 못 입력하셨습니다.";
		} // swtich의 끝 
		System.out.println(msg);
		
	}

}
