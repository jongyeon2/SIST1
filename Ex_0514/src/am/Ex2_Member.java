package am;

public class Ex2_Member {
// 우리반의 비상연락망을 만들고 싶다. 
//	"필요한 정보"들을 멤버필드로 선언한다.
	private String name, phone; // 그 사람의 이름

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public Ex2_Member() {};
	
	
	public Ex2_Member(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	
}
// 개발을 하기전 제품을 객체로 만들줄 알아야 하고,
// 그 객체를 만들기 위해 필요한 정보(속성과 기능)이 무엇인지 고민해봐야한다.
// 메서드가 반환형일때 해당 타입의 값을 호출한 곳으로 반환한다.
// 도서관 프로그램을 만들고 싶다.
// 책 이름, 도서번호, 출판사,위치 ,지금 빌려간 상태인지 아닌지