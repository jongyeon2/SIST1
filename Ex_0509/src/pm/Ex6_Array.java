package pm;

import java.util.Arrays;
import java.util.Collections;


public class Ex6_Array {

	public static void main(String[] args) {
//		배열의 정렬 
//		정수 5개를 저장하는 배열을 만들자
		int[] ar = new int[5];
		
//		외부로부터 배열의 값을 받았다고 가정하자!
		ar[0] = 27;
		ar[1] = 9;
		ar[2] = 46;
		ar[3] = 17;
		ar[4] = 33;
		
//		sort() = 정렬 함수 
//		()가로안에 있는 내용을 인자라고 한다.
//		정렬을 시키기 위해 java.utill.Arrays객체를 활용해야 한다.
//		Arrays.sort(ar); // 오름차순 정렬 - 1만건 이하면 이게 나쁘지 않다.
		Arrays.parallelSort(ar); // 배열이 크고(10만 이상 또는 천만 이상)
//			 그 안에 있는 값들이 들쑥날쑥인 경우 parallelSort가 빠르고
//			 배열이 작고 크기가 1만건이하이고, 정렬이 된 경우 sort가 빠르다.
		
		for(int i = 0; i < ar.length; i++) {
			System.out.printf("%-3d", ar[i]);
		}
		System.out.println("");
//		내림차순을 정렬 시키기 위해서는 java.util.Collections가 필요
//		Collections는 기본자료형 배열로 하지 말고 객체자료형 배열로 해야한다.
//		int[] --- Integer[]
		
		Integer[] ar1 = new Integer[5];
		ar1[0] = 27;
		ar1[1] = 9;
		ar1[2] = 46;
		ar1[3] = 17;
		ar1[4] = 33;
		
		Arrays.parallelSort(ar1, Collections.reverseOrder());
		for(int i = 0; i < ar1.length; i++) {
			System.out.printf("%-3d", ar1[i]);
		}
		
//		실수형(float, double) 5개를 저장하는 배열!
		double[] ar2 = new double[5];
		Double[] ar3 = new Double[5];
		
//		래퍼클래스
		char c = 'A';
		Character c2 = c; // 기본자료형을 객체로 
		
		boolean b = true;
		Boolean b2 = true; // 기본자료형을 객체로
	}

}
