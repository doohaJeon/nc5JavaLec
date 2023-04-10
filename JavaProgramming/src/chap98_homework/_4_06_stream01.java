package chap98_homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _4_06_stream01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strList = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<10; i++) {
			strList.add(sc.nextLine());
		}
		
		strList.stream().filter(str -> str.length() >= 5)
						.forEach(str -> System.out.println(str));
	}

}
