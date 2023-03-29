package chap98_homework;

public class _3_23_middle3 {
	/*
	 * 처음에 은행에 맡긴 돈은 10000원입니다 금리는 연 10%입니다 복리이자로 계산했을 때 10년후 얼마가 될까요?
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money = 10000;
		int sum = 0;
		int interest;
	
		for(int i = 1; i<11; i++) {
			interest = (int)(money * 0.1);
			money = (money + interest);
			sum += money;
		}
	
		System.out.println(sum);
	}

}
