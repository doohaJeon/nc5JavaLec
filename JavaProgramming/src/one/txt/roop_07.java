package one.txt;

import java.util.Scanner;

public class roop_07 {
//	사용자가 입력한 두 정수의 최소공배수와 최대공약수를 출력하세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new  Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int max = 0;
		for(int i = 1; i<=num1 && i<=num2;  i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				max = i;
			}
			
		}
		System.out.println("최대공약수 : " + max);
		System.out.println("최소공배수 : " + num1 * num2 /max);
	}

}
