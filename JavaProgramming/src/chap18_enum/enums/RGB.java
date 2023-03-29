package chap18_enum.enums;

public enum RGB {
	//상수명 RED("red", 255, 0, 0), GREEN("green", 0, 255, 0), BLUE("blue", 0,0,255)
	RED("red", 255, 0, 0){
		public void makeWhite() {
			String [] color = {"red", "green", "blue"};
			
			
		}
	}, GREEN("grren", 0, 255, 0){
		public void makeWhite() {
			String [] color = {"red", "green", "blue"};
			
			
		}
	}, BLUE("blue", 0, 0, 255){
		public void makeWhite() {
			String [] color = {"red", "green", "blue"};
			
			
		}
	};
	
	private String name;
	private int red;
	private int green;
	private int blue;
	
	RGB(String name, int red, int green, int blue) {
		this.name = name;
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	public String getName() {
		return name;
	}

	public int getRed() {
		return red;
	}

	public int getGreen() {
		return green;
	}

	public int getBlue() {
		return blue;
	}
	
	public abstract void makeWhite();
	
}
