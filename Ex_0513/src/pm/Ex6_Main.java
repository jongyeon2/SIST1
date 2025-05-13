package pm;

import java.util.Scanner;

public class Ex6_Main {

	public static void main(String[] args) {
//		야구 게임
		Ex6_BaseBall b1 = new Ex6_BaseBall();

		do {
			b1.ballCount  = 0;
			b1.Strikecount = 0;
			
			b1.init();
			b1.user();
			System.out.printf("%dStrike, %dBall\r\n", b1.strikeCount(),b1.ballCount());
				
		}while(b1.Strikecount!=3);
		
		System.out.printf(--b1.cnt + "회차에 성공!");
		
	}

}
