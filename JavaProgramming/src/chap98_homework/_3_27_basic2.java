package chap98_homework;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class _3_27_basic2 {
//	정수형 데이터를 저장할 수 있는 LinkedList를 생성하고 사용자가 입력한 5개의 정수를 저장하고 index가 3, 4번 요소를 값은 100, 200으로 변경하고 출력하세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<5; i++) {
			list.add(sc.nextInt());
			System.out.print("바꾸기 전 : " + list.get(i) + " ");
		}
		
		list.set(3, 100);
		list.set(4, 200);
		System.out.println("\n------------------------------------");
		for(int i = 0; i<list.size();i++) {
			System.out.print("바꾼 후 : " + list.get(i) + " ");
		}
		
		
	}

}
