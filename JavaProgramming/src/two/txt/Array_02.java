package two.txt;

import java.util.Scanner;

public class Array_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int []intArr = new int[100];
		int index = 0;
		;
		while(true) {
			String str = sc.next();
			if(str.equals("q")) {
				break;
			}
			int num = Integer.parseInt(str);
			
			intArr[index] = num;
			index++;
		
		}
		for(int i = 0; i<intArr.length; i++) {
			if(intArr[i] != 0)
			System.out.print(intArr[i] + " ");
		}
	}

}
