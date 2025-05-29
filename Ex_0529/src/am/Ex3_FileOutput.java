package am;

import java.io.File;
import java.io.FileOutputStream;

public class Ex3_FileOutput {

	public static void main(String[] args) {
		// 프로그램 시작 
		// 파일에 저장할 문자열
		String str = "Test입니다.- 파일에 저장할 문자열 \r\n12345";
		
		File f = new File("c:/my_study/test/abc.txt");
		
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(f);
			
			// 준비된 Outputstream을 통해 쓰기를 수행한다.
			// 먼저 저장할 문자열을 byte형 배열로 변환한다.
			byte[] ar = str.getBytes();
			
			// byte[]배열, 0번지부터, 배열의 길이만큼 쓴다.
			fos.write(ar, 0, ar.length);
			fos.flush(); // 스트림을 비우는 동작인데 이것을 다르게 말하면
						 // 스트림에 있는 자원들을 지금 당장 방출하라는 뜻이다.
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(fos != null) // 기억하기 null이 아닐경우 
					fos.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

}
