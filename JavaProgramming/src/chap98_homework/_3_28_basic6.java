package chap98_homework;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class _3_28_basic6 {
	/*
	 * Map을 어떤형태로든 받아서 value를 String으로 변경했을 때 길이가 10이상되는 key를 출력하는 메소드 void
	 * printOverTen을 구현하세요.
	 */
	public static <K, V> void printOverTen(Map<K, V> map) {
//		Set<Entry<K, V>> entry = map.entrySet();
		
		for(Entry<K, V> ent : map.entrySet()) {
			if(ent.getValue().toString().length() >= 10) {
				System.out.println(ent.getKey());
			}
		}
	}







}
