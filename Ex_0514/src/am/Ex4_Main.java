package am;

import java.util.Scanner;

public class Ex4_Main {

	public static void main(String[] args) {
		Ex4_Vdm v1 = new Ex4_Vdm(); // 자판기 객체 생성 
		v1.setD1(); // 음료수 종류가 채워진 자판기
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insert Coin");
		int c = scanner.nextInt(); // 들어온 동전값
		
		String answer = v1.sold(c);
		System.out.println(answer);
		
		int a = scanner.nextInt();
		
		String answer1 = v1.choice(a);
		int answer2 = v1.pay(a);
	
		System.out.printf("%s를 선택하셨습니다\r\n",answer1);
		System.out.printf("잔돈 %d원 입니다",c - answer2);
		
	}

}
