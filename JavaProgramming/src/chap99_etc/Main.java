package chap99_etc;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int hour;
		int minute;
		if (h != 0 && m < 45) {
			hour = h - 1;
			minute = (m + 60) - 45;
		} else if (h == 0 && m < 45) {
			hour = 23;
			minute = (m + 60) - 45;
		} else {
			hour = h;
			minute = m - 45;
		}

		System.out.print(hour + " ");
		System.out.println(minute);
	        
	}

}