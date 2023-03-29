package chap07_inherit.animal;

public class Whale extends Animal{
	public String sounds;
	public String meal;
	public boolean isSwimming;
	public String color;
	
	public Whale() {}
	
	public Whale(String sounds, String meal, boolean isSwimming, String color, int age, int size, int legCnt, boolean hasWing ) {
		super(age, size, legCnt, hasWing);
		this.sounds = sounds;
		this.meal = meal;
		this.isSwimming = isSwimming;
		this.color = color;
	}
	
	public void eat()  {
		System.out.println(meal + "를 먹는다.");
	}
	
	
	public void whaleSounds () {
		System.out.println("고래는 " + sounds + "를 이용해서 운다");
	}
	
	
}
