package chap98_homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class _3_27_advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		char maxCh;
		Map<Character, Integer> map = new HashMap<>();
		Set<Entry<Character, Integer>> entryMap = map.entrySet();
		
		String str = sc.nextLine();
		
//		for(int i =0; i<str.length(); i++) {
//			for(int j = i+1; j<str.length(); j++) {
//				if(str.charAt(i) == str.charAt(j)) {
//					
//				}
//			}
//		}
		for(int i = 0; i<str.length(); i++) {
			map.put(str.charAt(i), 1);
		}
		
		
		
		
		
	}

}
