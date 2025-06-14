package am;

import java.io.File;

public class Ex1_File {

	public static void main(String[] args) {
		// 프로그램 시작 
		
		// 자바에서 File 객체는 
		// 파일뿐만 아니라 폴더(디렉토리)를 객체화 시키는 클래스다.
		// 그리고
		// 실제 존재하지 않는 파일과 폴더도 객체화 시킬 수 있다.
		// 그래서 존재여부 확인을 exists()로 구분할 수 있다.
		
		String path = "c:/my_Study/test/util"; // 내가 원하는 폴더의 경로 준비
		
		File f = new File(path); // c드라이브의 my_Study파일을 객체화 시킴
		
		// 현재 객체화 시킨 File객체가 실제 존재하는지 확인하자 
		// 존재하고? 폴더일때?
		if(f.exists() && f.isDirectory()) {
			System.out.println("폴더입니다.");
			
			// 폴더일 경우에는 폴더 안에 파일 또는 또다른 하위 폴더들이 있을 수 있다.
			// 하위 목록들을 한번에 얻어낼 수 있다. 
//			String[] ar = f.list();
//			for(int i = 0; i < ar.length; i++) {
//				System.out.println(ar[i]);
//			}
			File[] ar = f.listFiles(); 
			System.out.println("하위 폴더들----------------------------------");
			for(int i = 0; i < ar.length; i++) {
				
				if(ar[i].isDirectory())
					System.out.println(ar[i].getName());
			}
			System.out.println("하위 파일들-----------------------------------");
			for(int i = 0; i < ar.length; i++) {
				if(ar[i].isFile());
				System.out.printf("%s(%dMB)\n",ar[i].getName(), (ar[i].length()/1024)/1024);
			}
			
		}else {
			System.out.println("존재하지 않거나 폴더가 아닙니다.");
		}
	}

}
