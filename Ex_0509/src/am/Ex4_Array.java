package am;

public class Ex4_Array {

	public static void main(String[] args) {
//		정수 3개짜리 배열을 생성하자
		int[] ar1 = new int[3];
//		생성만 해도 초기값이 0인걸 확인할 수 있다.
		System.out.printf("%2d,%2d,%2d",ar1[0],ar1[1],ar1[2]);
		/*
		 ar1[0] = 10; 
		 ar1[1] = 20; 
		 ar1[2] = 30; 
		 */
		
		for(int i = 0; i < ar1.length; i++) {
			ar1[i] = (i+1) *10;
		}
		System.out.printf("%n%2d,%2d,%2d", ar1[0],ar1[1],ar1[2]);
		
	}

}
