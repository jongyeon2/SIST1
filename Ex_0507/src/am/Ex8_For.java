package am;

import java.util.Scanner;

public class Ex8_For {

	public static void main(String[] args) {
//		 문제1) 키보드로부터 숫자를 하나 받아서 변수 v1에 저장한 후
//		 1부터 v1인 만큼 반복하여 합을 구하는 프로그램 구현 
		
//		문제2) 10~50까지의 수들 중 난수를 하나 발생하여 
//		변수 su에 저장한 후 1부터 su인만큼 반복하여 
//		합을 구하시오 
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("값");
		int v1 = scanner.nextInt();
		int sum = 0;
		for(int i=1; i<= v1; i++) {
			sum += i;
		}
		System.out.println("1부터" + v1 + "까지의 합" + sum);
		
		int su = (int)(Math.random() * 40 +10);
		sum = 0; //sum변수 재사용 
		
		for(int i=0; i<=su; i++) {
			sum+= i; //누적 
		} // for의 끝
		System.out.println("1부터" + su + "까지의 합:" + sum);
	}

}
