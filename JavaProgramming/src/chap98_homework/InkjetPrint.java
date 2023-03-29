package chap98_homework;

public class InkjetPrint extends Printer{
	int inkRemain;
	
	public InkjetPrint() {
		
	}
	public InkjetPrint(String name, String company, String type, int printPaper, int remainPaper, int inkRemain) {
		this.name = name;
		this.name = name;
		this.company = company;
		this.type = type;
		this.printPaper = printPaper;
		this.remainPaper = remainPaper;
		this.inkRemain = inkRemain;
	}
	
	public void print(int printPaper) {
		System.out.println("잉크젯 프린터 출력");
		this.printPaper = printPaper;
		this.remainPaper--;
		System.out.println(remainPaper);
	}
	
}
