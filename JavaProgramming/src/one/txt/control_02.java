package one.txt;

import java.util.Scanner;

public class control_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수");
		} else {
			System.out.println("음수");
		}
	}

}
