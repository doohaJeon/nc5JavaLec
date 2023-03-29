package chap99_etc;

public class MiddleJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 30;
		String str = "";
		
		 str = (age >= 20 && age <= 29) ? "20대입니다." : "20대가 아닙니다." ;
		 
		 System.out.println(str);
		 
		 
		 
		 for(int i = 1; i <= 100; i++) {
				if(i % 2 == 0 && i % 3 == 0)  {
					System.out.print(i + ", ");
				} 
			}
		
	}

}
