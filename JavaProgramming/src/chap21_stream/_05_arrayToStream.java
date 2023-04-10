package chap21_stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_arrayToStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = new int[10];
		
		for(int i = 0; i< 10;i++) {
			intArr[i] = (int)(Math.random()*10 + 1);
		}
		for(int num : intArr) {
			System.out.print(num + " ");
		}
							//IntStream.of(intArr)
		IntStream intStream = Arrays.stream(intArr);
		
		//5이상인 값들만 스트림으로 만들기
		IntStream fiveOver = intStream.filter(num -> num >= 5);
		
		//* 4 새로운 스트림 만들기
		fiveOver.map(num -> num * 4).forEach(num -> System.out.print("\n" + num));
	}

}
