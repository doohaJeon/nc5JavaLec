package two.txt;

public class Array_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []intArr = new int[100];
		int index = 0;
		for(int i = 0; i<intArr.length; i++) {
			if((i+1) % 2 == 0) {
				intArr[index] = i+1;
				index++;
			}
		}
		int sum = 0;
		for(int i = 0; i<intArr.length; i++) {
			if(intArr[i] != 0)
			System.out.print(intArr[i]+ " ");
			
			sum += intArr[i];
		}
		System.out.println("\n배열의 합 : " + sum);
	}

}
