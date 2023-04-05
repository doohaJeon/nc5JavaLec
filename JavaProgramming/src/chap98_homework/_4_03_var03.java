package chap98_homework;

import java.util.Scanner;

public class _4_03_var03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		char []charArr = str.toCharArray();
	
		
		
			if(Character.isUpperCase(charArr[0])) {
				System.out.println(str.toLowerCase()); 
				
			} else if(Character.isLowerCase(charArr[0])) {
				System.out.println(str.toUpperCase());
			}
		
	}

}
