package one.txt;

import java.util.Scanner;

public class roop_03 {
//	사용자가 입력한 정수까지의 모든 소수를 출력하세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요.");
		
		int num = sc.nextInt();
		int count = 0;
		
		for(int i = 2; i<=num; i++) {
			for(int j = 2; j<=i; j++) {
				if(i%j == 0) {
					count++;
				}
			
			}
			if(count == 1) {
				System.out.print(i + " ");
			}
			count = 0;
			
		}
	}

}
