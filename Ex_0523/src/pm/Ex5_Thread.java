package pm;

public class Ex5_Thread extends Thread {

	@Override
	public void run() {
		// 해당 스레드가 해야할 일들 
		for(int i = 0; i<5; i++) {
			System.out.println("t2 수행");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}//for의 끝 
	}

}
