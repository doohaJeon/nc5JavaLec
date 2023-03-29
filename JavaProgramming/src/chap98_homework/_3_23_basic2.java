package chap98_homework;

public class _3_23_basic2 {
	/*
	 * 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다. 비어있는 바이트의 공간을 a로 모두 채우시오.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer(30);
		sb.append("hello");
		for(int i = 5; i<sb.capacity(); i++) {
			sb.insert(i, 'a');
		}
		
		System.out.println(sb);
	}

}
