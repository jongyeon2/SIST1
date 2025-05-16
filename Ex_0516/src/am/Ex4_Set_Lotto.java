package am;

import java.util.*;


public class Ex4_Set_Lotto {

	public static void main(String[] args) {
//		set 구조로 로또를 만들어보자;
		Set<Integer> lotto = new TreeSet<>();
		
		while(lotto.size() < 6) { // 로또를 출력하는 수의 개수가 6이 되기전까지 반복 
			int random = (int)(Math.random() * 45 + 1);
			lotto.add(random);
		}// while문의 끝 
 		
		System.out.println(lotto); // TreeSet에 toString()메서드가 있어서 이렇게 해도 출력됨
		
		Iterator<Integer> it = lotto.iterator();
		while(it.hasNext()) { // 다음 요소 확인 
			int su = it.next();
			System.out.printf("%-3d",su);
		}
		
		
	}

}
