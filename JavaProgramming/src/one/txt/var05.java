package one.txt;

import java.util.Scanner;

public class var05 {
		
		public static void getMaxNum(int a, int b, int c) {
			int max = a;
			if(max > b) {
				if(max > c) {
					System.out.println("최대값 : " + max);
				}
			} else if(b > c) {
				System.out.println("최대값 : " + b);
			} else {
				System.out.println("최대값 : " + c);
			}
		}
		
		public static void getMinNum(int a, int b, int c) {
			int min = a;
			if(min < b) {
				if(min < c) {
					System.out.println("최소값 : " + min);
				}
			} else if(b < c) {
				System.out.println("최소값 : " + b);
			} else {
				System.out.println("최소값 : " + c);
			}
		}
		
		public static void getMedNum(int a, int b, int c) {
			if(a > b) {
				if(b > c) {
					System.out.println("중간값 : " + b);
				}
			} else if(b < c) {
				System.out.println("중간값 : " + b);
			}
			if(b > a) {
				if(a > c) {
					System.out.println("중간값 : " + a);
				}
			} else if(a < c) {
				System.out.println("중간값 : " + a);
			}
			if(a > c) {
				if(c > b) {
					System.out.println("중간값 : " + c);
				}
			} else if(c < b) {
				System.out.println("중간값 : " + c);
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int max = 0;;
		int mid = 0;
		int min = 0;
		System.out.println("정수 3개를 입력해주세요.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		//Max 
		getMaxNum(num1, num2, num3);
		getMinNum(num1, num2, num3);
		getMedNum(num1, num2, num3);
		
		
		
	}

}
