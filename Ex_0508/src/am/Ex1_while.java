package am;

public class Ex1_while {

	public static void main(String[] args) {
		// while문의 구성 
		/*
		  while(조건식) {
		  	조건식에 만족시 수행하는 문장1;
		  	조건식에 만족시 수행하는 문장2;
		  		  		  
		 }
		 
		 1~10까지 반복하는 while문 작성
		 */
		int i = 0; // while문은 {}밖에서 변수선언과 초기화를 해주어야 한다. 
		
		while(i<10) {
			i++; // 증감식 을 안에다 적어주고
			System.out.printf("%-2d", i); // while(true)의 조건에 수행하는 문장 
		} //while문의 끝 
//			while문을 사용할 때 조심해야 할 것은
//			조건식을 언제가는 불만족시킬 수 있도록 증감 또는 
//			다른 식으로 구현해야 한다.
	}

}
