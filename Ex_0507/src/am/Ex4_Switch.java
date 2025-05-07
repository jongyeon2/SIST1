package am;

public class Ex4_Switch {

	public static void main(String[] args) {
//		문제) 1~20까지의 수들 중 난수를 받아 su라는 변수에 저장한다.
//		su의 값이 짝수인지? 홀수인지?를 판단하는 프로그램을
//		switch문으로 구현하시오

		int su = (int)(Math.random()*20 +1);
		
//		조건식이 아니라 조건값이 들어와야되기 떄문에 좀 까다로웠음
//		switch(안에 su%2를 입력)해주면 조건식도아닌 값이 되기 떄문에 switch문으로 표현 할 수 있다.
		
		switch(su%2) {
		case 0 : 
			System.out.println(su + "짝수입니다");
			break;
		case 1 :
			System.out.println(su + "홀수입니다");
		}
			
	}

}
