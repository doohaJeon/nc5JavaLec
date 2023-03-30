package one.txt;

import java.util.Scanner;

public class roop_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true) {
			String str = sc.next();
			if(str.equals("q")) {
				break;
			}
			
			int convertNum = Integer.parseInt(str);
			
			sum += convertNum;
			System.out.println("정수의 합 : "+  sum);
			
			
					}
		
	}

}
