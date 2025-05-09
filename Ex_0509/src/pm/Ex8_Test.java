package pm;

public class Ex8_Test {

	public static void main(String[] args) {
//		정수 6개를 이거하는 배열 생성!
//		난수를 발생하여 배열 채우기 (1~45)
		int[] lotto = new int[6];
		
		for(int i = 0 ; i < lotto.length;) 
		{
			lotto[i] = (int)(Math.random() * 45 +1); //  lotto[1]에 난수 생성
			for(int j = 0; j < i; j++)  //  j가 i보다 작을떄까지 반복 
			{
				if(lotto[i]==lotto[j]) // lotto0과 1이 같은거는  
				{
					i--;
					break;
				} 
							
			}
			i++;
			// ?????? i++
		}
		for (int i = 0; i<lotto.length;i++)
			System.out.println(lotto[i]);
		
	}
}
