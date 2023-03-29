package chap98_homework;

import java.util.Scanner;

//사용자가 입력한 문자열에서 중복된 문자를 제거한 문자열을 출력하세요.
public class _3_22_middle2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String result = "";
					
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(result.indexOf(ch) == -1) {
				result += ch;
			}
		}
		
		System.out.println("중복이 제거된 문자열 : " + result);
				
			
		
	}
}	
