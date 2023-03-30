package two.txt;

import java.util.Scanner;

public class Array_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] intArr = new int[10];
		int sum = 0;
		for(int i = 0; i<10; i++) {
			intArr[i] = sc.nextInt();
			sum += intArr[i];
		}
		System.out.println("정수의 평균 : " + sum/intArr.length);
	}

}
