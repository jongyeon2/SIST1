package pm;

import java.io.File;

public class Ex3_File {

	public static void main(String[] args) {
		//프로그램 시작
		
		String path = "c:/my_study/io_test/sist";
		
		File f = new File(path); // 파일 객체 생성 
		// File객체는 실제 존재하지 않아도 객체를 생성하는 것은 문제가 없다.
		// 존재여부 확인 
		if(!f.exists())
			f.mkdirs();
		
		System.out.println("프로그램 종료!");

	}

}
