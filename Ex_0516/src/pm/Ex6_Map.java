package pm;

import java.util.ArrayList;
import java.util.HashMap;

public class Ex6_Map {

	public static void main(String[] args) {
		
				Ex6_Emp e1 = new Ex6_Emp("1200", "마루치", "개발1팀");
				Ex6_Emp e2= new Ex6_Emp("2021", "홍길동", "개발2팀");
				Ex6_Emp e3 = new Ex6_Emp("1007", "을불", "개발2팀");
//		사원을 의미하는 객체 Emp를 준비하자!
		

//		Ex6_Emp e1 = new Ex6_Emp();
//		e1.setEmpno("1200");
//		e1.setEname("마루치");
//		e1.setDept("개발1팀");
//		
//		Ex6_Emp e2 = new Ex6_Emp();
//		e2.setEmpno("2021");
//		e2.setEname("홍길동");
//		e2.setDept("개발2팀");
//		
//		Ex6_Emp e3 = new Ex6_Emp();
//		e3.setEmpno("1007");
//		e3.setEname("을불");
//		e3.setDept("개발1팀");
//		
//		Ex6_Emp라는 자리에 
//		HashMap<String, Ex6_Emp> map = new HashMap<>();
//		map.put("1200", e1);
//		map.put("1007", e2);
//		map.put("2021", e3);
		
//		먼저 위 3개의 객체들을 ArrayList에 저장하자!
		ArrayList<Ex6_Emp> list = new ArrayList<>();

//		내가 만든 list에 사원정보들을 넣어준다.
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
//		사원정보들을 모두 가진 List구조를 Map에 저장하자!
		HashMap<String, ArrayList<Ex6_Emp>> map = new HashMap<>();
		map.put("list", list); //리스트라는 이름에 내가 만든 list를 저장했다.
		
		ArrayList<Ex6_Emp> al = map.get("list");
		
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i).toString());
		}	
		
		}
	}
// 		웹이랑 앱을 만들때 백엔드에서는 제이슨 기법으로 