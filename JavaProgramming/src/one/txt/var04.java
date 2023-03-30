package one.txt;

import java.util.Scanner;

public class var04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int avg = 0;
		for(int i = 0; i<5; i++) {
			int num = sc.nextInt();
			sum += num;
		}
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum / 5);
	}

}
