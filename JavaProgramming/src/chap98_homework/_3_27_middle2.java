package chap98_homework;

import java.util.HashMap;
import java.util.Map;

public class _3_27_middle2 {
	/*
	 * 정수 배열 {1, 2, 3, 4, 5}에서 두 수의 합을 구할 때 같은 값이 나오는 개수를 세서 Map<String, Integer>에
	 * 담은 후 출력하세요. ex) {"3" : 1({1, 2}), "4" : 1({1, 3}), "5" : 2({1, 4}, {2, 3})}
	 */
	public static void main(String[] args) {
		int []arr = {1, 2, 3, 4, 5};
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i = 0; i<arr.length; i++) {
			for(int j= 0; j<i; j++) {
				switch(arr[i] + arr[j]) {
				case 3:	
					count3++;
					map.put("3", count3);
					break;
				case 4:
					count4++;
					map.put("4", count4);
					break;
				case 5:
					count5++;
					map.put("5", count5);
					break;
				}
			}
		}
		
		for(String key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}
	}
}
