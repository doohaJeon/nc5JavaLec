package two.txt;

import java.util.Scanner;

public class Array_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] intArr = new int[10];
		int maxNum = 0;
		int minNum = 0;
		for(int i = 0; i<intArr.length; i++) {
			int num = sc.nextInt();
			intArr[i] = num;
			if(i == 0) {
				maxNum = intArr[i];
				minNum = intArr[i];
			} else {
				if(intArr[i] > maxNum) {
					maxNum = intArr[i];
				}
				if(intArr[i] < minNum) {
					minNum = intArr[i];
				}
			}
		}
		System.out.println("최대값 : " + maxNum + ", 최소값 : " + minNum);
	}

}
