package chap98_homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _3_27_advance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> inList = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<5; i++) {
			int num = sc.nextInt();
			inList.add(num);
		}
		
		int maxSum = 0;
		int a = 0;
		int b = 0;
		for(int i = 0; i<inList.size(); i++) {
			for(int j = i+1; j<inList.size(); j++) {
				if((inList.get(i) + inList.get(j)) > maxSum) {
					maxSum = inList.get(i) + inList.get(j);
					a = inList.get(i); b = inList.get(j);
				}
			}
		}
		
		System.out.println("maxSum : " + maxSum + " 두 수 : " + a + ", " + b);
	}

}
