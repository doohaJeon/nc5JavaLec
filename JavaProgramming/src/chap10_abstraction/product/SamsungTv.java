package chap10_abstraction.product;

public class SamsungTv extends Tv{
	public void powerOn() {
		System.out.println("samsungTV 켬");
		
	}
	public void powerOff() {
		System.out.println("samsungTV 끔");
		
	}
	
	public void operate(int channel) {
		System.out.println("samsungTV" + channel + "채널로 변경");
		super.lastChannel = channel;
	}
}
