package am;

public class Ex4_Drink {
	
	private String name;
	private int price; 
	private int number;
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	Ex4_Drink(String name, int price, int number){
		this.name = name;
		this.price = price;
		this.number = number;
	}
	
}
