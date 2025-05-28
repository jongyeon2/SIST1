package pm;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex4_InputStream {

	public static void main(String[] args) {
		// 특정 파일과 연결된 스트림 생성
		String path = "c:/my_study/io_test/inputTest.txt";
		
		File f = new File(path); // 위 경로의 파일 객체 생성
		FileInputStream fis = null; // 객체 생성전에 꼭 선언하기 
		
		try {
			fis = new FileInputStream(f);
			// FileInputStream은 읽어올 값이 없으면 -1을 반환한다.
			int code = -1;
			while((code = fis.read()) != -1) // fis로 읽어온 코드가 -1이니?
//				System.out.println((char)code);
				System.out.write(code); // write는 문자화 시켜서 실행함 
		} catch(Exception e) {
			System.out.println("예외 발생: 파일이 있는지? 확인");
		}finally {
			try {
				fis.close(); // 사용된 스트림 닫기 // 엄청 중요*******
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				
			}
		}
	}

}
