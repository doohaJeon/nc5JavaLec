package two.txt;

public class Array_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] intArr = new int[10];
		int num =1;
		for(int i =0; i<intArr.length; i++) {
			intArr[i] = num;
			num++;
			System.out.print(intArr[i] + " ");
		}
	}

}
