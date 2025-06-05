package pm;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer {
	
	ServerSocket ss; // 서버 소켓 
	
	Thread thread = new Thread() { // 접속자를 받아주는 쓰레드 

		@Override
		public void run() {
			while(true) { // 접속자가 올때까지 항상 프로그램은 돌고 있어야 하기 때문에 무한반복 사용 
				try {
					Socket s = ss.accept(); // 서버소켓이 유저를 받길 기다린다.
					CopyClient cc = new CopyClient(s, ChatServer.this);
					u_list.add(cc); // 유저가 접속하면 대기방에 넣어줌 
					cc.start(); // 복사본의 유저의 쓰레드를 실행
				} catch (IOException e) {
					e.printStackTrace();
				}
			}// 무한반복의 끝 
		} //thread 재정의 
	};
	
	ArrayList<CopyClient> u_list; // 유저대기방
	ArrayList<ChatRoom> r_list;  // 방 목록 
	
	// 기본생성자 
	public ChatServer() { // 서버의 문을 열고 접속자들을 맞이한다.
		u_list = new ArrayList<>(); // 생성하는 동시에 객체 생성 
		r_list = new ArrayList<>(); // 방이 만들어지면 저장될 공간 
		try {
			ss = new ServerSocket(5555); // 서버문 열고
			System.out.println("서버 시작합니다"); 
			
			// 서버를 열었으면 사람들 받아주는 기능(쓰레드)을 시작 
			thread.start(); 
			
			while(true) {}
			
		} catch (IOException e) {
			e.printStackTrace();
		}  
		
	}
	
	public void removeClient(CopyClient cc) { // 유저 대기방에서 삭제 
		u_list.remove(cc); 
		// 대기실 명단과 방 목록을 갱신 하도록 프로토콜을 작업
		Protocol p = new Protocol();
		p.setCmd(1);
		// 대기자 명단 수집 
		p.setUser_names(getNames());
		
		// 방 목록 수집 
		p.setRoom_names(getRoomNames());
		
		// 대기실 모두에게 전달 
		sendProtocol(p);
		
	}
	
	public void sendProtocol(Protocol p) { // 대기자 모두에게 전달하는 기능 
		
		for(int i = 0; i < u_list.size(); i++) {
			// 대기방에서 한명을 얻어낸다.
			CopyClient cc = u_list.get(i);
			
			// 한명씩 보낸다.
			try {
				cc.out.writeObject(p);
				cc.out.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	

	// 대기실 명단을 수집하여 반환하는 기능 
	public String[] getNames() {
		// ArrayList에 있는 요소들에게 이름을 받아서 배열화 시킨다.
		String[] names = new String[u_list.size()]; // 유저 대기방의 크기만큼의 배열 
		for(int i = 0; i < u_list.size(); i++) { 
			// 클라이언트의 복사본을 하나씩 가져온다.
			CopyClient cc = u_list.get(i);
			names[i] = cc.getNickName(); // 가져온 복사본의 이름을 protocol 유저대기방에 저장 ;
		}
		return names;
	}
	
	// 방 목록을 수집하여 반환하는 기능 
	public String[] getRoomNames() {
		// ArrayList에 있는 요소들에게 이름을 받아서 배열화 시킨다.
		String[] names = new String[r_list.size()]; // 유저 대기방의 크기만큼의 배열 
		int i = 0;
		for(ChatRoom cr : r_list) { 
			// 채팅방 객체를 하나씩 얻어내어 방 제목을 수집한다.
			names[i] = cr.roomName; // 가져온 복사본의 이름을 protocol 유저대기방에 저장 ;
		}
		return names;
	}
	
	public static void main(String[] args) {
		// 프로그램 시작 
		new ChatServer();
	}

}
