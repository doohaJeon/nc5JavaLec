package one.txt;

import java.util.Scanner;

public class cast_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b;
		
		while(true) {
			int num = sc.nextInt();
			if(num == 0) {
				System.out.println("다시 입력해주세요.");
				continue;
			} else {
				b = num;
				break;
			}
		}
		double result = (double)a / b;
		
		System.out.println("a / b = " + result);
		
		
		
	}

}
