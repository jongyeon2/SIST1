package pm;

import java.util.Scanner;

public class Ex12_local_var {

	public static void main(String[] args) {
		//프로그램 시작
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("값:");
		int v1 = scanner.nextInt();
	/*	
		if(v1 >= 60) {
			// if문의 영역
			String str = "합격"; // if문 영역의 지역변수 LV  
			System.out.println(str);
		} else {
			String str = "재도전"; // else영역의 지역변수
			
		} 
		// if{}안의 str과 else{}안의 str은 이름이 같으나 지역변수(lv)이기 떄문에 이름이 같아도 괜찮
		// 그리고 지역변수(lv)는 해당 지역이 벗어나면 소멸된다.
	*/
	String str = "";
	
	if(v1 >= 60) {
		str = "합격";
		System.out.println(str);
	} else {
		str = "재도전";
		System.out.println(str);
	}
	}
	
}
