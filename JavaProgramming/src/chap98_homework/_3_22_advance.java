package chap98_homework;

import java.util.Arrays;
import java.util.Scanner;

//1. 사용자가 입력한 문자열을 순서대로 정리하세요.
	//	순서는 유니코드 값 오름차순으로 정리.
public class _3_22_advance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int []numArr = new int[str.length()];
		
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			int num = ch;
			numArr[i] = num;
		}
		//정렬 전
		System.out.print("정렬 전 : ");
		for(int num : numArr) {
			System.out.print(num + ", ");
			char ch = (char) num;
			System.out.print(ch + " ");
		}
		System.out.print("\n정렬 후 : ");
		//정렬 후
		Arrays.sort(numArr);
		for(int num : numArr) {
			System.out.print(num + ", ");
			char ch = (char) num;
			System.out.print(ch + " ");
		}
		
		
	}
}
