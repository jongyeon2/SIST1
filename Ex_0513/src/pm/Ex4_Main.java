package pm;

public class Ex4_Main {

	public static void main(String[] args) {
//		문자열 객체 생성
		String s1 = new String("SiST");
		
		String s2 = s1.concat("교육센터"); // .concat() : 문자열 연결 함수 
		System.out.println("s1:" + s1); //SiSt
		System.out.println("s2:" + s2); // SiSt교육센터 
		
		
		//String은 편집할 수 없다. 무조건 새로 만들어진다.
//		문자열 편집을 위해 StringBuffer를 사용하자!
		StringBuffer sb = new StringBuffer("SiST"); // Buffer = 임시기억장소 
		StringBuffer sb2 = sb.append("교육센터"); 
		System.out.println("sb:" + sb.toString()); // SiST교육센터
		System.out.println("sb2:" + sb2.toString()); // SiST교육센터 , toString() = String자료형으로 바꿔준다.
		
		if(sb == sb2)
			System.out.println("서로 주소가 같다.");
		else
			System.out.println("서로 주소가 다르다");

	}

}
