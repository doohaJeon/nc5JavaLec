package chap98_homework;

public abstract class _3_21_Employee {
	private int eno;
	private String name;
	private int pay;
	
	
	public _3_21_Employee() {};
	public _3_21_Employee(int eno, String name, int pay) {
		this.eno = eno;
		this.name = name;
		this.pay = pay;
		
	}
	
	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	

	public abstract double getMonthPay();
	
	public void showEmployeeInfo() {
		System.out.println("사번 : " + eno + "\n이름 : " + name + "\n급여 : " + pay);
	}
}
