package chap10_abstraction.product;

public class Test {
	
	public static void main(String[] args) {
		School eng = new EnglishSchool();
		
		
		eng.attend();
		eng.teach();
		eng.solveHomework();
		eng.rest();
		
		System.out.println("------------------------------");
		eng = new ComputerSchool();
		
		eng.attend();
		eng.teach();
		eng.solveHomework();
		eng.rest();
	}
}
