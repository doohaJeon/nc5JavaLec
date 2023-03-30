package one.txt;

import java.util.Scanner;

public class control_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int result = num % 3;
		switch(result) {
		case 0:
			System.out.println("3의 배수입니다.");
			break;
			default :
				System.out.println("3의 배수가 아닙니다.");
		}
	}

}
