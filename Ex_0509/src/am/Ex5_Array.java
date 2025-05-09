package am;

public class Ex5_Array {

	public static void main(String[] args) {
//		문자를 4개 저장할 수 있는 배열을 생성한 후
//		반복문을 이용하여 'A','B','C','D'가 
		
		char[] s = new char[4];
		
		char ch = 'A';
		
		for(int i = 0; i <s.length; i++) {
			s[i] = ch;
			ch++;
			System.out.printf("s[%d]=%c " ,i ,s[i]);
		}
		
	}

}
