package am;

public class Ex7_if {

	public static void main(String[] args) {
		//프로그램 시작 
		
		int su = 10;
		
		// su의 값이 10이상이면 화면에 "10점 이상"이라는 
		// 문자열을 출력하고자 한다.
		
		// if문의 구성		
		// [구성]
		// if(조건식)
		if(su >= 10) { // 브레이스 = 블럭 
		//    조건식이 만족할 때 수행하는 문장;  
			System.out.println("10점 이상");
		    System.out.println("두번째 문장");
		} // if문의 끝
		System.out.println("프로그램 끝"); // if 문과는 상관없음 
	}

}
