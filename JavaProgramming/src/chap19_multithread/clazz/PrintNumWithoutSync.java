package chap19_multithread.clazz;

public class PrintNumWithoutSync {
	private int num;

	

	public void setNum(int num) {
		this.num = num;
	}
	
	public void printNum1 (int num) {
		this.setNum(num);
		
		for(int i = 1; i <= this.num; i++) {
			//System.out.println(num);
			System.out.println(i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void printNum2 (int num) {
		//System.out.println(num);
		this.setNum(num);
		
		for(int i = this.num; i <= this.num * 2; i++) {
			System.out.println(i);
			
		}
	}
	
}
