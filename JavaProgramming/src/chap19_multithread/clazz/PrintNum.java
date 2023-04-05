package chap19_multithread.clazz;

public class PrintNum {
	
	public void printNum(int num) {
		//Thread t1, t2
		//t1은 1~num까지 출력
		//t2는 num~num * 2까지 출력
		//스레드 두 개 모두 시작 대기 상태로 만든후 t1먼저 등록
		//join()메소드를 이용해서 t2가 먼저 실행되도록
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for(int i = 1; i<= num; i++) {
					System.out.println(i);
				}
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for(int i = num; i<=(num*2); i++) {
					System.out.println(i);
				}
			}
		};
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
