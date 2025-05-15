package pm;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex4_Company {

//	ArrayList 만들기 
//	ArrayList에 emp 객체들을 저장
//	searchEmp 메서드 생성 
		ArrayList<Ex4_Emp> ar = new ArrayList<Ex4_Emp>(5);
		Scanner scanner = new Scanner(System.in);
		
		public void init()
		{
			Ex4_Emp e1 = new Ex4_Emp(20222468,"백종연","인턴","인사");
			Ex4_Emp e2 = new Ex4_Emp(20224568,"김준수","인턴","개발");
			Ex4_Emp e3 = new Ex4_Emp(20228986,"심재탁","사원","개발");
			Ex4_Emp e4 = new Ex4_Emp(20246898,"김완희","사원","인사");
			Ex4_Emp e5 = new Ex4_Emp(20004899,"오경주","사장","개발");
			ar.add(e5);
			ar.add(e4);
			ar.add(e3);
			ar.add(e2);
			ar.add(e1);
		}
		
		
		
	public Ex4_Emp getCleanup(int a) {
		if(ar.contains(a)) 
			return ar.get(a);
	
			return null;
		
		ar.get(0).
	}
	public Ex4_Emp getName (String answer) { // 사원 검색 
	
		if(ar.contains(answer)) {
			return ar.get(answer);
		}
	}
		
	
}


