package one.txt;

import java.util.Scanner;

public class var07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int result = num;
		for(int i = num -1; i>0; i--) {
			 result = result * i;
		}
		
		System.out.println(result);
	}	

}
