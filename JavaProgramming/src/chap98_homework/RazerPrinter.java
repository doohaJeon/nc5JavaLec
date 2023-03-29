package chap98_homework;

public class RazerPrinter extends Printer{
	int tonerRemain;
	
	public RazerPrinter(String name, String company, String type, int printPaper, int remainPaper, int tonerRemain) {
		this.name = name;
		this.company = company;
		this.type = type;
		this.printPaper = printPaper;
		this.remainPaper = remainPaper;
		this.tonerRemain = tonerRemain;
	}
	
	public void print(int printPaper) {
		System.out.println("레이저 프린터 출력!!");
		this.printPaper = printPaper;
		this.remainPaper--;
		System.out.println(remainPaper);
	}
}
