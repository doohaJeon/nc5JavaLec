package chap98_homework;

public class _4_03_oper02 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i = 2; i<=20; i++) {
			for(int j = 2; j<=i; j++) {
				if(i%j == 0) {
					count++;
				}
			}
			if(count == 1) {
				System.out.print(i + " ");
			}
			count = 0;
		}
		for(int i =1; i<=20; i++) {
		String str = (i == 2 || i == 3 || i == 5 || i == 7 || i == 11 ||
				i == 13 || i == 17 || i == 19) ? i+"는 소수입니다." : (i % 4 == 0) ? i+"는 4의 배수입니다." : 
					i+"는 4의 배수가 아닙니다.";
		System.out.println(str);
		}
	
	}

}
