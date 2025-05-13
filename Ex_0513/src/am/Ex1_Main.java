package am;

import java.util.Scanner;

public class Ex1_Main {

	public static void main(String[] args) {
		// 프로그램 시작 
		
		// 키보드로부터 컬러문자열을 받는다.
		System.out.println("입력:");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		// Ex1_Color라는 객체가 필요하다고 가정하자! 그럼 가져와서 생성해야 한다.
		Ex1_Color c1 = new Ex1_Color(); // Ex1_Color라는 인스턴스 생성됨 

		// 생성된 객체가 가지는 color라는 변수를 출력하자
//		System.out.println(c1.color);
		
//		c1이 가지고 있는 color의 값을 반환하는 동작을 호출하자!
		String s1 = c1.getColor(); // 이 함수가 반환하는 값을 받아줄 변수를 선언해 주어야한다.
		System.out.println(s1);  // 함수 재사용 가능 
		
//		키보드로 받은 색상 문자열을 setColor를 호출하면서 인자로 넣어준다.
		c1.setColor(str); 
//		System.out.println(c1.Color); // str의 값이 출력 되어야 한다.
		
		System.out.println(c1.getColor()); // 필요할때 한번 재활용 불가 
		
	}

}
