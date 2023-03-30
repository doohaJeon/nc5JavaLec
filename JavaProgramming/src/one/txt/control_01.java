package one.txt;

import java.util.Scanner;

public class control_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 2개 입력해주세요.");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
		
		
	}

}
