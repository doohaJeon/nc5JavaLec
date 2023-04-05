package chap98_homework;

import java.util.Scanner;

public class _4_03_cast01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
//		StringBuilder sb = new StringBuilder();
//		
//		for(int i = 0; i<str.length(); i++) {
//			sb.append(str.charAt(i));
//		}
		
		if(str.contains(".")) {
			double num = Double.parseDouble(str);
			System.out.println(num);
		} else {
			int num2 = Integer.parseInt(str);
			System.out.println(num2);
		}
	}

}
