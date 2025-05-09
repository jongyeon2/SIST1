package pdf;

public class Pdf_3 {

	public static void main(String[] args) {
//		프로그램 시작
		int count = 0;
		
		String msg = ++count + "little, " + ++count + "little, " + ++count + "little Indian";
		
		System.out.println(msg);
		System.out.println(msg.getClass());
		
		
	}

}

// [결과]
// "1 little 2 little 3 little Indian
// getClass() 함수로 결과를 확인했을때 String 클래스라는것을 확인
// 따라서 숫자 + 문자열은 = "문자열"로 값이 변경 된다.