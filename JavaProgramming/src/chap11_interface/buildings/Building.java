package chap11_interface.buildings;

public interface Building {
	//모든 변수는 자동으로 상수화됨
	String PRICE = "expensive";
	int FLOORS = 120;
	
	//메소드는 자동으로 추상화됨
	void build();
	void turnOnAircon();
	int getParkingPrice(int time);
}
