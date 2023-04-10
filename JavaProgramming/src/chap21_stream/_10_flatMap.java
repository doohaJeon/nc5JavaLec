package chap21_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _10_flatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = new ArrayList<Integer>();
		
		int[][] intArr = {{1, 2}, {3, 4}, {5, 6}};
		
		Arrays.stream(intArr)
				.flatMapToInt(Arrays :: stream)
				.forEach(num -> System.out.println(num));
					
	}

}
