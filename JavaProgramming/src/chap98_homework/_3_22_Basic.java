package chap98_homework;

import java.util.Scanner;

public class _3_22_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int middleNum;
		if(str.length() % 2 == 0) {
			 middleNum = str.length() / 2;
			System.out.println(str.substring(middleNum-1, middleNum+1));
		} else {
			middleNum = str.length() / 2;
			System.out.println(str.substring(middleNum, middleNum+1));
		}
		
	}

}

