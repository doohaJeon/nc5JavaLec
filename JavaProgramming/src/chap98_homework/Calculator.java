package chap98_homework;

public class Calculator<T extends Number> {
	
	private T t1;
	private T t2;
	
	public Calculator(T t1, T t2) {
		this.t1 = t1;
		this.t2 = t2;
	}

	public T getT1() {
		return t1;
	}

	public void setT1(T t1) {
		this.t1 = t1;
	}

	public T getT2() {
		return t2;
	}

	public void setT2(T t2) {
		this.t2 = t2;
	}
	
	public double add(T t1, T t2) {
		return Math.round((t1.doubleValue() + t2.doubleValue()) *100) / (double)100;
	}
	
	public double sub(T t1, T t2) {
		return Math.round((t1.doubleValue() - t2.doubleValue()) *100) / (double)100;
	}
	
	public double mul(T t1, T t2) {
		return Math.round((t1.doubleValue() * t2.doubleValue()) *100) / (double)100;
	}
	
	public double div(T t1, T t2) {
		return Math.round((t1.doubleValue() / t2.doubleValue()) *100) / (double)100;
	}
	
}
