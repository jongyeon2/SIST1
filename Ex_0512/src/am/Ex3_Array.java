package am;

public class Ex3_Array {

	public static void main(String[] args) {
//		정수형 2차원 배열 생성 
//		길이기 4개인 1차원 배열을 총 3개 저장하는 2차원 배열
		int[][] ar = new int[3][4];  
		/*
		  11 12 13 14
		  15 16 17 18 
		  19 20 21 22 
		
		ar[0][0] = 11; 
		ar[0][1] = 12; 
		ar[0][2] = 13; 
		ar[0][3] = 14;
		
		ar[1][0] = 15;
		ar[1][1] = 16;
		ar[1][2] = 17;
		ar[1][3] = 18;
		
		ar[2][0] = 19;
		ar[2][1] = 20;
		ar[2][2] = 21;
		ar[2][3] = 22;
		
		위와 같은 초기화를 반복문을 이용하여 처리하자!
		*/
		int value = 11; // 시작하는 숫자.
		for(int i = 0; i < ar.length; i++) { // ar.lenght : 2차원 배열에 대한 길이  
			
			for(int j = 0; j < ar[i].length; j++) { // ar[i].lenght : 1차원 배열에 대한 길이 
				ar[i][j] = value++; // 각 
				System.out.printf("%-3d", ar[i][j]);
			}// 안쪽 for 문
//			1차원 배열이 하나씩 반복처리가 끝날 때마다 줄바꿈 
			System.out.println(); // 줄 바꿈 
		} // 바깥쪽 for 문 
		
	}

}
