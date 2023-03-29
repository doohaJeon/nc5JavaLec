package chap99_etc;

public class ThreadMusic extends Thread {

	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("안녕!!");
		}
	}
	
	
}
