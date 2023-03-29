package chap98_homework;

public class _3_23_basic4 {
	/*
	 * 문자열 "145.987", "-563.11" 을 double형으로 변경하여 덧셈의 결과를 출력하세요.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "145.987";
		String str2 = "-563.11";
		
		double num1 = Double.parseDouble(str1);
		double num2 = Double.parseDouble(str2);
		System.out.println(num1+num2);
	}

}
