package chap06_class.animal;

public class _05_useOfBird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird = new Bird("참새", "모이");
		Bird bird2 = new Bird("독수리", "뱀");
		Bird bird3 = new Bird("닭둘기", "잡식");
		
//		bird.name = "참새";
//		bird.food = "모이";
//		
//		bird.fly();
//		bird.cry();
//		bird.walk();
		bird.eat();
		bird2.eat();
		bird3.eat();
	}

}
