package pm;

public class Ex6_DoWhile {

	public static void main(String[] args) {
		// for, while, dowhile
//		do while문의 구성
		/*
		 do {
		 실행할 문장;
		 } while(조건식); <-- 세미콜론 잊지말기
		 
		 앞서 배운 for와 while문과 다르게 선처리, 후 비교!
		 무조건 한번은 수행하는 형태다.
		 
		 : '@'문자를 5번 반복하는 문장을 do while로 구현하자.
		 */
		int i = 0; // 반복할 횟수, 조건식에 맞지 않아도 한번은 수행한다.
		do {
			System.out.printf("%-2c", '@');
			++i;	//증감식을 적어주어야 무한반복에 걸리지 않는다.
			if(i%3 == 0)
				break;
		} while(i<5);
		
		System.out.println("-------------------------");
		
//		1~10까지 반복 수행한다. 이때 3의 배수는 출력하지 않아야 한다.
		int j = 1;
		do {
			if(j%3 != 0)
				System.out.printf("%-3d",j);
			++j;  // if문과 상관없이 무조건 수행해야 하므로 따로 구현해 준다.
			
		} while(j<11);
		
		System.out.println("----------------------");
		
		int k = 0;
		do {
			++k;  // if문과 상관없이 무조건 수행해야 하므로 따로 구현해 준다.

			if(k%3 == 0|| k > 10) //3의 배수이거나 k가 10보다 크다면
				continue; // 다음 반복회차로 이동 조건식으로 이동한다.
//			반복문이 있는 상황에서 반복문을 빠져나가는건 싫고 어떤 부분은 하고싶을때 = continue
			
				System.out.printf("%-3d",k);
				
			
		} while(k<11);
		
	}

}

// 회사에 신입으로들어가서 sql 문장을 바꾸는 유지보수 일을 주로 한다라고 기억하심
// 자바를 배웠으니? 파이썬? 쌤이랑 게시판3번 만듬 