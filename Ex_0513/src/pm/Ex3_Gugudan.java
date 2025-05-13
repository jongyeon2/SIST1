package pm;

public class Ex3_Gugudan {
//	구구단 프로그램을 만들자 
	private int dan = 0;
		
	public void setDan(int dan) {
		this.dan = dan;
	}
	
	public int getDan() {
		return dan;
	}
		
	public void printGugudan() {
		for(int i = 1 ; i < 10; i ++) {
			System.out.printf("%d * %d = %2d%n", dan, i ,dan * i);
		}
	}
	

} 
