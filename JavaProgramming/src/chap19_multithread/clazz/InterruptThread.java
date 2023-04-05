package chap19_multithread.clazz;

public class InterruptThread extends Thread {
	

	@Override
	public void run() {
		
		while(!Thread.currentThread().isInterrupted()) {
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				Thread.currentThread().interrupt();
				
			}
		}
	}

}
