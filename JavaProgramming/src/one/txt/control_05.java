package one.txt;

import java.util.Scanner;

public class control_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num % 2 != 0) {
			System.out.println("홀수입니다.");
		} else {
			System.out.println("짝수입니다.");
		}
	}

}
