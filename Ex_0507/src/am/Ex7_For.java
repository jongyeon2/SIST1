package am;

public class Ex7_For {

	public static void main(String[] args) {
		// 1~10까지의 합을 구하는 반복문을 구현하시오
		
		int sum = 0; // 반복문 안에서 사용된 i의 값을 누적시킬 변수 
		for(int i = 1; i <=100 ; i++) {
			System.out.println(i);
			sum +=i; //만약에 여기서 int sum = 0;으로 초기화 시켰으면 반복문 때문에 계속 0으로 초기화가 된다.
//			그렇기 떄문에 {}밖에서 i의 값을 누적시킬 변수를 선언 해주고 사용해야 한다.
		}
		System.out.println("1~10까지의 합:" + sum);
	}

}
