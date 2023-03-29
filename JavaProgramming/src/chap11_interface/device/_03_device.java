package chap11_interface.device;

public class _03_device {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV ed = new SamsungTv();
		
		ed.changeChannel(3);
		
		ed.powerOn();
		ed.sound();
		ed.changeChannel(3);
		ed.show();
		ed.reset();
		ed.powerOff();
		
		//static 메소드를 사용하려면 static 메소드가 선언된 클래스를 사용해서 호출한다.
		ElectronicDevice.warn();
		//static 메소드는 상속받은 자식클래스에서 호출은 불가능하다.
//		Tv.warn();
//		Display.Warn();
	}

}
