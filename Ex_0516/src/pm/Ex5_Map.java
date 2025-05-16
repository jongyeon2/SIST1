package pm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex5_Map {

	public static void main(String[] args) {
//		Map 구조 : 키와 값을 하나의 쌍으로 저장하는 구조 
//				   Key는 중복불가
		HashMap<Integer, String> map = new HashMap<>();
		
		String s1 = new String("SiST");
		String s2 = "SiStT";
		String s3 = "쌍용교육센터";
		String s4 = "SiST";
		
//		Map 구조에 저장하자
		map.put(100, s1);
		map.put(200, s4);
		map.put(300, s3);
		map.put(400, s2);
//		map.put(300, s2);
		System.out.printf("map.size():%d\n", map.size()); // 4
		
//		값 가져오기 (반드시 키를 활용해야 함)
		String v1 = map.get(300); // 키 300과 연결된 value가 v1에 저장된다.
		System.out.printf("map.get(300):%s\n", v1);
		
//		삭제기능
		map.remove(100);
	
		System.out.printf("100삭제 후 map.size():%d\n", map.size()); //3
		
//		키의 값을 모를떄(map은 키의 값을 알아야 수행할 수 있는 메서드가 많기 떄문에)
//		모든 키를 먼저 얻어낸다.
//		아래와 같이 작성할 경우 
		Set<Integer> set = map.keySet();
		Iterator<Integer> it = set.iterator(); // 반복자 얻어내기 
		while(it.hasNext()) {
//			it에는 모두 키들만 존재한다.
			int key = it.next(); // 200, 300, 400
			String value = map.get(key); // 200,300,400중 연결된 value가 들어간다.
			System.out.printf("키:%d, 값:%s\n", key, value); // 이렇게 작성시 무슨값에 어떤것이 왔는지 알 수 있다.
		}// while문의 끝 
		
		
	}

}
