package pm;

import java.util.*;

public class Ex3_List {

	public static void main(String[] args) {
		// 배열과 같은 List구조를 생성, list의 한칸을 요소라고 한다.
		ArrayList<Integer> al = new ArrayList<Integer>(3); // 저장공간 3개를 설정 한다. 
//		[] 배열과 달리 ArrayList는 저장공간을 저장해주든 안 해주든 요소를 넣어주면 
//		저장한 만큼 길이가 늘어난다.
		
//		현재 List구조의 사이즈를 얻어내자.
		int size = al.size();
		System.out.printf("al.size(): %d\n", size);

		al.add(100);
		size = al.size();	// 1개추가	
		System.out.printf("al.size(): %d\n", size);
		
		for(int i = 1; i < 11; i++) {
			al.add(i);
		}
		size = al.size();	// 1 + 10 = 11개가 됨 	
		System.out.printf("al.size(): %d\n", size);
		
//		List 구조에 저장된 요소들을 하나씩 얻어내어 출력하는 반복문 
		for(int i = 0; i < al.size(); i++) {
//			List구조에 저장된 요소들을 하나씩 얻어낼 때는 
//			반드시 저장된 요소의 자료형을 알아야 한다.
			Integer v1; // 오토박싱 언박싱의 효과로 기본자료형인 int 로 작성해도 가능 
			v1 = al.get(i);
			System.out.printf("%-4d", v1);
		}// for의 끝
		
		al.remove(1); // ArrayList에서 1번지를 지운다, 즉 두번째 요소를 삭제한다. (0,1,2,3,4,5,6....)
		for(int i = 0; i < al.size(); i++) {
			Integer v2;
			v2 = al.get(i);
			System.out.printf("%-4d", v2);
		}//for 의 끝 
		System.out.println("\n삭제후 al.size():" + al.size());
		
		// 원하는 위치에 추가하기 - .add(insert());
		al.add(3, 400); // add(몇번지에 무슨 숫자를)
		for(int i = 0; i < al.size(); i++) {
			Integer v2;
			v2 = al.get(i);
			System.out.printf("%-4d", v2);
		}//for 의 끝 
		System.out.println();// 줄바꿈 
		
//		//ArrayList의 99라는 자원이 있으면 true 아니면 false
//		boolean chk = false;
//		for(int i = 0; i < al.size(); i ++) {
//			int v = al.get(i);
//			if(v == 99) {
//				chk = true;
//				break;
//			}
//				
//		}
//		if(chk)
//			System.out.println("99가 있습니다.");
//		else
//			System.out.println("99가 없습니다.");
//		boolean chk = al.contains(99);
		if(al.contains(99)) // true아니면 false로 나오는 값이 들어가면 된다.
			System.out.println("99가 있습니다.");
		else
			System.out.println("99가 없습니다.");
		
		if(al.contains(400)) // true아니면 false로 나오는 값이 들어가면 된다.
			System.out.println("400이 있습니다.");
		else
			System.out.println("400 없습니다.");
		
		if(al.contains(400)) {
			int idx = al.indexOf(400);
			System.out.printf("400이 %d위치에 있습니다.\r\n", idx);
		}
				
		al.clear(); // 모든 요소 삭제 
		System.out.printf("clear 후 사이즈: %d\n", al.size());
		System.out.printf("리스트가 비었을까?%b", al.isEmpty());
		
		
		
		// 리스트 구조에서 알아야 할 메서드(함수)들
//		- add : 추가, add(3, 400) - 3번 위치에 400을 추가
//		- get : 추출
//		- remove : 삭제
//		- size : 저장된 요소수 
//		- clear : 모두 삭제 
//		- contains : 포함여부 확인 
//		- isEmpty : 비어있는지 확인 
	}

}
