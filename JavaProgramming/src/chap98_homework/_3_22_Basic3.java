package chap98_homework;

import java.util.Scanner;

public class _3_22_Basic3 {
	  public static String removeVowels(String str) {
	        String vowels = "aeiouAEIOU"; // 대소문자 알파벳 모음
	        StringBuilder stringBuilder = new StringBuilder();
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            if (vowels.indexOf(c) == -1) { // 해당 문자가 모음이 아니면
	                stringBuilder.append(c); // 결과 문자열에 추가
	            }
	        }
	        return stringBuilder.toString();
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요: ");
		
		String str = sc.nextLine();
		
		 String resultString = removeVowels(str);
	     System.out.println("제거된 문자열: " + resultString);
		
//		char []arr = str.toCharArray();
//		for(int i = 0; i<arr.length; i++) {
//			if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' || arr[i] == 'A' || arr[i] == 'E' || 
//					arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U') {
//				 
//				str.replace(arr[i], '');
//			}
//		}
	}

}
