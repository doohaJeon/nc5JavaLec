package chap98_homework;

import java.util.Scanner;

public class _3_22_Basic4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열1 : ");
		String str1 = sc.next();
		System.out.println("\n문자열2 : ");
		String str2 = sc.next();
		
		if(str1.contains(str2)) {
			System.out.println("포함합니다.");
		} else {
			System.out.println("포함하지 않습니다.");
		}
	}

}
