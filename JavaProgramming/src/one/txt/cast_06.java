package one.txt;

import java.util.Scanner;

public class cast_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		String str2 = sc.next();
		
		char ch1 = str1.charAt(0);
		char ch2 = str2.charAt(0);
		
		System.out.println("첫번째 문자 : " + (int)ch1 + " 두번째 문자 : " + (int)ch2);
		
	}

}
