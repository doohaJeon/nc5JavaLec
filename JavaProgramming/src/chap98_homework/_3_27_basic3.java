package chap98_homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _3_27_basic3 {
//	Map<String, Integer>을 하나 생성하여 key는 알파벳(대소문자 구분) value는 해당 알파벳의 유니코드 값을 Integer형태로 저장하세요.
	public static void main(String[] args) {
		
		        Map<String, Integer> map = new HashMap<>();

		        for (char c = 'A'; c <= 'Z'; c++) {
		            map.put(Character.toString(c), (int) c);
		        }
		        for (char c = 'a'; c <= 'z'; c++) {
		            map.put(Character.toString(c), (int) c);
		        }

		        // Map 출력
		        for (String key : map.keySet()) { //keySet() : Map에 저장되어 있는 모든 key를 리턴
		            System.out.println(key + ": " + map.get(key));
		        }
		    }
		

	}	


