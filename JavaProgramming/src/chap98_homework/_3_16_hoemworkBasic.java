package chap98_homework;

public class _3_16_hoemworkBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		int num = 0;
		for(int i = 0; i <arr.length; i++) {
			num++;
			arr[i] = 3 * num;	
		}
		for(int j = 9; j >= 0; j--) {
			System.out.println(arr[j]);
		}
	}

}
