package am;

// 자동차클래스를 상속받은 Sedan클래스 
public class Ex7_Sedan extends Ex7_Car {
	
	
	private boolean sunroof; // true: 유설치 false: 무설치 
	
	public Ex7_Sedan() {};
	
	public Ex7_Sedan(String model, int min_price, String type, boolean sunroof) {
		super(model, min_price, type); // 조상생성자를 가져옴 super() 
		this.sunroof = sunroof;
		
	}
	
	public boolean isSunroof() {
		return sunroof;
	}

	public void setSunroof(boolean sunroof) {
		this.sunroof = sunroof;
	}
	
}
