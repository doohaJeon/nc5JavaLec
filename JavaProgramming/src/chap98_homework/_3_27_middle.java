package chap98_homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class _3_27_middle {
//	1. 학생이름을 key로 시험점수를 value로 가지는 Map<String, Integer>를 생성하고
//	  4명의 학생 데이터를 입력한 후 4명 중 최고 점을 맞은 학생의 이름과 점수을 출력하세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("철수", 100);
		map.put("짱구", 50);
		map.put("훈이", 70);
		map.put("맹구", 90);
		
		String maxName = "";
		
		int maxScore = 0;
		
		for(String name : map.keySet()) {
			int score = map.get(name);
			if(score > maxScore) {
				maxScore = score;
				maxName = name;
			}
		}
		
		System.out.println("최고점수 이름 : " + maxName + ", 최고점수 : " + maxScore);
		
	}
	

}
