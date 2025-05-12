package am;

public class Ex2_Array {

	public static void main(String[] args) {
//		2차원 배열을 생성하자!
//		int[][] ar = new int[2][] 문법상의 오류는 없지만, 실행하면 오류가 발생!
		int[][] ar = new int[2][3]; // 길이가 3인 1차원 배열을 2개 를 가르키는 ar참조변수 
		
		// ar.lenght = 2차원 배열의 길이를 반복하는 반복문(행)
		for(int i = 0; i < ar.length; i++) {
			// 각 1차원 배열을 반복하는 반복문
			for(int j = 0; j < ar[i].length; j++) { // 열 단위의 반복문
				System.out.printf("%-2d", ar[i][j]);
			}
			System.out.println(); // 줄바꿈 : 1차원 배열이 하나 출력할때 마다 줄 바꿈 
		}
		
	}

}
// NullPointerException = 2차원 배열에 들어갈 값이 없다. 없음(null) null이 들어가서 오류 발생 
// 행과 열로 생각하기보다는 그림을 생각 하는게 좋다.