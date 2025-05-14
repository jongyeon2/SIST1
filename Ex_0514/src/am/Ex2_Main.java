package am;

public class Ex2_Main {

	public static void main(String[] args) {
//		멤버 생성
		Ex2_Member[] ar = new Ex2_Member[3];
//		Member를 기억하기위한 3개의 "공간"만 만들어진것 뿐 
//		배열안 주소에 하나씩 객체를 넣어 주어야 한다.
		ar[0] = new Ex2_Member("마루치","010-1234-5678");
		ar[1] = new Ex2_Member("아라치","010-0123-5678");
		ar[2] = new Ex2_Member("파란해골","010-0123-1212");
				
				
	}

}
