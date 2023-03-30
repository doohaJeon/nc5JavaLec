package one.txt;

import java.util.Scanner;

public class oper_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		System.out.println("덧셈 연산 : " + (num1 + num2));
		System.out.println("밸셈 연산 : " + (num1 - num2));
		System.out.println("곱셈 연산 : " + (num1 * num2));
		System.out.println("나눗셈 연산 : " + (num1 / num2));
		System.out.println("나머지 연산 : " + (num1 % num2));
	}

}
