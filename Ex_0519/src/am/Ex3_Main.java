package am;

public class Ex3_Main {

	public static void main(String[] args) {
//		원하는 객체 생성 
		Ex3_TestRef c = new Ex3_TestRef();
		
//		멤버 객체 생성
		Ex3_Member mem = new Ex3_Member();
		mem.setName("SiST");
		
		System.out.println(mem.getName()); // SiST
		
		c.test(mem); // 참조변수를 인자값을 줌으로써 주소를 보내줌 
		System.out.println(mem.getName()); // 쌍용교육센터 
			
	}

}
// 인텔리제이는 6월에 쿠폰을 줌 
