package one.txt;

import java.util.Scanner;

public class control_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int max = 0;
		for(int i = 0; i<5; i++) {
			int num = sc.nextInt();
			if(i == 0) {
				max = num;
			} else {
				if(num > max) {
					max = num;
				}
			}
		}
		System.out.println("입력한 5개의 정수 중 가장 큰 수 : " + max);
	}

}
