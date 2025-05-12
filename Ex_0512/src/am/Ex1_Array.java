package am;

public class Ex1_Array {

	public static void main(String[] args) {
//		객체자료형 배열을 생성하자
		String[] ar = new String[3];
//		암시적 객체 생성;
		ar[0] = "100"; // 암시적 객체 생성 
		ar[1] = "222";
//		ar[2] = "300";
//		ar[2] = "100"; 암시적 객체생성
		ar[2] = new String("100"); // 명시적 객체 생성(heap에 새로운 공간을 생성후 100대입) 
		
		for(int i = 0; i < ar.length; i++) 
			System.out.printf("%s,", ar[i]); 
			
			System.out.println("---------------------------");
			
			if(ar[0] == ar[2]) // 암시적 객체 생성으로 인해 바라보는 곳이 같기 때문에
				System.out.println("0번지와 2번지의 참조주소가 같다.");
			else
				System.out.println("0번지와 2번지의 참조주소가 다르다.");
			
			System.out.println("---------------------------");

			
			if(ar[0].equals(ar[2])) // 명시적 객체 생성으로 인한 결과 
				System.out.println("0번지와 2번지의 참조주소의 내용이 같다.");
			else
				System.out.println("0번지와 2번지의 참조주소의 내용이 다르다.");	

			System.out.println("---------------------------");
			
			String str = "쌍용교육센터:3강의장:오경주"; // :을 중심으로 배열을 다시 만들 수 있다.
			
//			str에 저장된 문자열에서 ":"을 중심으로 분할처리 하여 배열로 반환한다.
			String[] ar1 = str.split(":");
			
			for(int i = 0; i < ar.length; i++) {
				System.out.println(ar1[i]);
			}
	}

}
