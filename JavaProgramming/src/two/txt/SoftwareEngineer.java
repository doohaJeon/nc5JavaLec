package two.txt;

public class SoftwareEngineer implements Worker {

	@Override
	public void attendance() {
		// TODO Auto-generated method stub
		System.out.println("오늘도 야근하러 간다.");
	}

	@Override
	public void leaveWork() {
		// TODO Auto-generated method stub
		System.out.println("퇴근은 언제쯤 할 수 있을까?");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("오늘도 열심히 일한다.");
	}

}
