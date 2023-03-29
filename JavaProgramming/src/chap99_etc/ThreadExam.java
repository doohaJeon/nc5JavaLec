package chap99_etc;

public class ThreadExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadMusic tm = new ThreadMusic();
		tm.start();
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		try {
			tm.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
