package one.txt;

import java.util.Scanner;

public class var08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] intArr = new int[10];
		int count = 0;
			for(int i = 0; i<intArr.length; i++) {
				int num = sc.nextInt();
				if(num > 1 && num < 31) {
					intArr[i] = num;
				} else {
					System.out.println("다시 입력해주세요.");
					i--;
					continue;
				}
				
			}
			
			for(int i = 0; i<10; i++) {
				for(int j = 2; j<=intArr[i]; j++) {
					if(intArr[i] % j ==0) {
						count++;
					}
				}
				if(count == 1) {
					System.out.print(intArr[i] + " ");
				}
				count = 0;
			}
			
			
			
	
	}
}
