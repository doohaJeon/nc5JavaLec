package chap98_homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Generic {
//	Map<Integer, Integer>을 매개변수로 받아서 List<Entry<K, V>>를 리턴하는 메소드 getOverHundr를 구현하세요.
//	   매개변수 Map에는 key는 50~60까지 value는 15~25까지 넣어주고 
	//키와 밸류의 곱셈의 결과가 100을 넘는 Entry만 List에 저장합니다.
	public static <K, V> List<Entry<Integer, Integer>> getOverHundr(Map<Integer, Integer> map){
		List<Entry<Integer, Integer>> entList = new ArrayList<Entry<Integer, Integer>>();
		for(Entry<Integer, Integer> ent : map.entrySet()) {
			if(ent.getKey() * ent.getValue() > 100) {
				entList.add(ent);
			}
		}
		return entList;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int key = 50; int value = 15;
		for(int i = 0; i<= 10;i++) {
			
			map.put(key++, value++);
		}
		
		System.out.println(getOverHundr(map));
		
	}

}
