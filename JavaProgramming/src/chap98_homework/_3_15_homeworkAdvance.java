package chap98_homework;

import java.util.Scanner;

public class _3_15_homeworkAdvance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			int num = sc.nextInt();

			if (num > 99 || num < 1) {
				System.out.println("다시 입력해주세요");
				continue;
			}
			int count = 0;
			int firstNum = num % 10;
			
			int secondNum = num % 100;
			
		
				if(firstNum == 3 || firstNum == 6 || firstNum == 9) {
					count++;
				}
				if(num > 9 && (secondNum == 3 || secondNum == 6 || secondNum == 9)) {
					count++;
				}
				if(count == 2) {
					System.out.println("박수짝짝");
					count = 0;
			 } else if(count == 1) {
				 System.out.println("박수짝");
				 count = 0;
			 } else {
				 System.out.println("다시 입력해주세요.");
				 count = 0;
			 }
			
			
		}

	}

}
