package one.txt;

import java.util.Scanner;

public class cast_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 2개를 입력해주세요.");
		String num1 = sc.nextLine();
		String num2 = sc.nextLine();
		
		int convertInt = Integer.parseInt(num1);
		int convertInt2 = Integer.parseInt(num2);
		
		System.out.println("두 정수의 합 : " + (convertInt + convertInt2));
		
		
	}
}
