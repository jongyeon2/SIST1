package pm;

import java.util.Scanner;

public class Ex8_Test {

	public static void main(String[] args) {
//		숫자 야구 프로그램을 만들자
		int[] computer = new int[3]; //문제를 제시할 컴퓨터가 가지고 있는 3개의 난수공간
		boolean chk = true;
		int Strike = 0;
		int ballcount = 0;
		int cnt = 1; // 시도한 횟수
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		
		do { // 무한 반복문 선언 
			
			for(int i = 0; i < computer.length;) {
				computer[i] = (int)(Math.random() * 9 + 1);
				for(int j = 0; j < i ; j++) {
					if(computer[i] == computer[j]) {
						chk = false;
						break;
					}
				}
				if(chk)
					i++;
			}
			
			System.out.print("3자리 숫자를 입력해주세요"); 
			
			int number = scanner.nextInt(); // 사용자로부터 받을 3자리의 숫자 int 
			
			
			int[] n = new int[3]; // 사용자로부터 받은 3자리 한자리씩 받아올 int형 배열 
			
			for(int i = 0; i < n.length;) {
				if(number < 0 || number > 999  )
					return;
					number += number%10;
			
				for(int j = 0; j < i; j++) {
					if(j < i) { //숫자가 중복이 되면 
						chk = false;
						ballcount++;
					} else if(i == j)
						chk = false;
						Strike++; 
				}
				i++;// for 문의 끝 
				System.out.printf("Strike = %d, Ball = %d",Strike, ballcount);
			}
			
				}while(Strike == 3);
			}
	}


