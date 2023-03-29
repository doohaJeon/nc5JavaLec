package chap10_abstraction.product;

public class ComputerSchool extends School {
	//어노테이션 : @~~~~~
	//@Override : 오버라이드된 메소드라고 컴파일러에게 알림
	//@Override가 없으면 컴파일러가 오버라이드된 메소드인지 부모와 자식을 계속 비교하면서 컴파일한다.
	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("컴퓨터를 가르치다.");
	}

	@Override
	public void solveHomework() {
		// TODO Auto-generated method stub
		System.out.println("컴퓨터숙제를 한다.");
	}

	@Override
	public void rest() {
		// TODO Auto-generated method stub
		System.out.println("컴퓨터학원에서 쉰다.");
	}

	@Override
	public void attend() {
		// TODO Auto-generated method stub
		System.out.println("컴퓨터학원에 출석한다.");
	}

}
