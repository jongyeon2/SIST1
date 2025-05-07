package pm;

public class Ex5_Oper {

	public static void main(String[] args) {
		// 프로그램 시작 
		
		int v1 = 7;
		int v2 = 10;
		
		boolean result = v1 > v2; //v1이 v2보다 크다면 true!
		System.out.println("v1 > v2 = " + result); //v1이 v2보다 작기 때문에 false
		
		result = v1 >= v2; //v1이 v2보다 크다면 true!, 똑같은 이름의 변수 result를 한 것이 아니기 떄문에 가능 
		System.out.println("v1 > v2 = " + result); //v1이 v2보다 작기 때문에 false
		
	}

}
