package pm;

import am.Ex7_Car;
import am.Ex7_Sedan;


public class Ex8_Main {

	public void test(Ex7_Car n) {
		System.out.println(n.getmin_price());
		
//		인자로 넘어온 n이 가리키는 인스턴스안에 Ex8_SUV가 있는지 검증 가능 
		if(n instanceof Ex8_SUV) {
//			여기는 n이 가리키는 인스턴스 안에 Ex8_SUV가 있을 때만 수행함!
			Ex8_SUV suv = (Ex8_SUV)n; //자손 객체로 형변환 
			System.out.println(suv.isHud());
		} else if(n instanceof Ex7_Sedan) {
			Ex7_Sedan sedan = (Ex7_Sedan) n;
			System.out.println(sedan.isSunroof());
			//suv, sedan은 지역변수 
		}	
	}
	
	
	public static void main(String[] args) {
//		원하는 객체를 생성
		Ex8_SUV gv90 = new Ex8_SUV();
		gv90.setModel("GV90");
		gv90.setMin_price(10000);
		gv90.setHud(true);
		
//		생성자로 객체를 생성 
		Ex7_Sedan g90 = new Ex7_Sedan("G90", 9000,"",true);
		
//		
		Ex8_Main main = new Ex8_Main();
		main.test(gv90);
		main.test(g90); // 
		
	}

}
// 참조변수의 형변환은 범위가 넓어짐으로 많은 사용을 권장하진 않는다.