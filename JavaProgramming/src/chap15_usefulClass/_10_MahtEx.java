package chap15_usefulClass;

import java.util.Scanner;

public class _10_MahtEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//사용자가 5개 정수 입력 => 배열에 저장
		
		//Math.max와 Math.min을 이용하여 최소값, 최대값 구하기
		int[] numArr = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<numArr.length; i++) {
			int num = sc.nextInt();
			numArr[i] = num;
		}
		int max = numArr[0];
		int min = numArr[0];
		for(int i = 0; i< numArr.length; i++) {
			max = Math.max(max, numArr[i]);
			min = Math.min(min, numArr[i]);
		}
		System.out.println("최대값 : " + max + ", 최소값 : " + min );
		
	}

}
