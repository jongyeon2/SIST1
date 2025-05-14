package pm;

import java.util.Scanner;

public class Ex6_Main {

	public static void main(String[] args) {
//		야구 게임
		Ex6_BaseBall b1 = new Ex6_BaseBall();
//		컴퓨터가 가지는 수를 설정하자!
		b1.init();
		String s = b1.getCom();
		System.out.printf("com: %s\r\n", s);
		System.out.println("----------------------");
		
//		키보드로 부터 값을 받기위해 스케너 객체 생성
		Scanner scan = new Scanner(System.in);
		int cnt = 0; // 회차 
		int s1 = 0; // 스트라이크의 수를 받을 변수 
		
		do { // 반복처리 되는 영역 
			++cnt;
			System.out.printf("%d차: ", cnt);
			String str = scan.nextLine(); // 키보드로부터 한줄 입력받기!
			b1.user(str); // 사용자가 입력한 문자열을 숫자화 시켜서 user 배열에 저장함 
			if(str.length() > 3) { // 사용자가 3자이상 입력하였을때의 if 문 
				System.out.println("3자 입력하셔야 합니다.");
				continue;
			}

			s1 = b1.strikeCount(); // 스트라이크 수를 받아 while 밖에 있는 변수 s1에 초기화   
			int b = b1.ballCount(); // 볼의 수 
			System.out.printf("\r\n%d차시도-%d스트라이크, %d볼\r\n", cnt, s1, b);
				
		}while(s1 != b1.computer.length);
		
		System.out.printf("%d회차에 성공! - 프로그램 끝",cnt);
		
	}

}
