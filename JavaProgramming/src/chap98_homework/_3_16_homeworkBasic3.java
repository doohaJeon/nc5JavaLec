package chap98_homework;

public class _3_16_homeworkBasic3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[10];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() *10 +1);
			if(arr[i] % 2 == 1) {
				System.out.println(arr[i]);
			}
		}
	}

}
