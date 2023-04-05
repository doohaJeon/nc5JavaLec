package chap98_homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class _4_05_Stream04 {
//	사용자가 입력한 영문자 10개를 저장하는 List<Character> charList를 만들고 스트림을 이용해서
//    영문자가 소문자면 대문자로 대문자면 소문자로 바꾼 스트림을 만들어서 출력하세요.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char []input = sc.nextLine().toCharArray();
		List<Character> charList = new ArrayList<Character>();
		for(int i = 0; i<input.length; i++) {
			charList.add(input[i]);
		}
		
		Stream<Character> charStream = charList.stream();
		Stream<Character> newCharStream = 
				charStream.map(c -> {
				char ch = (Character.isLowerCase(c)) ? c.toUpperCase(c) : c.toLowerCase(c);
			return ch;
		});
		newCharStream.forEach(c -> System.out.print(c+ " "));
		
			
		
	}

}
