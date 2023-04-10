package chap19_multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import chap19_multithread.clazz.BoardDAO;

public class _17_threadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoardDAO boardDAO = new BoardDAO();
		
		//최대 스레드 개수가 100인 스레드풀 생성
		//풀에 생성된 스레드를 사용자에게 하나씩 대여해서 사용자가 요청한
		//작업을 처리하게 된다.
		//사용자가 요청한 작업이 끝나면 다시 스레드를 반납받아서
		//대기중인 사용자에게 다시 대여
		//100명까지의 사용자 요청만 동시에 처리하고
		//먼저 끝난 작업이 있으면 대기하고 있던 사용자에게 반납했던 스레드를 대여
		ExecutorService es = Executors.newFixedThreadPool(100);
		
		System.out.println(boardDAO.selectBoardList());

		Thread thread = new Thread() {
			@Override
			public void run() {
				boardDAO.selectBoardList();
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
//		thread.start();
		//스레드 풀에 있는 스레드에 작업을 매핑해주고
		//스레드 .start() 메소드도 호출해줌
		//스레드 풀에 
		es.execute(thread);
	}

}
