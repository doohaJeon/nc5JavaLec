package two.txt;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Collection_Map06 {
//	List에 정수 10개를 저장하되 중복 값을 1개 이상 포함시키고 Set으로 옮겨서 모든 요소를 출력하세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		
		for(Integer i = 0; i<10; i++) {
			list.add(i+1);
			
			
		}
		list.set(7, 7);
		for(int num : list) {
			System.out.print(num + " ");
		}
		
		System.out.println(",Set객체로 변환 : " + Set.copyOf(list)); 
	}

}
