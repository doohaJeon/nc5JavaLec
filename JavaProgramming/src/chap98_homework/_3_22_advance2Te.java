package chap98_homework;

import java.util.Scanner;

public class _3_22_advance2Te {
	public static void main(String[] args) {
//		2. 사용자가 입력한 문자열(단, 숫자로만 구성돼야함)을 
//		   정수형으로 바꿔주는 메소드 int convertToInt(String str)
//		   을 작성하세요. ex) "532" -> 532, "-714" -> -714
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요.");
		String str2 = sc.nextLine();
		
		int num = 0;
		
		if(str2.charAt(0) != '-') {
			num = Integer.valueOf(str2);
		} else {
			String temp = str2.replace("-", "");
			num = -Integer.valueOf(temp);
		}
		
		System.out.println(num);
	}
}
