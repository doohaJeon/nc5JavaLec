package one.txt;

import java.util.Scanner;

public class control_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 2개를 입력해주세요.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1 == num2) {
			System.out.println("두 수가 같습니다.");
		} else if(num1 > num2) {
			System.out.println("첫번째 수가 더 큽니다.");
		} else {
			System.out.println("두번째 수가 더 큽니다.");
		}
	}

}
