package two.txt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collection_Map05 {
//	List에 문자열을 저장하고 사용자가 입력한 문자열을 검색하여 해당 문자열의 인덱스를 출력하세요.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		
		list.add("짱구");
		list.add("철수");
		list.add("훈이");
		list.add("유리");
		list.add("맹구");
		
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		System.out.println("사용자가 입력한 문자열의 인덱스 : " + list.indexOf(name));
			
		
	}

}
