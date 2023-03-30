package chap98_homework;

public class _3_21_temporaryJob extends _3_21_Employee {
	
	int hireYear;
	
	public _3_21_temporaryJob() {};
	
	public _3_21_temporaryJob(int eno, String name, int pay,  int hireYear) {
		super(eno, name, pay);
		this.hireYear = hireYear;
		// TODO Auto-generated constructor stub
	}
	_3_21_temporaryJob tem = new _3_21_temporaryJob();
	@Override
	public double getMonthPay() {
		// TODO Auto-generated method stub
		int monthPay = 0;
		monthPay = tem.getPay() / 12;
		return monthPay;
	}
	
	@Override
	public void showEmployeeInfo() {
		System.out.println("사번 : " + tem.getEno() + "\n이름 : " + tem.getName() + "\n월급 : " + getMonthPay() + "\n고용연도 : " + hireYear);
	}
	
}
