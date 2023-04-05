package chap19_multithread.clazz;

public class NonSyncThread2 extends Thread {
	private PrintNumWithoutSync pns;
	
	

	public PrintNumWithoutSync getPns() {
		return pns;
	}

	public void setPns(PrintNumWithoutSync pns) {
		this.pns = pns;
	}
	
	@Override
	public void run() {
		pns.printNum2(20);
	}
}
