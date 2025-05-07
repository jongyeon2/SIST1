package am;

public class Ex1_Multi_if {

	public static void main(String[] args) {
		// 1~10까지의 수들 중 난수 발생 , (int) Math.random() * 10 +1
		// 56 ~ 100 까지의 수들 중 난수 발생, (int)Math.random() * 
		// Math.random() * 범위의 개수 를 적어주면 해결 + 시작수
		int ran = (int)(Math.random()*10+1);
		
		//ran의 값이 홀수인지? 짝수인지? 판단하자!
		//if-else문으로 가능 
		//짝수란? 2로 나눴을 때 나머지가 0인 값
		
		if(ran%2 == 0) {
			System.out.println(ran +"짝수");
		} else {
			System.out.println(ran + "홀수");
		}
	}

}
