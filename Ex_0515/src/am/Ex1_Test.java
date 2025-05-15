package am;

public class Ex1_Test {
//		멤버변수
	private String name;
	private int age;
	
//	생성자는 반드시 접근제한자가 있어야 하며, 반환형은 명시하지 않는다.
//  이름은 반드시 클래스명과 같아야 한다.
	public Ex1_Test(String name, int age) {
//		받은 인자들을 멤버필드에 저장하는걸 목적으로 함 - 인자들은 모두 지역변수이다.
		this.name = name;
		this.age = age;
	}// 생성자의 끝 
	
	public Ex1_Test() {} // 기본생성자 
						    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
