package pdf;

public class pdf_2 {

	public static void main(String[] args) {
		// String 객체의 불변적 특징
		
		String s1 = "I Love You "; // String s1변수에 I Love You 값을 대입
		s1 = s1 + "Yun-A!";
		System.out.println("s1: " + s1);

	}

}
// 결과 I Love You Yun-A!
// 값을 받아줄 참조 변수 s1이 앞에서 선언했기 떄문에 
// 기존에 s1이 가르키던 객체 "I Love You"는 가비지 컬렉터에 의해 사라짐