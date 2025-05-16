package am;

import java.util.ArrayList;
import java.util.List;

public class Ex1_List {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>(); // String만 저장 가능
		String s = new String("SiST"); // 명시적 객체 생성 
		String s1 = "SiST"; // 암시적 객체 생성 
		
//		저장가능
		list.add(s1);
		list.add("123");
		list.add("abc");
		list.add(s);
		list.add("SiST"); // s1과 같은 암시적 객체생성
		
		System.out.printf("list size():%d\n", list.size()); // 5
		
//		변수 s1와 같은 객체가 어디에 저장되었는디? 알아보는 반복문 
		for(int i = 0; i < list.size(); i++) {
//			Arraylist에서 하나씩 얻어낸다.
			String v1 = list.get(i);
			if(v1 == s1) { // v1과 s의 주소가 같니?
				System.out.printf("찾으시는 s가 index %d에 있습니다.\n",i);
			} 
		}
		System.out.println("-----------------------------------");
			if(list.contains(s1)) { // 같은게 있는지 확인 false, true 로 반환
				int idx = list.indexOf(s1); //
				System.out.printf("s1이 list에 %d번지에 존재합니다.", idx);
			} else {
				System.out.println("s1이 list에 존재하지 않습니다.");
			} 
	}

}
