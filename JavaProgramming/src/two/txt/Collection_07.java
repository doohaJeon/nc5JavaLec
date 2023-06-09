package two.txt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Collection_07 {
//	현대차의 차종과 판매량을 저장하는 Map 한 개와 기아차의 차종과 판매량을 저장하는 Map 한 개를 만들어서
//    List에 둘 다 저장합니다. 회사별로 가장 판매량이 높은 차종의 Entry를 뽑아서 새로운 List에 저장하고 
//    출력하세요. (현대 차종은 아반떼, 소나타, 그랜저 기아 차종은, k5, k7, k9, 판매량은 마음대로 정하시면 됩니다.)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer>hyundai = new HashMap<String, Integer>();
		
		
		
		Map<String, Integer>kia  = new HashMap<String, Integer>();
		
		
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>();
		hyundai.put("아반떼", 300);
		hyundai.put("소나타", 200);
		hyundai.put("그랜저", 100);
		kia.put("k5", 400);
		kia.put("k7", 250);
		kia.put("k9", 100);
		List<Entry<String, Integer>> bestList = new ArrayList<Entry<String, Integer>>();
		
		int maxSale = 0;
		
		Entry<String, Integer> bestHyundaiCar = null;
		Entry<String, Integer> bestKiaCar = null;
		
		for(Entry<String, Integer> hCar : hyundai.entrySet()) {
			
			if(hCar.getValue() > maxSale) {
				maxSale = hCar.getValue();
				bestHyundaiCar = hCar;
			}
			list.add(hCar);
		}
		for (Entry<String, Integer> kCar : kia.entrySet()) {
			if (kCar.getValue() > maxSale) {
				maxSale = kCar.getValue();
				bestKiaCar = kCar;
			}
			list.add(kCar);

		}
		
		bestList.add(bestKiaCar);
		bestList.add(bestHyundaiCar);
		
		for(int i = 0; i<bestList.size(); i++) {
			System.out.println(bestList.get(i)); 
		}
		

		
	}

}
