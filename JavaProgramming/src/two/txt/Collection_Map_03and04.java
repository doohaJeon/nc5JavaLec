package two.txt;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Collection_Map_03and04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer>map = new HashMap<String, Integer>();
		map.put("철수", 100);
		map.put("훈이", 60);
		map.put("유리", 70);
		map.put("맹구", 95);
		map.put("짱구", 50);
		
		int maxScore = 0;
		String bestStudent = "";
		
		for(Entry<String, Integer> ent : map.entrySet()) {
			
			if(ent.getValue() >= 90) {
				System.out.print(ent.getKey() + " ");
			}
			
			if(ent.getValue() > maxScore) {
				maxScore = ent.getValue();
				bestStudent = ent.getKey();
			}
		}
		
		System.out.println("\n점수가 가장 높은 학생의 이름과 점수 : " + bestStudent + " : " + maxScore);
		
	}

}
