package chap98_homework;

import java.util.Scanner;

public class _3_16_homeworkBasic4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<arr.length; i++) {
			int number = sc.nextInt();
			arr[i] = number;
			if(arr[i] % 2 ==0 || arr[i] % 3 == 0) {
				System.out.println(arr[i]);
			}
		}
		
	}

}
