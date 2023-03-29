package chap98_homework;

public class PrinterExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer pr = new Printer("기본 프린터", "삼성", "USB", 0, 100);
		pr.print(1);
		
		Printer pr1 = new InkjetPrint("잉크젯 프린터", "현대", "paraller", 0, 100, 100);
		pr1.print(3);
		
		Printer pr2 = new RazerPrinter("레이저 프린터", "LG", "port", 0 , 100, 100);
		pr2.print(10);
	}

}
