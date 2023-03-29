package chap10_abstraction.product;

public class EnglishSchool extends School {

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("영어를 가르치다.");
	}

	@Override
	public void solveHomework() {
		// TODO Auto-generated method stub
		System.out.println("영어숙제를 풀다");
	}

	@Override
	public void rest() {
		// TODO Auto-generated method stub
		System.out.println("영어학원에서 휴식을 하다.");
	}

	@Override
	public void attend() {
		// TODO Auto-generated method stub
		System.out.println("영어학원에 출석한다.");
	}

}
