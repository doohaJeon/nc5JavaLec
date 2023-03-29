package chap98_homework;

import java.util.Scanner;

public class _3_16_homeworkBasic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[10];
		int sum = 0;
		for(int i = 0; i<10; i++) {
			int number = sc.nextInt();
			System.out.print(number);
			sum += number;
		}
		System.out.print("\n입력값의 총합 : "+sum );
	}

}
