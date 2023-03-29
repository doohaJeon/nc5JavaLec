package chap98_homework;

public class _3_23_middle {
	/*
	 * 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다. 비어있는 바이트의 공간을 b, i, t가 반복되어 들어가도록
	 * 모두 채우세요.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer(30);
		sb.append("hello");
		for(int i = 5; i<sb.capacity(); i++) {
			if(sb.charAt(i-1) == 'b') {
				sb.insert(i, 'i');
			} else if(sb.charAt(i-1) == 'i') {
				sb.insert(i, 't');
			} else
			sb.insert(i, 'b');
		}
		
		System.out.println(sb);
	}

}
