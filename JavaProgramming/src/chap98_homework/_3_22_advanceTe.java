package chap98_homework;

import java.util.Scanner;

public class _3_22_advanceTe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		1. 사용자가 입력한 문자열을 순서대로 정리하세요.
//	    순서는 유니코드 값 오름차순으로 정리.
		System.out.print("문자열을 입력하세요.");
		String str1 = sc.nextLine();
		String answer = "";
		char[] chArr = str1.toCharArray();
		
		for(int i = 0; i < chArr.length; i++) {
			for(int j = 0; j < i; j++) {
				if(i > 0 && chArr[i] < chArr[j]) {
					char temp = chArr[i];
					chArr[i] = chArr[j];
					chArr[j] = temp;
				}
			}
		}
		
		answer = new String(chArr);
		
		System.out.println(answer);
	}
}
