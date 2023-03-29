package chap98_homework;

import java.util.Scanner;

public class _3_22_reverse {
	public static String reverseString(String str) {
		String result = "";
		StringBuilder sb = new StringBuilder();
		for(int i = str.length()-1; i > -1; i--) {
			char c = str.charAt(i);
			result += c;
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(reverseString(str));
	}

}
