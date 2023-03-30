package one.txt;

import java.util.Scanner;

public class control_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개를 입력해주세요.");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int oddNum = 0;
		int evenNum = 0;
		
		if(num1 % 2 == 0 && num2 % 2 == 0 && num3 % 2 ==0) {
			System.out.println("모두 짝수입니다.");
		} else if(num1 % 2 != 0 && num2 % 2 == 0 && num3 % 2 ==0) {
			oddNum = 1; evenNum = 2;
			System.out.println("짝수 : " + evenNum + "개, 홀수 : " + oddNum + "개 입니다.");
		} else if(num1 % 2 != 0 && num2 % 2 != 0 && num3 % 2 ==0) {
			oddNum = 2; evenNum = 1;
			System.out.println("짝수 : " + evenNum + "개, 홀수 : " + oddNum + "개 입니다.");
		} else if(num1 % 2 != 0 && num2 % 2 == 0 && num3 % 2 !=0) {
			oddNum = 2; evenNum = 1;
			System.out.println("짝수 : " + evenNum + "개, 홀수 : " + oddNum + "개 입니다.");
		} else if(num1 % 2 == 0 && num2 % 2 != 0 && num3 % 2 !=0) {
			oddNum = 2; evenNum = 1;
			System.out.println("짝수 : " + evenNum + "개, 홀수 : " + oddNum + "개 입니다.");
		} else if(num1 % 2 == 0 && num2 % 2 != 0 && num3 % 2 ==0) {
			oddNum = 1; evenNum = 2;
			System.out.println("짝수 : " + evenNum + "개, 홀수 : " + oddNum + "개 입니다.");
		} else if(num1 % 2 == 0 && num2 % 2 == 0 && num3 % 2 !=0) {
			oddNum = 1; evenNum = 2;
			System.out.println("짝수 : " + evenNum + "개, 홀수 : " + oddNum + "개 입니다.");
		} else {
			System.out.println("모두 홀수입니다.");
		}
		
		
	}

}
