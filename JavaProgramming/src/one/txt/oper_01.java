package one.txt;

import java.util.Scanner;

public class oper_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("덧셈 연산 : " + (num1 + num2));
		System.out.println("밸셈 연산 : " + (num1 - num2));
		System.out.println("곱셈 연산 : " + (num1 * num2));
		System.out.println("나눗셈 연산 : " + (num1 / num2));
		System.out.println("나머지 연산 : " + (num1 % num2));
	}

}
