package am;

public class Ex6_For {

	public static void main(String[] args) {
		//프로그램 시작
		// 1~20까지 반복처리하는 반복문을 구현하자!
		// 단, 3의 배수만 출력해야 한다.
		
		for(int i = 1; i <= 20 ; i++) {
//			i가 3의 배수일 떄만 출력하면 된다. 그럼 비교문 사용해야 함 
			if(i%3==0)
				System.out.println(i+"**");
			else // else 문을 이용하여 20번 반복을 했는지 정확하게 확인할 수 있다.
				System.out.println(i);
		}
		System.out.println("----------------------------");
//		밑의 예제는 위와 결과가 같으나 1~20까지 반복한게 아니라,
//		[3,6,9,12,18]6번 반복 수행한 결과임으로 위의 풀이가 더 정확하다.
//		위와 같이 else문으로 확인조차 불가능 6번 밖에 반복수행을 하지 않았기 때문 
		for(int i=3; i<=20; i+=3) {
			System.out.println(i);
		}
		
	}

}
