package two.txt;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Collection_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Map<String, String>map = new HashMap<String, String>();
//		map.entrySet();
		map.put("Lion", "사자");
		map.put("Tiger", "호랑이");
		map.put("Giraffe", "기린");
		map.put("Zebra", "얼룩말");
		
		System.out.println("영어 단어를 입력해주세요.");
		String str = sc.nextLine();
		
		switch(str) {
		
		case "Lion":
			System.out.println(map.get(str));
			break;
		case "Tiger":
			System.out.println(map.get(str));
			break;
		case "Giraffe":
			System.out.println(map.get(str));
			break;
		case "Zebra":
			System.out.println(map.get(str));
			break;
			default :
				System.out.println("잘못 입력하셨습니다.");
		}
		
		
	}

}
