package one.txt;

public class roop_02 {
//	2의 거듭제곱을 10회동안 반복하며 출력하세요.(2 * 2 = 4, 2 * 2 * 2 = 8 .....) 10회 반복 출력
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int result = 0;
		
		for(int i = 0; i<10; i++) {
			if(i == 0) {
				sum = 2 * 2;
				result = sum;
			} else {
				sum = sum * 2;
				result = sum;
			}	
			System.out.print(result + " ");
		}
	}
//	4, 8, 16 32 64, 128, 256
}
