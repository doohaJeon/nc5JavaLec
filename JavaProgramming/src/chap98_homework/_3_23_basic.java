package chap98_homework;

import java.util.Scanner;

public class _3_23_basic {
//	사용자가 문자열 3개를 입력하고 그 문자열을 합쳐서 출력하세요(StrginBuffer 사용필수).

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열1을 입력해주세요.");
		String str1 = sc.nextLine();
		System.out.println("문자열2을 입력해주세요.");
		String str2 = sc.nextLine();
		System.out.println("문자열3을 입력해주세요.");
		String str3 = sc.nextLine();
		
		StringBuffer sb = new StringBuffer();
		sb.append(str1);
		sb.append(str2);
		sb.append(str3);
		
		System.out.println(sb);
	}

}
