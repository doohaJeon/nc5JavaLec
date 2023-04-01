package two.txt;

public class CoupangMan extends Alba {
	
	public CoupangMan(int workingHours, int hourlyWage) {
		super(workingHours, hourlyWage);
	}
	
	public void work() {
		System.out.println("쿠팡맨은 일한 시간동안 배송해서 일한 시간 * 시간당 급여를 받는다.");
	}
}
