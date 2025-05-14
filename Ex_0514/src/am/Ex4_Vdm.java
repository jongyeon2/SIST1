package am;

public class Ex4_Vdm {
	Ex4_Drink[] d1 = new Ex4_Drink[4]; // 4개의 음료수를 가지고 있는 자판기 머신 
	
	public void setD1() { 
//		각 배열마다 음료수를 저장 
		d1[0] = new Ex4_Drink("레츠비", 500, 1);
		d1[1] = new Ex4_Drink("사이다", 700, 2);
		d1[2] = new Ex4_Drink("콜라", 700, 3);
		d1[3] = new Ex4_Drink("웰치스", 1000, 4);
	}
	
	public String sold(int c) {
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < d1.length; i++) {

			Ex4_Drink drink = d1[i]; //배열에 저장된 음료수 정보를 하나씩 가져온다.
			// 얻어낸 정보에서 가격만 가져온다.
			int price1 = drink.getPrice(); // a에 음료수의 가격을 가져온다.
			if(price1 <= c) {// 음료수 값이 입력한 값보다 작거나 같다면?
				sb.append(drink.getNumber());
				sb.append(".");
				sb.append(drink.getName());
				sb.append("   ");
			}//if 문의 끝
		}// for문의 끝
		return sb.toString();
	}
	
	public String choice(int a) {
		
			Ex4_Drink drink = d1[a-1];// 원하는 음료수를 가져와 drink라는 변수에 저장 
			String choice1 = drink.getName();
			return choice1;
		}
	
	public int pay (int b) {
		Ex4_Drink drink = d1[b];
		int pay1 = drink.getPrice();
		return pay1;
	}
}
	


