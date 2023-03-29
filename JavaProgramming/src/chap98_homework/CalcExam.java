package chap98_homework;

public class CalcExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc[] calcArr = new Calc[4];
		calcArr[0] = new Add();
		calcArr[1] = new Sub();
		calcArr[2] = new Mul();
		calcArr[3] = new Div();
		
		calcArr[0].setValue(5, 2);
		calcArr[1].setValue(10, 5);
		calcArr[2].setValue(4, 7);
		calcArr[3].setValue(100, 10);
		
		int result = calcArr[0].calculate(calcArr[0].a, calcArr[0].b); 
		int result2 =calcArr[1].calculate(calcArr[1].a, calcArr[1].b);
		int result3 =calcArr[2].calculate(calcArr[2].a, calcArr[2].b); 
		int result4 =calcArr[3].calculate(calcArr[3].a, calcArr[3].b);
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
	}

}
