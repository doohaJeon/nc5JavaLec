package two.txt;

import java.util.Scanner;

public class Array_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String[] strArr = str.split("-");
		String longLeng = strArr[0];
		int longIndex = 0;
		
		for(int i = 0; i<strArr.length; i++) {
			
			if(longLeng.length() < strArr[i].length()) {
				longLeng = strArr[i];
				longIndex = i;
			}
		}
		System.out.println("index : " + longIndex + ", longLeng : " + longLeng);
		
	}

}
