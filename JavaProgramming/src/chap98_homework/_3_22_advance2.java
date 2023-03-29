package chap98_homework;

import java.util.Scanner;

public class _3_22_advance2 {
//	사용자가 입력한 문자열(단, 숫자로만 구성돼야함)을 
//	   정수형으로 바꿔주는 메소드 int convertToInt(String str)
//	   을 작성하세요. ex) "532" -> 532, "-714" -> -714
	public static int convertToInt(String str) {
		int number = 0;
		 try{
	            number = Integer.parseInt(str);
	            System.out.println(number); 
	            
	        }
	        catch (NumberFormatException ex){
	            ex.printStackTrace();
	        }
			 return number;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		convertToInt(str);
	}	

}
