package pm;

public class Ex7_Array {

	public static void main(String[] args) {
//		2차원 배열의 값중 랜덤 값 출력하기 
		
		String[][] ar = {
				{"다이아", "금두꺼비", "꽝", "로또1등"},
				{"꽝", "황금알","비누","아파트"},
				{"꽝","천원","꽝","거품"}
		};
		
		int	random = (int)(Math.random() * ar.length); // 0, 1, 2
		int random1 = (int)(Math.random() * ar[random].length); // 0, 1, 2, 3
		
		System.out.printf("%-4s(이)가 선택되었습니다.",ar[random][random1]);
	}

}

// 정수형3 개의 배열 을 생성 후 각 공간마다 랜덤한 수가 들어간다(1~9) computer
// 중복 허용X 
// 화면에 1차 : 나오게하고 숫자 3개 입력
// 예를 들어 숫자 345를 입력 같은 자리에 같은 숫자가 들어가면 "Strike" 출력
// 3 자리가 다 맞으면 3strike 