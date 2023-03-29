package chap99_etc;

public class _03_mathRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 난수발생 첫번째 방식
		//Math.random() 사용
		// 0 <= Math.random() < 1 사이의 난수
//		double num = Math.random(); 
//		System.out.println(num); 0~ 1
		
		//2. 1 <= Math.random() < 11
		// 0 <= Math.random() *10 < 10
		// 1 <= (int)(Math.random() * 10) + 1 < 11
//		int rand = (int) (Math.random() * 10 )+ 1;
//		System.out.println(rand);
		
		//3. 1~45까지 난수 발생기
		System.out.println((int)(Math.random() * 45) +1 );
		
		//4. 200 ~ 299까지 난수 발생기
		System.out.println((Math.random()*100) + 200);
		
		//a~b까지 랜덤
		//(int)(Math.random() * (b- a + 1)) + a
		
	}

}
