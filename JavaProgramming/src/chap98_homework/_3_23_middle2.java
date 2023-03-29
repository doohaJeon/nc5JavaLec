package chap98_homework;

import java.util.Scanner;

public class _3_23_middle2 {
	/*
	 * "유용한 클래스는 많다. 다양한 라이브러리를 활용한다."라는 문자열이 있을때 사용자가 정수를 입력하고 문자열을 거꾸로 만든 문자열의 정수
	 * 인덱스의 문자를 출력하세요.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("유용한 클래스는 많다. 다양한 라이브러리를 활용한다.");
		StringBuffer reverseStr = sb.reverse();
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println(reverseStr.charAt(input));
		
	}

}
