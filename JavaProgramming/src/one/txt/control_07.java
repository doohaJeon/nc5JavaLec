package one.txt;

import java.util.Scanner;

public class control_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요.");
		
		String str = sc.nextLine();
		
		if(str.equals("Yes")) {
			System.out.println("예");
		} else if(str.equals("No")) {
			System.out.println("아니오");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

}
