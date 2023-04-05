package two.txt;

import java.util.Scanner;

public class _4_03_control {
//	사용자가 입력한 문자열의 길이가 20이상이면 해당 문자열을 거꾸로 출력하고 
//    20미만이면 문자열에 n, a, v, e, r 다섯개의 문자를 순서대로 추가하여
//    문자열의 길이가 20이 되면 그 때 문자열을 출력하세요.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		char[] charArr = new char[str.length()];
		int index2 = 0;
		if(str.length() >= 20) {
			for(int i = str.length()-1; i>=0; i--) {
				char ch = str.charAt(i);
				charArr[index2++] = ch;
			}
			String reverseStr =  String.valueOf(charArr);
			System.out.println(reverseStr);
		} else {
			int index = 0;
			while(true) {
				char[] chArr = {'n', 'a', 'v', 'e', 'r'};
				str = str.concat(String.valueOf(chArr[index++]));
				if(index == 5) {
					index = 0;
				}
				if(str.length() == 20) {
					break;
				}
			}
			System.out.println(str);
		}
	}

}
