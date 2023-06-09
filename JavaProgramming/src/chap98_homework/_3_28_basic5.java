package chap98_homework;

import java.util.ArrayList;
import java.util.List;

public class _3_28_basic5 {
	public static <T extends Number> int getMin(List<T> list){
		int minNum = 0;
		for(int i = 0; i<list.size(); i++) {
			if(i > 0) {
				if(Integer.parseInt(list.get(i).toString()) < minNum){
					minNum = Integer.parseInt(list.get(i).toString());
				}				
			} else {
				minNum = Integer.parseInt(list.get(i).toString());
			}
		}
		return minNum;
	}
	
	public static void main(String[] args) {
		List<Integer>list = new ArrayList<Integer>();
		for(int i =0; i<10; i++) {
			list.add(i+10);
		}
		System.out.println(list);
		System.out.println(getMin(list));
	}
}
