package chap16_collectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class _04_arrayListEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//사용자가 문자열을 입력
		//길이를 10만큼씩 잘라서 ArrayList에 저장
		//남은 문자열의 길이가 10보다 작으면
		//남은 문자열을 ArrayList에 저장
		//ex) abcdefghijklmnop
		//[abcdefghi, klmnop]
		//출력
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> strArrList = new ArrayList<String>();
		
		String str = new String(sc.nextLine());
		
		for(int i = 0; i<str.length(); i +=10) {
			if(i+10 < str.length()  ) {
				strArrList.add(str.substring(i, i+10));
			} else {
				strArrList.add(str.substring(i, str.length()));
			}
		}
		
		for(int i = 0; i<strArrList.size(); i++) {
			System.out.println(strArrList.get(i)); 
		}
		
		
	}

}
