package pm;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Ex3_ChatServer {
	// 서버는 반드시 ServerSocket이 있어야 한다.
	ServerSocket ss;
	
	ArrayList<Ex3_CopyClient> list; // 접속자들의 정보
	
	Thread thread = new Thread() {

		@Override
		public void run() {
			// 접속자가 발생할 때까지 기다리다가 
			// 접속자가 오면 CopyClient로 생성한 후 
			// Arraylist에 저장한다. 그리고 CopyClient의 스레드를 구동시킨다.
			while(true) {
				try {
					Socket s = ss.accept(); // 접속자가 발생할 때까지 대기한다.
					
					Ex3_CopyClient cc = new Ex3_CopyClient(s, Ex3_ChatServer.this);
					// Ex3_ChatServer의 주소를 전달하는 이유 
					// ChatServer들의 함수를 호출 하기 위해 
					list.add(cc);
					cc.start(); //클라이언트와 통신하는 스레드 구동!!*****
				} catch (IOException e) {
					e.printStackTrace();
				}
			}// 무한 반복 
		}
		
	};
	// 생성자
	public Ex3_ChatServer() {
		list = new ArrayList<>(); // 접속자들이 저장될 곳 
		try {
			ss = new ServerSocket(5555);
			System.out.println("서버 시작!");
			
			// 접속자들을 맞이하는 스레드 시작 
			thread.start();
			
			while(true) {
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	// list에서 특정 CopyClient객체를 삭제하는 기능 
	// 삭제하고 하는 객체의 주소를 인자로 받아야 한다.
	public void removeClient(Ex3_CopyClient cc) {
		list.remove(cc);
	}
	
	// 접속자 모두에게 메세지(Ex3_Protocol)를 전달하는 기능 
	public void sendProtocol(Ex3_Protocol p) {
		for (int i = 0; i < list.size(); i++) {
			// 각 클라이언트 복사본들을 하나씩 얻어낸다.
			Ex3_CopyClient cc =list.get(i);
			try {
				cc.out.writeObject(p); // 각 원본들에게 보낸다.
				cc.out.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new Ex3_ChatServer();
	}
	
	
}
