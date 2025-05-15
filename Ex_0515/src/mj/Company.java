package mj;

import java.util.ArrayList;
import java.util.List;
import static mj.Job.*;

// 회사 클래스
public class Company {
	
	public static final int SEARCH_TYPE_EMPLOYEE_NO   = 1;
	public static final int SEARCH_TYPE_EMPLOYEE_NAME = 2;
	public static final int SEARCH_TYPE_JOB  = 3;
	public static final int SEARCH_TYPE_DEPT = 4;
	
	// 사원 리스트
	public static List<Employee> employees = new ArrayList();
	public static List<Department> departments = new ArrayList();
	
	static {
		// 부서 생성
		Department backendTeam   = new Department("백엔드", "백종연", "20200701");
		Department frontTeamt 	 = new Department("프런트", "황종수", "20211010");
		Department marketingTeam = new Department("마케팅", "김정환", "20220303");
		Department businessTeam  = new Department("경영실", "김민준", "20250411");
		
		// 사원 생성
		Employee hong = new Employee("홍길동", 18, JUNIOR, frontTeamt);
		Employee kim  = new Employee("김철수", 27, SENEOR, marketingTeam);
		Employee jung = new Employee("정지수", 10, STAFF, businessTeam);
		Employee baek = new Employee("백종연", 32, BOSS, backendTeam);
		
		// 사원 추가
		employees.add(hong);
		employees.add(kim);
		employees.add(jung);
		employees.add(baek);
		
		// 부서 추가
		departments.add(backendTeam);
		departments.add(frontTeamt);
		departments.add(marketingTeam);
		departments.add(businessTeam);
	}
	
	// 사원의 정보를 출력하는 메서드
	public static void printEmployeeInfo(int searchType, String searchWord) {
		// 검색 일치 여부
		boolean isFind = false;
		
		for(Employee employee : employees) {
			switch (searchType) {
				// 사번 검색
				case SEARCH_TYPE_EMPLOYEE_NO : {
					int employeeNo = Integer.valueOf(searchWord);
					if (employee.getNo() == employeeNo) {
						System.out.println(employee);
						isFind = true;
					}
					break;
				}
				// 이름 검색
				case SEARCH_TYPE_EMPLOYEE_NAME : {
					if (employee.getName().equals(searchWord)) {
						System.out.println(employee);
						isFind = true;
					}
					break;
				}
			} // end of switch
			
			if (isFind) break;
		} // end of for
		
		if (!isFind) System.out.println("검색하신 사원은 존재하지 않습니다.");
	}
	
	// 직책 정보 출력
	public static void printJobInfo(String searchWord) {
		// 검색 일치 여부
		boolean isFind = false;
				
		for(Job job : Job.values()) {
			if (job.getName().equals(searchWord)) {
				System.out.println("직책: " + job.getName() + ", 평균 연봉: " + job.getSalary());
				isFind = true;
				break;
			}	
		}
		if (!isFind) System.out.println("검색하신 직책은 존재하지 않습니다.");
	}
	
	// 부서 정보 출력
	public static void printDeptInfo(String searchWord) {
		// 검색 일치 여부
		boolean isFind = false;
		for(Department deparment : departments) {
				if (deparment.getName().equals(searchWord)) {
					System.out.println(deparment);
					isFind = true;
					break;
				}
		}
		if (!isFind) System.out.println("검색하신 부서는 존재하지 않습니다.");
	}
	
}
