package two.txt;

import java.util.Scanner;

public class Array_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String [] strArr = new String[5];
		int maxLeng = 0;
		int minLeng = 0;
		String longStr = "";
		String shortStr = "";
		
		String str = "안녕하세요";
		System.out.println(str.length());
		for(int i = 0; i<strArr.length; i++) {
			String input = sc.next();
			strArr[i] = input;
			if(i == 0) {
				maxLeng = strArr[i].length();
				longStr = strArr[i];
				minLeng = strArr[i].length();
				shortStr = strArr[i];
			} else {
				if(strArr[i].length() > maxLeng) {
					maxLeng = strArr[i].length();
					longStr = strArr[i];
				}
				if(strArr[i].length() < minLeng) {
					minLeng = strArr[i].length();
					shortStr = strArr[i];
				}
			}
		}
		System.out.println("가장 긴 문자열 : " + longStr + ", 가장 작은 문자열 : " + shortStr);
		
	}

}
