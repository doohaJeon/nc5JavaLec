package chap98_homework;

public class Printer {
		
	public String name;
	public String company;
	public String type;
	public int printPaper;
	public int remainPaper;
	
	public Printer() {
		
	}
	public Printer(String name, String company, String type, int printPaper, int remainPaper) {
		this.name = name;
		this.company = company;
		this.type = type;
		this.printPaper = printPaper;
		this.remainPaper = remainPaper;
	}
	
	public void print(int printPaper) {
		System.out.println("출력합니다");
		this.printPaper = printPaper;
		this.remainPaper--;
		System.out.println(remainPaper);
	}
	
	
}
