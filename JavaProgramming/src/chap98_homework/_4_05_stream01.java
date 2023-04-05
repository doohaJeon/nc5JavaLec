package chap98_homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class _4_05_stream01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = new ArrayList<Integer>();
		
		for(int i = 0; i<10; i++) {
			intList.add((int)(Math.random()*10)+1);
		}
		System.out.println(intList);
		
		Stream<Integer> intStream = intList.stream();

		Stream<Integer> newStream = intStream.map(num -> num * 3);
		newStream.forEach(num -> System.out.print( num + " "));
		
	}

}
