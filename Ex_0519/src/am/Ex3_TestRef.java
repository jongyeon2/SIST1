package am;

public class Ex3_TestRef {
	
//	test함수를 호출하기 위해서는 반드시 인자를 
//	Ex3_Member객체의 주소를 넣어야 한다. 
	public void test(Ex3_Member n) {
		n.setName("쌍용교육센터");
	}// 함수의 끝을 만나면
//		호출한 곳으로 돌아간다. 이때 
//		지역변수인 n은 소멸된다.
}
