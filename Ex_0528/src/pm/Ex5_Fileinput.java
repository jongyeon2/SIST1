package pm;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex5_Fileinput {

	public static void main(String[] args) {
		String path = "c:/my_study/java_study/work/SIST1/Ex_0528/src/pm/Ex5_Fileinput.java";
		
		// FileInputStream을 활용하여 읽은 후 화면에 출력하시오!
		File f = new File(path); // 파일 객체 생성 
		
		FileInputStream fis = null; // 예외처리를 위해 미리 선언한다. 
		
		try {
			fis = new FileInputStream(f); // 위에 File과 연결하는 배관이 만들어진다.
			// FileInputStream은 읽어올 값이 없으면 -1을 반환한다.
			int code = -1;
			byte[] buf = new byte[2048]; // 굉장히 중요 
			
			// read() 하나의 byte밖에 못 읽음 
			// buf배열에 2048이 다 차거나 -1이면
			// code = buf의 모든 데이터를 기억 
			while((code = fis.read(buf)) != -1) {
				String str = new String(buf, 0, code);
				// 위는 배열 buf의 0번지 부터 code가 기억하고 있는 번지까지 
				//가져와서 문자열로 만든다.(0~1047)
				System.out.println(str);
			}// while의 끝 
		} catch(Exception e) {
			// 예외가 발생할 경우 오류난 상황을 stack구조로 표현한다. 
			e.printStackTrace();
		}finally { // 사용된 스트림을 반드시 닫아야 함 
			try {
				fis.close(); // 사용된 스트림 닫기 // 엄청 중요*******
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
