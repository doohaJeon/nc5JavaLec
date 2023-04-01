package two.txt;

public class Cashier extends Alba {
	
	public Cashier(int workingHours, int hourlyWage) {
		super(workingHours, hourlyWage);
	}
	
	public void work() {
		System.out.println("캐셔는 일한 시간동안 계산해서 일한 시간 * 시간당 급여를 받는다.");
	}
}
