package mj;

import java.util.Scanner;
import static mj.Company.*;

public class Main {
	
	
	public static void main(String[] args) {

		do {
			System.out.println("사번검색: 1, 이름검색: 2, 직책검색: 3, 부서검색: 4, 프로그램 종료: 5");		

			Scanner scanner = new Scanner(System.in);
			
			int searchType = scanner.nextInt();
			if (searchType == 5) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
			
			System.out.println("검색할 내용을 입력해주세요.");
			String searchWord = scanner.next(); 	// 사원 번호
			
			System.out.println("================== 검색 결과 시작 ======================");
			
			// 사원 관련 검색
			if (searchType == SEARCH_TYPE_EMPLOYEE_NO || searchType == SEARCH_TYPE_EMPLOYEE_NAME) {
				printEmployeeInfo(searchType, searchWord);	
			} 	
			// 직책 검색
			else if(searchType == SEARCH_TYPE_JOB) {
				printJobInfo(searchWord);
			}
			// 부서 검색
			else if(searchType == SEARCH_TYPE_DEPT) {
				printDeptInfo(searchWord);
			}
			
			System.out.println("================== 검색 결과 종료 ======================");
		
		} while(true);
				
	}
}
