package chap98_homework;

import java.util.List;

public class _3_28_basic3 {
	public static Integer add(List<?> list) {
		int sum = 0;
		for(int i = 0; i<list.size(); i++) {
			sum += Integer.parseInt((String)list.get(i));
		}
		return sum;
	}
}
