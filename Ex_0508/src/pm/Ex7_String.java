package pm;

public class Ex7_String {

	
	public static void main(String[] args) {
//		문자열 객체 생성 
		String str = "SiST";	// str이라는 변수에 "SiST"라는 문자열이 저장!
								// 암시적 객체생성 
		
		String str2 = new String("SiST"); // str2라는 변수에 
										// "SiST"라는 문자열이 저장! - 명시적 객체생성법 사용 
										// new라는 것은 기존에 똑같은 것이 있어도 새로 만들어서 준다.
										// 기본자료형(스택)영역 객체(힙)영역, 힙영역에 만들어진 객체는 주소가 저장된다.
										// 자바는 주소값 변경X 절대 불가X
		if(str == str2)
			System.out.println("서로 주소가 같다.");
		else
			System.out.println("서로 주소가 다르다"); //모양은 같지만 다른 집임
		
		if(str.equals(str2))  //equals() = 대소문자를 구별 해줌, equalsignoreCase() = 대소문자 상관없이 구별 해 준다.
			System.out.println("서로 내용이 같다.");
		else 
			System.out.println("서로 내용이 다르다.");
		
		String str3 = "SiST";
		
		if(str == str3)
			System.out.println("서로 주소가 같다.");
		else
			System.out.println("서로 주소가 다르다"); //모양은 같지만 다른 집임
		
		if(str.equals(str3))  //equals() = 대소문자를 구별 해줌, equalsignoreCase() = 대소문자 상관없이 구별 해 준다.
			System.out.println("서로 내용이 같다.");
		else 
			System.out.println("서로 내용이 다르다.");
		
//		  -문자열 즉, String객체는 생성법이 2가지로 나뉜다.- 
//		명시적 객체생성법 : new 라는 키워드로 생성하며 무조건 
//							새로운 객체를 생성 
//		암시적 객체생성 : 그냥 ""로 된 문자열을 저장하며
//						  이는 앞서 같은 암시적생성법으로 같은 내용을 
//						  만든 것이 있다면 기존 것을 재사용함	
		
//		그리고 정말 특이한 것은 
//		자바의 String객체는 불변적 특징을 가진다. (상수와 비슷)
	}

}
