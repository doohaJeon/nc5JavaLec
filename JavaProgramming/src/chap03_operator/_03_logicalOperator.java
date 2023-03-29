package chap03_operator;

public class _03_logicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 관계 연산자
		int num1 = 100;
		int num2 = 300;
		
		System.out.println("num1 < num2 : " 
							+ (num1 < num2)); 
							//true
		
		System.out.println("num1 >= num2 : " 
							+ (num1 >= num2)); 
							//false
		
		System.out.println("num1 == num2 : " 
							+ (num1 == num2));
							//false
		System.out.println("-------------------");
		
		// String 값의 동일여부를 판달할 때 == 사용하지 않는다.
		// ==을 사요하면 같은 값인지 비교하는게 아니고 같은 객체를 참조하고 있는 지 비교
		// 값의 동일여부를 비교하려면 .equals()메소드 사용
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		//같은 객체를 참조하는지
		System.out.println(str1 == str2);
		
		//값의 동일여부 비교
		System.out.println(str1.equals(str2));
		
		//2. 논리 연산자(&&, ||, !)
		int num3 = 10;
		int num4 = 20;
		
		System.out.println("num1 < num2 &&" +
				  "num3 / num4 == 0 = " 
				+ (num1 < num2 && num3 / num4 == 0));
				//true && true => true
		
		
		System.out.println("false || num4"
				+ " * num2 < 100 = " 
				+ (false || num4 * num2 < 100));
				//false || false => false
		
		System.out.println("!(num4 < 2000) = " +
				(!(num4 < 2000))); //!true => false
		
		
		
		
		
		
		
	}

}
