package pdf;

public class pdf_1 {

	public static void main(String[] args) {
//		String 객체 비교
		
		String s1 = "Twinkle";
		String s2 = "Twinkle";
		
		if(s1 == s2)
			System.out.println("s1과 s2는 같다.");
		else
			System.out.println("s1과 s2는 같지 않다.");
		
		String s3 = new String("Little Star");
		String s4 = new String("Little STar");
		if(s3.equals(s4)) // == 에서 equals() 함수를 사용해서 비교했을 경우 
//							 s3과 s4는 같다라고 출력된다.
			System.out.println("s3과 s4는 같다");
		else
			System.out.println("s3과 s4는 같지 않다.");
	}

}
// 예상 결과 
// s1과 s2는 같다
// s3과 s4는 같지 않다. 왜? new로 String 객체를 하나씩 생성해 줬기 때문
// 주소가 아닌 값을 비교하려면 equals()를 사용해서 비교해 주어야 한다.