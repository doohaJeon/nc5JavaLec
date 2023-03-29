package chap98_homework;

import java.util.Scanner;

public class _3_22_advance3Te {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3. 사용자가 영문자로만 구성된 문자열과 정수를 1개 입력합니다.
//	    해당 문자열에서 알파벳 대문자는 입력된 정수만큼 증가,
//	    알파벳 소문자는 입력된 정수만큼 감소된 새로운 문자열을 출력하세요.
//	    a에서 1 감소하면 z로 Z에서 1 증가하면 A로 순환됩니다.
//	    ex) OoOpGh, 2 -> QmQnIf 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요.");
		String str3 = sc.nextLine();
		System.out.print("정수를 입력하세요.");
		int num2 = sc.nextInt();
		String answer2 = "";

		for (int i = 0; i < str3.length(); i++) {
			if (str3.charAt(i) >= 'A' && str3.charAt(i) <= 'Z') {
				if ((char) (str3.charAt(i) + num2) > 'Z') {
					answer2 += (char) (('A' - 1) + (str3.charAt(i) + num2 - 'Z'));
				} else {
					answer2 += (char) (str3.charAt(i) + num2);
				}
			} else if (str3.charAt(i) >= 'a' && str3.charAt(i) <= 'z') {
				if ((char) (str3.charAt(i) - num2) < 'a') {
					answer2 += (char) (('z' + 1) - ('a' - (str3.charAt(i) - num2)));
				} else {
					answer2 += (char) (str3.charAt(i) - num2);
				}
			}
		}

	}
}
