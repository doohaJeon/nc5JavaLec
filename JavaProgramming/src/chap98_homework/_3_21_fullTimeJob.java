package chap98_homework;

public class _3_21_fullTimeJob extends _3_21_Employee {
	
	int bonus;
	public _3_21_fullTimeJob() {};
	public _3_21_fullTimeJob(int eno, String name, int pay,  int bonus) {
		super(eno, name, pay);
		this.bonus = bonus;
		// TODO Auto-generated constructor stub
	}
	_3_21_fullTimeJob full = new _3_21_fullTimeJob();
	@Override
	public double getMonthPay() {
		// TODO Auto-generated method stub
		int monthPay = 0;
		monthPay = (full.getPay() / 12) + (bonus / 12);
		return monthPay;
	}
	
	@Override
	public void showEmployeeInfo() {
		System.out.println("사번 : " + full.getEno() + "\n이름 : " + full.getName() + "\n월급 : " + getMonthPay() + "\n보너스 : " + bonus);
	}
	

}
