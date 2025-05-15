package pm;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex4_Company {

//	ArrayList 만들기 
//	ArrayList에 emp 객체들을 저장
//	searchEmp 메서드 생성 
		public static ArrayList<Ex4_Emp> ar = new ArrayList<Ex4_Emp>(5);
		
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
		
		
		
	public void getCleanup(int a) { // 사원 번호 검색
		int v1 = 0;
		for(int i = 0; i < ar.size(); i++) {
			 v1 = ar.get(i).getCleanup();
			if(v1 == a)
				break;			
		}
		System.out.printf("사원번호 %d 입니다.",v1);
	}
	
	public void getName (String answer) { // 사원 검색 
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < ar.size(); i++) {
			 sb.append(ar.get(i).getName());
			if(sb.equals(answer))
				break;
		}
		System.out.printf("사원 %s입니다.",sb);
	}
		
}



