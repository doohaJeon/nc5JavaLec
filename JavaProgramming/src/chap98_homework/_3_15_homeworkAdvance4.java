package chap98_homework;

public class _3_15_homeworkAdvance4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 5; i++) {
			for(int j = 4; j >=0; j--) {
				if(i >= j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			
			for(int k = 1; k < 5; k++ ) {
				if(i >= k) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
