package chap10_abstraction.product;

public class LgTv extends Tv{
	public void powerOn() {
		System.out.println("lgtv 켬");
		
	}
	public void powerOff() {
		System.out.println("lgtv 끔");
		
	}
	
	public void operate(int channel) {
		System.out.println("lgtv " + channel +"채널로 변경");
		super.lastChannel = channel;
	}
}
