package chap98_homework;

import java.util.ArrayList;
import java.util.List;

public class _3_28_basic4 {
	public static <T> void printArr(T [] strArr) {
		for(int i = 1; i<strArr.length; i++) {
			if(i % 3 == 0) {
				System.out.println(strArr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		Integer[] strArr = new Integer[10];
		for(int i =0; i<strArr.length; i++) {
			strArr[i] = i;
		}
	
		
		printArr(strArr);
		
	}
}
