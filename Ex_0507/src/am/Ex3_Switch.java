package am;

public class Ex3_Switch {

	public static void main(String[] args) {
//		 1~12까지의 난수를 발생하여 월의 값으로 가정하자!
//		해당 월의 최대날짜 수를 출력하자!
		int month = (int)(Math.random() * 12 + 1);
		
		switch(month) {
			case 1 :
			case 3 :
			case 5 :
			case 7 :
			case 8 :
			case 10 :
			case 12 :	
				System.out.println("31일까지 입니다");
				break;
			case 4 :
			case 6 :
			case 9 :
			case 11 :
				System.out.println("30일까지 입니다.");
				break;
			case 2 :
				System.out.println("29일까지 입니다.");
				break;
		} 
//		범위 비교는 if문이 편하다
//		예를 들어 1~100까지라면? case1~100까지 작성을 해줘야한다고 상상해봐라 
		//switch의 끝
		
	}

}
