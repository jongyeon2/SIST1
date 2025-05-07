package am;

public class Ex5_For {

	public static void main(String[] args) {
		// 1~10까지 반복하여 출력하는 for문!
		
		/*
		 [for의 구성]
		 for(초기화시킨 식; 조건식; 증감식) 
		 	조건식에 만족할 때 수행하는 문장;
		 	문장식이 두개면 {}묶어줘야한다!
		 	 
		 */
//		for 안에 있는 int su라는 변수는 for 문안에서 만든 지역변수 이기 떄문에 
//		{}밖에서는 사용할 수 없다!
		for(int su = 1; su <=10 ; su++) {
			System.out.println(su);
		} //for의 끝
		
		System.out.println("--------------------");
//		증감연산자가 전위형이여도 똑같이 수행된다.
//		증감식에 대입연산자 i+=2인경우 2씩증가하는 반복식이 만들어진다.
//		초기식에 int형이 아니라 double(실수)도 가능하다.
		for(double i = 1; i<=10; i+=0.5) {
			System.out.println(i);
		} // 이렇게 할거면 int형으로 20보다 작거나 같을 떄까지 돌리는것이
//		     가독성에서는 더 유익하다.
		System.out.println("----------------------");
//		i = index의 앞글자를 따서 표현됨 
		for(int i=0; i < 10; i+=2 ) {
//			System.out.println(i); // 0~9까지 표현됨 
			System.out.println(i+1);
		}
		System.out.println("---------무한반복---------");
		for(;;) { // 아무것도 지정해 주지 않으면 무한으로 반복되는 반복식이 된다.
			System.out.println("^^");
		
	}

 }
}