package chap98_homework;

import java.util.Scanner;

public class _3_23_middle4 {
//	재귀메소드를 이용해 사용자가 입력한 숫자까지의 합을 구하시오.
	
	  public static int recursiveFunction(int input) {
	  
	 
		  if(input == 1) {
			  return 1;
		  } else {
			  return input + recursiveFunction(input-1);
		  }
	  
	  
	  }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		System.out.println(recursiveFunction(10));
		
	}
}
