package chap19_multithread.clazz;

public class SyncThread2 extends Thread{
//	private PrintNumWithSync pns;
	private PrintNumWithWaitNotify pns;
	

	public PrintNumWithWaitNotify getPns() {
		return pns;
	}

	public void setPns(PrintNumWithWaitNotify pns) {
		this.pns = pns;
	}
	
	@Override
	public void run() {
		pns.printNum2(20);
	}
}
