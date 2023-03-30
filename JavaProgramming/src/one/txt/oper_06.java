package one.txt;

import java.util.Scanner;

public class oper_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String result = (num == 100) ? "100" : (num > 100) ? "100보다 큼" : "100보다 작음";
		System.out.println(result);
	}

}
