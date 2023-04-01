package two.txt;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Collection_Map02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer>map = new HashMap<String, Integer>();
		map.put("선지해장국", 7000);
		map.put("소머리국밥", 8000);
		map.put("청국장", 6000);
		map.put("전복삼계탕", 10000);
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("음식의 이름과 수량을 입력해주세요.");
		String foodName = sc.next();
		int quantity = sc.nextInt();
		
		
		for(Entry<String, Integer> ent : map.entrySet()) {
			if(ent.getKey().equals(foodName)) {
				System.out.println(foodName + " " + quantity+"개의 음식 가격 : " + (ent.getValue() * quantity)
						+"원 입니다.");
			}
		}
		
		
		
		
		
		
	}

}
