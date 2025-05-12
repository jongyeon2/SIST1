package am;

public class Ex4_Array {

	public static void main(String[] args) {
//		0 0 0 0       1 0 0 0    -> ar[0][0]
//		0 0 0 0   =>  0 1 0 0 	 -> ar[1][1]
//		0 0 0 0 	  0 0 1 0 	 -> ar[2][2]
//		0 0 0 0 	  0 0 0 1	 -> ar[3][3]
		
		int[][] ar = new int[4][4];
		System.out.println("------초기내용--------");
		for(int i = 0; i< ar.length; i ++) {
			for(int j = 0; j < ar[i].length; j++) {
				System.out.printf("%-2d", ar[i][j]);
			}
			System.out.println();
		}
		
		
		System.out.println("--------1값 초기내용-----------");	
		for(int i = 0 ; i <ar.length; i++) {
			for(int j = 0; j <ar[i].length; j++) { // 1차원 배열의 길이만큼 반복 
				// 각 1차원배열을 접근하는 반복문 
				ar[i][j] = i == j ? 1 : 0; // i와 j가 같으면 1대입 아니면 0대입 
				System.out.printf("%-2d", ar[i][j]);
			}// 안쪽 for 문의 끝 
			System.out.println();
		}// 바깥 for 문의 긑 
		
	}

}
