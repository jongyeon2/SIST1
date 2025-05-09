package am;

public class Ex3_String {

	public static void main(String[] args) {
//		String클래스의 함수들 
		
		String str = "안녕하세요 금요일이군요.";
		
		int size = str.length();
		
//		 str이 기억하고 있는 문자열에서 "하"가 있는 위치
//		index값(정수)를 알아내자!
		int idx = str.indexOf("하"); 
		System.out.println("str.indexOf(\"하\"): " + idx);
		 
//		"요"의 위치를 찾아보자!
		int idx2 = str.indexOf("요"); // 왼쪽기준으로 가장 가까운 "요"
		System.out.println("str.indexOf(\"요\"): "+ idx2);
		
//		찾은 "요" 이후에 있는 "요"를 검색하자!
		int idx3 = str.indexOf("요", idx2+1); // idx2는 "요"를 찾은 값인 4의 자리이기 때문에 idx를 지정해주면 
//												 이미 "요"를 찾은 자리인4부터 검색하기 때문에 그 이후의 자리인 5부터 검색을위해
//												 +1을 해준다.
		System.out.println("str.indexOf(\"요\", idx2+1): " + idx3 );
		
		int idx4 = str.lastIndexOf("요"); // 검색을 뒤에서부터 시작함
//											 하지만 index값이 바뀌는 것은 아니다.
		System.out.println("str.lastIndexOf(\"요\"): " + idx4); //11!
		System.out.println("------------------------------------------------");
		
		String file_name = "   Ex1.java   "; // 외부에서 인자로 받았다고 가정하고 
//		내용은 모른다고 생각하자
//		받은 파일이 자바파일 또는 텍스트 파일인지? 판단하자
		
		String t_fname = file_name.trim();  
//		if문의 trim()함수를 보면 file_name의 값이 양쪽 공백이 제거된 값일 것 같지만.
//		String클래스는 불변의 특징을 가지고 있기 때문에 file_name = "   Ex1.java   "로 공백이 남아있는 값이 반환된다.
		
		if(file_name.trim().endsWith(".java")|| file_name.trim().endsWith(".txt")) { 
			System.out.println("자바 또는 텍스트파일입니다.");
		} else {
			System.out.println("처리할 수 없습니다.");
		} 
		
//		a를 찾아서 *로 변경하자!
		String ss = t_fname.replaceAll("a", "*");
		System.out.println(t_fname);// Ex1.java
		System.out.println(ss); // Ex1.j*v*
		
//		trim() = "앞,뒤" 공백을 제거한 String 객체를 반환해준다.
//	지금 까지 String 함수를 여럿 써본 결과 문자열의 값을 편집하는게 아니라 이동하기 꺼내서 확인하고등등 
//  의 상황을 보아 String은 불변의 특징을 가진것을 알 수 있다.
	}

}
