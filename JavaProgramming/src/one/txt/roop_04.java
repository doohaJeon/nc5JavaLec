package one.txt;

import java.util.Scanner;

public class roop_04 {
//	사용자가 입력한 정수의 약수를  출력하세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 1; i<=num; i++) {
			if(num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
