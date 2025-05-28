package pm;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex6_BufferedInput {

	public static void main(String[] args) {
String path = "c:/my_study/java_study/work/SIST1/Ex_0528/src/pm/Ex5_Fileinput.java";
		
		// FileInputStream을 활용하여 읽은 후 화면에 출력하시오!
		File f = new File(path); // 파일 객체 생성 
		
		FileInputStream fis = null; // 예외처리를 위해 미리 선언한다.
		BufferedInputStream bis = null;
		
		try {
			fis = new FileInputStream(f); 
			// fis는 inputStream을 상속 받았기 떄문에 인자로 들어갈 수 있음 
			bis = new BufferedInputStream(fis);
			int code = -1;
			byte[] buf = new byte[2048];  
			
			while((code = bis.read(buf)) != -1) {
				String str = new String(buf, 0, code);
				
				System.out.println(str);
			}// while의 끝 
		} catch(Exception e) {
			// 예외가 발생할 경우 오류난 상황을 stack구조로 표현한다. 
			e.printStackTrace();
		}finally { // 사용된 스트림을 반드시 닫아야 함 
			try {
				fis.close(); // 사용된 스트림 닫기 // 엄청 중요*******
				bis.close(); // bis 안에 fis가 들어가 있음으로 bis를 나중에 닫아준다.
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
