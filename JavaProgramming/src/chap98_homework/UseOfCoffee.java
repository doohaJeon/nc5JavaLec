package chap98_homework;

public class UseOfCoffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

		Coffee cf = Coffee.AMERICANO;

		Coffee la = Coffee.LATTE;

		Coffee mo = Coffee.MOCHA;

		Coffee co = Coffee.COLDBREW;


		System.out.println("아아 2잔 : " + cf.totalPrice(2, 0));

		System.out.println("뜨아 1잔 : " + cf.totalPrice(0, 1));

		System.out.println("아라 1잔 : " + la.totalPrice(1, 0));

		System.out.println("휘핑 모카 2잔 : " + mo.totalPrice(2, 0));

		System.out.println("콜드브루 2잔 : " + co.totalPrice(0, 2));
	}

}
