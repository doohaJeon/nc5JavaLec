package one.txt;

import java.util.Scanner;

public class roop_06 {
//	사용자가 입력한 문자열을 역순으로 출력하세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요.");
		String str = sc.nextLine();
		char [] chArr = new char[str.length()];
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			chArr[i] = ch;
		}
		for(int i = chArr.length-1; i>=0; i--) {
			System.out.print(chArr[i]);
		}
	}

}
