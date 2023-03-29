package chap98_homework;

public class _3_21_contractWorker extends _3_21_Employee{
	
	int workDay;
	
	public _3_21_contractWorker() {};
	
	public _3_21_contractWorker(int eno, String name, int pay, int type, int workDay) {
		super(eno, name, pay, type);
		this.workDay = workDay;
		// TODO Auto-generated constructor stub
	}
	_3_21_Employee emp = new _3_21_contractWorker();
	@Override
	public double getMonthPay() {
		// TODO Auto-generated method stub
		int monthPay = 0;
		monthPay = emp.getPay() * workDay;
		return monthPay;
	}
	
	@Override
	public void showEmployeeInfo() {
		System.out.println("사번 : " + emp.getEno() + "\n이름 : " + emp.getName() + "\n월급 : " + getMonthPay() + "\n일한 날 : " + workDay);
	}

}
