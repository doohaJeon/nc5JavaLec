package chap98_homework;

public class _3_15_homeworkMiddle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 1; i <=1000; i++) {
			if(i % 2 == 0 && i % 7 == 0) {
				System.out.print(i +", ");
				sum += i;
			}
		}
		System.out.println("\n2와 7의 공배수들의 총합 : " + sum); 
	}

}
