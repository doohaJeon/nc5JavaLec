package two.txt;

public class Alba {
	private int workingHours;
	private int hourlyWage;
	
	public Alba(int workingHours, int hourlyWage) {
		this.workingHours = workingHours;
		this.hourlyWage = hourlyWage;
	}

	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}

	public int getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(int hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
	
	public void work() {
		System.out.println("일한 시간동안 일해서 일한 시간 * 시간당 급여를 받는다.");
	}
}
