package chap98_homework;

public class _4_04_lambda {
	
	static int [] intArr = new int[20];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		action(num -> {
			for(int i = 0; i<num.length; i++) {
				if(num[i] % 2 == 0) {
					System.out.print(num[i] + " ");
				}
			}
			
		});
		
		action2((sb1, sb2) -> {
			StringBuilder resultStr;
			resultStr =sb1.append(sb2).reverse();
			return resultStr;
		});
		
		action3(StringBuilder :: append);
		action4(StringBuilder :: reverse);
		
		for(int i = 0; i<intArr.length; i++) {
			intArr[i] = (int)(Math.random()* 20) +1;
			System.out.print(intArr[i] + " ");
		}
		System.out.println();
		System.out.println("------------");
		action5(IntArrUtils::getMax);
		action5(IntArrUtils::getMid);
		action5(IntArrUtils::getMin);
		
		
	}
	
	
	public static void action(PrintEvenNum pen) {
		int[] intArr = new int[10];
		for(int i = 0; i<intArr.length; i++) {
			intArr[i] = (int)(Math.random()* 10) +1;
			System.out.print(intArr[i]+ " ");
		}
		System.out.println();
		System.out.println("------------------");
		pen.printEvenNum(intArr);
	}
	
	public static void action2(CombineStrBuilder csb) {
		StringBuilder sb1 = new StringBuilder("abcd");
		StringBuilder sb2 = new StringBuilder("efgh");
		
		System.out.println();
		System.out.println("------------------");
		System.out.println(csb.combineStrBuilder(sb1, sb2));
	}
	
	public static void action3(AppendSb asb){
		StringBuilder sb1 = new StringBuilder("abcd");
		StringBuilder sb2 = new StringBuilder("efgh");
		System.out.println();
		System.out.println("------------------");
		
		System.out.println(asb.append(sb1, sb2));
	}
	
	public static void action4(ReverseSb rsb) {
		StringBuilder sb = new StringBuilder("abcd");
		System.out.println();
		System.out.println("------------------");
		
		System.out.println(rsb.reverse(sb));
		System.out.println("-------------------");
	}
	
	public static void action5(MaxMinMid mmm) {
		 System.out.println(mmm.maxOrMinOrMid(intArr));
	}

}
