package one.txt;

import java.util.Scanner;

public class var02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("정수 2개와 문자 연산자를 입력해주세요.");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			char oper = sc.next().charAt(0);

			switch (oper) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
            	System.out.println(num1 - num2);
                break;
            case '*':
            	System.out.println(num1 * num2);
                break;
            case '/':
            	System.out.println(num1 / num2);
            	break;
            default:
                System.out.println("잘못 입력하셨습니다.");
                continue;
        }
			break;

		}
	}

}
