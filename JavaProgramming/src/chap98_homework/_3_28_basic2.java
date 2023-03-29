package chap98_homework;

public class _3_28_basic2 {
	public static <T> String add(T t1, T t2) {
		String result = "";
		result = (String)t1 + (String)t2;
		return result;
	}
	
	public static void main(String[] args) {
		String add = add(1, 2.3);
	}
}
