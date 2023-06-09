package chap16_collectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import chap06_class.car.Car;

public class _09_listMapEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Car> carList = new ArrayList<Car>();
		
		carList.add(new Car("현대", "제네시스", "흰색", 5000));
		carList.add(new Car("기아", "모하비", "흰색", 4000));
		carList.add(new Car("쉐보레", "카마로", "노란색", 6000));
		carList.add(new Car("벤츠", "E시리즈", "흰색", 8000));
		carList.add(new Car("BMW", "7시리즈", "파란색", 7000));
		
		//carList를 List<Map<String, Object>>로 변환
		List<Map<String, Object>> carMapList = new ArrayList<Map<String, Object>>();
		
		for(Car car : carList) {
			Map<String, Object> carMap = new HashMap<String, Object>();
			carMap.put("제조사", car.company);
			carMap.put("model", car.model);
			carMap.put("color", car.color);
			carMap.put("price", car.price);
			carMapList.add(carMap);
		}
		for(int i = 0; i<carMapList.size(); i++) {
			System.out.println(carMapList.get(i));
		}
		
		
		
		
		
	}

}
