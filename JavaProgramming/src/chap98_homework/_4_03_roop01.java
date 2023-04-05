package chap98_homework;

import java.util.Scanner;

public class _4_03_roop01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int ranNum = (int)(Math.random() * 20)+1;
		System.out.println(ranNum);
		int count = 0;
		for(int i = 1; i<=ranNum; i++) {
			str = str.concat("bit");
			count++;
		}
		System.out.println(str + "\nbit가 추가된 개수 : " + count);
	}

}
