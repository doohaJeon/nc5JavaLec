package two.txt;

public class GovernmentEmployee implements Worker {

	@Override
	public void attendance() {
		// TODO Auto-generated method stub
		System.out.println("안정성 하나만 보고 출근한다.");
	}

	@Override
	public void leaveWork() {
		// TODO Auto-generated method stub
		System.out.println("공무원은 칼퇴하는줄 알았는데 그것도 아닌거 같다.");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("국민들에게 봉사한다는 사명감을 가지고 일한다.");
	}

}
