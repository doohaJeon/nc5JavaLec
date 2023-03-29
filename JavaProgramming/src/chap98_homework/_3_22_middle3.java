package chap98_homework;

import java.util.Scanner;

public class _3_22_middle3 {
	public static void main(String[] args) {
		//사용자가 입력한 문자열에서 3의 배수 자리의 문자는 3으로 5의 배수 자리의 문자는 
		// 5로 변경하여 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		//결과를 담을 문자열
		String result = "";
		
		for(int i = 0; i< str.length(); i++) {
			//3의 배수인 경우
			if((i+1) % 3 == 0) {
				char ch = str.charAt(i);
				ch = '3';
				result += ch;
			}
			//5의 배수인 경우
			else if((i+1) % 5 == 0) {
				char ch = str.charAt(i);
				ch = '5';
				result += ch;
			} else {
				char ch = str.charAt(i);
				result += ch;
			}
		}
		System.out.println(result);
		
	}
}
