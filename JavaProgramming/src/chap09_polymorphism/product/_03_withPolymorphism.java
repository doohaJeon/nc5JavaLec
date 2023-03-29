package chap09_polymorphism.product;

public class _03_withPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 다형성을 이용해 Tv 바꾸기
		
		Tv tv = new SamsungTv();
		
		
		tv.powerOn();
		tv.operate(12);
		tv.powerOff();
		tv.powerOn();
		Object o = new LgTv();
		o = new SamsungTv();
		
		
		
	}	

}
