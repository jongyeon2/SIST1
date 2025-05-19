package am;

public class Ex7_Main {

	public static void main(String[] args) {
//		원하는 세단클래스를 생성하자!
//		car에서 생성자를 상속받은 sedan 클래스의 생성자로 새로운 인스턴스 생성 
		Ex7_Sedan gr1 = new Ex7_Sedan("그랜저", 2700,"",true);

//		밑의 메서드를 이용해도 위에 생성자로 만든 인스턴스와 똑같다.
		gr1.setModel("그랜져300");
		gr1.setMin_price(2700);
		gr1.setSunroof(true);
		
//		위의 결과와 마찬가지 
		Ex7_Sedan g80 = new Ex7_Sedan("G80",8000,"",false);
		g80.setModel("G80");
		g80.setMin_price(8000);
		g80.setSunroof(false);
		
		if(gr1.equals(g80))
			System.out.println("서로 내용이 같다.");
		else
			System.out.println("서로 내용이 다르다.");
	}

}
