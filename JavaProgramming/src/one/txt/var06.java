package one.txt;

import java.util.Scanner;

public class var06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("정수를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for(int i = 1; i<10; i++) {
			System.out.println(input + " * " + i + " = " + input * i);
		}
	}

}
