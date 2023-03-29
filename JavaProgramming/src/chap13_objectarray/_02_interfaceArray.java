package chap13_objectarray;

public class _02_interfaceArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ILecture []ilec = new ILecture[3];
		
		ilec[0] = new English();
		ilec[1] = new Mathmetics();
		ilec[2] = new Programming();
		
		for(int i = 0; i < ilec.length; i++) {
			ilec[i].proceedLecture();
		}
	}

}
