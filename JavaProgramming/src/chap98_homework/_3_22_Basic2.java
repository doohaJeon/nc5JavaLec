package chap98_homework;

import java.util.Scanner;

public class _3_22_Basic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int gaCnt = 0;
		int baCnt = 0;
		char [] word = str.toCharArray();
		for(int i = 0; i<word.length; i++) {
			if(word[i] == '가') {
				gaCnt++;
			}
			if(word[i] == '바') {
				baCnt++;
			}
		}
		if(gaCnt > 0 || baCnt > 0) {
			System.out.println("가의 개수는 " + gaCnt + ", " + "바의 개수는 " + baCnt);
		} else {
			System.out.println("가, 바가 존재하지 않습니다.");
		}
		
		
		
	}

}
