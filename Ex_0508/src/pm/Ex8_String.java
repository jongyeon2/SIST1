package pm;

public class Ex8_String {

	public static void main(String[] args) {
//		자바의 String객체는 불변적 특징을 가졌다.
		
		String str = "SiST";
		
		String str2 = "SiST";
		
//		str.concat("1234");  // 기존의 str이 기억하고 있는 값 뒤에 
							 // "1234"를 붙여준다.
	
//		concat() = 문자열 + 문자열 = 문자열 반환 
		
		
		String str3 = str.concat("1234"); // 위 같은 코드는 저장할 참조변수가 없기 때문에 SiST1234로 나오지 않지만
										  // 지금의 코드는 String str3(리모컨) 새로운 객체를 저장해줄 변수를 선언
										  // 해주었기 떄문에 SiST1234 라는 결과가 나온다.
		
		System.out.println(str3);
		
		System.out.println(str); // 1234로 결과가 나온다. 왜?
								 // String클래스는 불변적 특징을 가지기 떄문에
	
		if(str == str3) // str변수와 str3변수는 다른 객체의 주소를 가르키는 걸 알려준다.
			System.out.println("서로 주소가 같다");
		else 
			System.out.println("서로 주소가 다르다.");
	
	
	}

}
