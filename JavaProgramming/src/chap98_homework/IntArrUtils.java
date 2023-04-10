package chap98_homework;

import java.util.Arrays;

public class IntArrUtils {
	public static int getMax(int[]arr) {
		int max = 0;
		for(int num : arr) {
			if(num > max)
				max = num;
		}
		return max;
		
	}
	
	public static int getMin(int[]arr) {
		
		int min = arr[0];
		for(int num : arr) {
			if(num < min)
				min = num;
		}
		return min;
	}
	
	public static int getMid(int[]arr) {
		
		int mid = 0;
		Arrays.sort(arr);
		
		mid = arr[arr.length /2];
		
		return mid;
	}
}
