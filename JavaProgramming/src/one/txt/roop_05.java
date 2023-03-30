package one.txt;

import java.util.Scanner;

public class roop_05 {
//	사용자가 입력한 10개의 정수를 역순으로 출력하세요.(배열 사용)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("10개의 정수를 입력해주세요.");
		int [] intArr = new int[10];
		for(int i = 0; i<intArr.length; i++) {
			intArr[i] = sc.nextInt();
		}
		for(int i = 9; i>=0; i--) {
			System.out.print(intArr[i] + " ");
		}
	}

}
