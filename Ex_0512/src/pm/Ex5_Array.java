package pm;

public class Ex5_Array {

	public static void main(String[] args) {
//		1차원 배열들 준비
		int[] ar1 = {10, 20, 30, 40};
		
		int[] ar2 = new int[3]; // 0으로 초기화된 3길이의 배열
		int[] ar3 = new int[5];
		
		//위 3개의 1차원배열들을 하나로 묶는 2차원배열을 만들자
		int[][] ar = new int[3][]; // 가변 배열 생성 
		ar[0] = ar1; // 2차원 배열 ar 0번지에 ar1의 주소를 저장 
		ar[1] = ar2; // ar2의 주소를 저장
		ar[2] = ar3; // ar3의 주소를 저장 
		
		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j < ar[i].length; j++) {
				System.out.printf("%-3d", ar[i][j]);
			}// inner for 
			System.out.println(); // 줄 바꿈 
		}// Outer for 
	}

}
