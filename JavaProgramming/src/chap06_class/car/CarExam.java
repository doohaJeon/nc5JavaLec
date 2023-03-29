package chap06_class.car;

public class CarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		
		car.company = "현대";
		car.model= "제네시스";
		car.color = "검정";
		car.price = 5000;
		
		car.carInfo();
		
		Car car2 = new Car();
		
		car2.company = "기아";
		car2.model = "K9";
		car2.color = "빨강";
		car2.price = 6000;
		
		car2.carInfo();
	}

}
