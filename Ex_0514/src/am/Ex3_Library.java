package am;

public class Ex3_Library {

		Ex3_Book[] ar = new Ex3_Book[5]; //5개 생성 후 저장
		
//		도서들을 만들어서 배열에 저장하는 기능 
		public void setAr() {
			ar[0] = new Ex3_Book("P-j-100","이것이 자바다","한빛미디어","A-13",true);
			ar[1] = new Ex3_Book("P-T-112","UML","한빛미디어","B-13",true);
			ar[2] = new Ex3_Book("P-J-200","자바 바이블","한빛아카데미","A-20",false);
			ar[3] = new Ex3_Book("P-O-111","이것이 우분투 리눅스다","한빛미디어","C-13",true);
			ar[4] = new Ex3_Book("P-F-111","스프링 활용","한빛아카데미","S-11",true);
			
		}
		//책 이름으로 검색하는 기능!
		public String search (String n) {
//			도서명으로 검색된 책 정보들을 문자열로 저장하기 위해 
			StringBuffer sb = new StringBuffer();
			
//			모든 책들의 이름을 가져와서 인자로 받은 n이 저장된 값이 포함 
//			되었는지 확인하는 반복문 
			for(int i = 0; i < ar.length; i ++) {
//				배열에 저장된 책 정보를 하나씩 가져온다.
				Ex3_Book book = ar[i];
//				얻어낸 책 정보에서 책제목만 얻어낸다.
				String tt = book.getTitle(); // 이것이 자바
				
//				tt안에 n이 포함되었는지? 확인하는 비교 
				int idx = tt.indexOf(n); // tt안에 n의 값이 있는 위치값을 변수 idx에 저장 
//											만약 n의 값이 없다면 idx에는 -1이 저장된다.
				if(idx != -1) {
					sb.append(book.getB_num());  //도서 번호 
					sb.append("|");
					sb.append(book.getTitle());
					sb.append("|");
					sb.append(book.getPub());
					sb.append("|");
					sb.append(book.getPos());
					sb.append("|");
					String rent = "대여 중";
					if(book.isRent()) // true일 경우 대여가능으로 하자 
						rent = "대여가능";
					sb.append(rent);
					sb.append("\r\n");
				}
						
			}//for의 끝 
						
			return sb.toString();
		}
		
}
