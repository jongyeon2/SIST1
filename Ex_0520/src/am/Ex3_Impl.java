package am;

public class Ex3_Impl implements Ex3_Inter {

	@Override
	public void print() {
		System.out.println("Ex3_Impl의 프린트");

	}

	@Override
	public void testValue() {
		System.out.println("Ex3_Impl의 테스트벨류");
	}
	
//	Ex3_impl의 독단적인 기능들
	public void getValue() {
		System.out.println("Ex3_Impl의 겟벨류");
	}

}
