package chap17_generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _04_genericMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = new ArrayList<Integer>();
		
		for(int i =0; i< 10; i++) {
			intList.add(i+1);
		}
		System.out.println(_04_genericMethod.<Integer>getEven(intList));
	}
	
	//Number를 상속 받는 T
	//리턴타입 List<T> getEven(List<T> list)
	public static <T extends Number> List<T> getEven(List<T> list){
		List<T> tList = new ArrayList<T>();
		for(T t  : list){
			if(t.intValue() % 2== 0) {
				 tList.add(t);
			}
			
		}
		return tList;
	}
	
	
	
	
}
