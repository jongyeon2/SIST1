package am;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex3_Set {

	public static void main(String[] args) {
//		중복을 허용하지 않고, 인덱스가 없다. 그리고
//		정렬을 지원하는 Set구조가 TreeSet
		TreeSet<String> set = new TreeSet<>();
		TreeSet<String> set1 = new TreeSet<>();
		
		String s = new String("SiST");
		String s1 = "SiST";
		
//		set구조에 저장!
		set.add(s1);
		set.add(s);
		set.add("123");
		set.add("abc");
		set.add("SiST");
		
		set1.add("a");
		set1.add("b");
		set1.add("c");
		set1.add("d");
		set1.add("e");
		set1.add("f");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) { // 커서 다음칸에 요소가 있는지 확인 
//			다음 칸으로 이동하여 요소 가져오기 
			String n = it.next();
			System.out.println(n); // 아스키 코드 값으로 정렬 됨 1 -> S -> a
		}
	}

}
