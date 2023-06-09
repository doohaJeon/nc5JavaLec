package chap98_homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class _3_28_middle2 {
	public static <K, V> void printKVDesc(Map<K, V> map){
		List<Entry<K, V>> list = new ArrayList<Entry<K, V>>();
		for(Entry<K, V> ent : map.entrySet()) {
			list.add(ent);
		}
		
		for(int i = 0; i<list.size(); i++) {
			System.out.print("key : " + list.get(i).getKey()+ " ");
			System.out.println("value : " +list.get(list.size() - (i+1)).getValue());
		}
	}
	
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 1);
		map.put(2, 2);
		map.put(3, 3);
		map.put(4, 4);
		map.put(5, 5);
		printKVDesc(map);
	}
}
