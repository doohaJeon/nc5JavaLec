package chap98_homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _3_27_basic {
//	정수형 데이터를 저장할 수 있는 ArrayList를 생성하고 사용자가 입력한 5개의 정수를 저장하고 출력하세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);

		

		for (int i = 0; i < 5; i++) {
			int input = sc.nextInt();
			list.add(input);	
			System.out.println(list.get(i));
		}

		
	}

}
