package chap04_controlStatement;

public class _9_duplicatedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i >= j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
    /*
          *   0 4
         **   1 3
        ***   2 2
       ****   3 1
      *****   4 0
     */
	for(int i = 0; i < 5; i++) {
			
			for(int j = 4; j >= 0; j--) {
				if(i >= j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	/*
	 * *****
	 * ****
	 * ***
	 * **
	 * *	
	 */
		
	for(int i = 0; i < 5; i++) {
		
		for(int j = 0; j < 5; j++) {
			if(i <= j) {
				System.out.print("*");
			}
			
		}
		System.out.println();
	}
		/*
		 * *****
		 *  ****
		 *   ***
		 *    **
		 *     * 
		 */
		
		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j < 5; j++) {
				if(i > j) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}

}
