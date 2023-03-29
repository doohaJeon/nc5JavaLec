package chap98_homework;

public abstract class _3_21_Employee {
	private int eno;
	private String name;
	private int pay;
	private int type;
	
	public _3_21_Employee() {};
	public _3_21_Employee(int eno, String name, int pay, int type) {
		this.eno = eno;
		this.name = name;
		this.pay = pay;
		this.type = type;
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

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public abstract double getMonthPay();
	
	public void showEmployeeInfo() {
		System.out.println("사번 : " + eno + "\n이름 : " + name + "\n급여 : " + pay);
	}
}
