package one.txt;

import java.util.Scanner;

public class oper_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num % 2 == 0 && num % 7 == 0) {
			System.out.println("2와 7의 공배수");
		} else {
			System.out.println("2와 7의 공배수가 아님");
		}
	}

}
