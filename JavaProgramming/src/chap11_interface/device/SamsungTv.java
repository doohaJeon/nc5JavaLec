package chap11_interface.device;

public class SamsungTv implements TV{

	int lastChannel;

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("samsung tv 시청");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("samsung tv 킴");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("samsung tv 끔");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("samsung tv 사운드 출력");
	}

	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub
		lastChannel = channel;
		System.out.println(channel+ "채널로 변경");
	}
	
}
