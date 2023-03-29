package chap98_homework;

public class _3_23_basic3 {
//	16.459를 소수점 둘 째 자리까지 반올림해서 출력(xx.xx)
	public static void main(String[] args) {
		double num = 16.459;
		System.out.println((double)Math.round(num*100) / 100);
	}
}
