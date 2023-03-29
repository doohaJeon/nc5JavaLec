package chap98_homework;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class _3_28_middle {
	/*
	 * 1. key와 value 모두 Number를 상속받은 클래스의 타입을 가지고 key, value의 곱이 가장 큰 Entry를 리턴하는
	 * 메소드 getMaxMul을 구현하세요.
	 */
		public static <K, V extends Number> Entry<K, V> getMaxMul(Map<K, V> map) {
			int maxMul = 0;
			Entry<K, V> maxEntry = null;
			int index = 0;
			for(Entry<K, V> ent : map.entrySet()) {
				int mul = (int)ent.getKey() * (int)ent.getValue();
				if(index == 0) {
					maxMul = mul;
					maxEntry = ent;
				} else {
					if(mul > maxMul) {
						maxMul = mul;
						maxEntry = ent;
					}
				}
				index++;
			}
			return maxEntry;
		}
}