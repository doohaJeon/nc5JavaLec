package chap98_homework;

public class _3_20_ArrayUtility {
	
	static double[] intToDouble(int[] source) {
		double []doubleArray = new double[source.length];
		for(int i = 0; i< doubleArray.length; i ++) {
			doubleArray[i] = source[i];
		}
		return doubleArray;
	}
	
	static int[] doubleToInt(double[] source) {
		int []arr = new int[source.length];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)source[i];
		}
		return arr;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
