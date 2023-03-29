package chap15_usefulClass;

import java.util.Scanner;

public class _05_string04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   Scanner scanner = new Scanner(System.in);

	        System.out.print("문자열을 입력하세요: ");
	        String input = scanner.nextLine();
//
//	        String[] keywords = {"비트", "네이버", "클라우드"};
//	        String output = removeKeywords(input, keywords);
//
//	        System.out.println("키워드가 제거된 문자열: " + output);
//	    }
//
//	    public static String removeKeywords(String input, String[] keywords) {
//	        for (String keyword : keywords) {
//	            input = input.replaceAll(keyword, "");
//	        }
//
//	        return input;
//		
//		
//		
	        System.out.println(input.replace("비트", "").replace("네이버", "").replace("클라우드", ""));
	        
	}

}
