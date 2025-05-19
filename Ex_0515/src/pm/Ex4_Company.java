package pm;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex4_Company {

//	ArrayList 만들기 
//	ArrayList에 emp 객체들을 저장
//	searchEmp 메서드 생성 
		public static ArrayList<Ex4_Emp> ar = new ArrayList<Ex4_Emp>();
		
		static { 
			Ex4_Emp e1 = new Ex4_Emp(20222468,"백종연","인턴","인사");
			Ex4_Emp e2 = new Ex4_Emp(20224568,"김준수","인턴","개발");
			Ex4_Emp e3 = new Ex4_Emp(20228986,"심재탁","사원","개발");
			Ex4_Emp e4 = new Ex4_Emp(20246898,"김완희","사원","인사");
			Ex4_Emp e5 = new Ex4_Emp(20004899,"오경주","사장","개발");
			ar.add(e1);
			ar.add(e2);
			ar.add(e3);
			ar.add(e4);
			ar.add(e5);
		}
		
		public static void getEin(int answer) {//사번 검색 
			boolean found = false;
			
			for(int i = 0; i < ar.size(); i++) { 
				int ein = ar.get(i).getEin();
				if(answer ==  ein) {
					System.out.println(ar.get(i)); // toString()은 println에서 자동 호출
					found = true;
					break;
				}
			}//for 문의 끝 
			if(!found)
				System.out.println("찾으시는 사원이 없습니다.");
		}//메서드의 끝 
		
		public static void getName(String name) { // 이름 검색 
			boolean found = false;
			
			for(int i = 0; i < ar.size(); i++) {
				String name1 = ar.get(i).getName();
				if(name.equals(name1)) {
					System.out.println(ar.get(i)); // toString() 메서드를 오버라이딩 했음으로 자동호출됨
					found = true;
					break;
				}
			}//for 문의 끝
			if(!found)
				System.out.println("찾으시는 사원이 없습니다.");
		}
		public static void getJob(String answer) { // 직책검색 
			boolean found = false;
			
			for(int i = 0; i < ar.size(); i++) {
				String job = ar.get(i).getPosition();
				if(answer.equals(job)) {
					System.out.println(ar.get(i));
					found = true;
					break;
				}
			}//for 문의 끝
			if(!found)
				System.out.println("찾으시는 직책이 없습니다.");
		}//메서드의 끝 
		
		public static void getDepartment(String answer) {
			boolean found = false;
			
			for(int i = 0; i < ar.size(); i++) {
				String departmnet = ar.get(i).getDepartment();
				if(answer.equals(departmnet)) {
					System.out.println(ar.get(i));
					found = true;
					break;
				}
			}// for의 끝
			if(!found)
				System.out.println("찾으시는 부서가 없습니다.");
		}// 메서드의 끝 
}



