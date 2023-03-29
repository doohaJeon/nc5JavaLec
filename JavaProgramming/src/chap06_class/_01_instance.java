package chap06_class;

import chap06_class.clac.Add;
import chap06_class.clac.Calc;
import chap06_class.clac.Divide;
import chap06_class.clac.Minus;
import chap06_class.clac.Multiple;

public class _01_instance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체화(인스턴스화)
		Add add = new Add();
		Minus mi = new Minus();
		Multiple mul = new Multiple();
		Divide div = new Divide();
		
		add.setNum1(10);
		add.setNum2(20);
		add.setResult(add.getNum1() + add.getNum2());
//		
//		System.out.println(add.getResult());
//		
//		System.out.println(add.add());
		
		mi.setNum1(100);
		mi.setNum2(50);
		mi.setResult(mi.getNum1()-mi.getNum2());
		
//		System.out.println(mi.getResult());
//		System.out.println(mi.minus());
//		
		mul.setNum1(40);
		mul.setNum2(3);
		mul.setResult(mul.getNum1()*mul.getNum2());
		
//		System.out.println(mul.getResult());
//		System.out.println(mul.multiple());
		
		div.setNum1(50);
		div.setNum2(2);
		div.setResult(div.getNum1()/div.getNum2());
		
//		System.out.println(div.getResult());
//		System.out.println(div.divide());
		
		//설계도로 부품을 만드는 작업 == 인스턴스화, 객체화
		//인스턴스화: 생성자를 통해서 객체를 생성하고 heap메모리 영역에 저장, 항상 new 키워드와 함께 사용
		
		Calc cal = new Calc();
		
		int receiveNum = cal.add(10, 20);
		//리턴 값을 받아주는 변수가 없으면 결과가 메모리에 저장되지 않고 연산이 일어난 후 삭제된다.
		cal.add(10, 20);
		
//		System.out.println(cal.add(10, 20));
//		
//		System.out.println(cal.minus(cal.add(10, 20), cal.divi(20, 10)));
		
		Calc cal2 = new Add();
		System.out.println(cal2.add(4, 3));
		
		Calc cal3 = new Minus();
		System.out.println(cal3.minus(4, 3));
	}

}
