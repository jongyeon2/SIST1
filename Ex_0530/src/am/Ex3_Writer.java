package am;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Ex3_Writer {

	public static void main(String[] args) {
		// 문자기반의 출력스트림
		PrintWriter pw = null;
		File selectedFile = new File("c:/my_study/test/123.txt");
		try {
//			pw = new PrintWriter("c:/my_study/test/123.txt");
//			pw = new PrintWriter(selectedFile);
			pw = new PrintWriter(new FileOutputStream(selectedFile)); 
			
			// 123.txt에 "와 ~~~금요일이다"쓰기
			pw.write("와~~~~~~~ 금요일이다"); 
			pw.flush();
			
			// c:/my_study/test/123.txt 해당 경로에 123.txt 파일이 만들어짐 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(pw != null)
				// 닫을 때 try-catch문을 사용하지 않는다. 
				pw.close();
		}

	}

}
