package one.txt;

import java.util.Scanner;

public class control_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요.");
		
		String str = sc.nextLine();
		
		switch(str) {
		case "Java":
			System.out.println("좋아하는 언어입니다.");
			break;
		case "Python":
			System.out.println("공부중인 언어입니다.");
			break;
		default :
			System.out.println("다른 언어를 공부해보세요.");
		}
	}

}
