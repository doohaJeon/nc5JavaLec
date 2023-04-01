package two.txt;

import java.util.Scanner;

public class Circle {
	int radius;

	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double getCircleArea() {
		return this.radius * this.radius * 3.14;
	}
	
	public double getCircumference() {
		return 2 * this.radius * 3.14;
	}
}
	