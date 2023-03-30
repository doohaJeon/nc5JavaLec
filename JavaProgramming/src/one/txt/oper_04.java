package one.txt;

import java.util.Scanner;

public class oper_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		if(str.equals("Hello")) {
			System.out.println("Hello입니다.");
		} else {
			System.out.println("Hello가 아닙니다.");
		}
	}

}
