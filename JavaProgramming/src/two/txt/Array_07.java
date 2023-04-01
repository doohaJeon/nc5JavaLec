package two.txt;

import java.util.Arrays;

public class Array_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] intArr1 = new int[4];
		int [] intArr2 = new int[3];
		
		for(int i = 0; i<intArr1.length; i++) {
			intArr1[i] = (int)(Math.random()*100)+1;
		}
		for(int i = 0; i<intArr2.length; i++) {
			intArr2[i] = (int)(Math.random()*100)+1;
		}
		
		int [] newArr = new int[intArr1.length + intArr2.length];
		int index = 0;
		for(int num : intArr1) {
			newArr[index++] = num;
		}
		for(int num : intArr2) {
			newArr[index++] = num;
		}
		System.out.println("intArr1 : " + Arrays.toString(intArr1));
		System.out.println("intArr2 : " + Arrays.toString(intArr2));
		System.out.println("newArr : " + Arrays.toString(newArr));
		
	}

}
