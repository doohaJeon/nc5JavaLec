package chap14_exception;

public class _02_generateException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			ArrayIndexOutOfBoundsException aie = new ArrayIndexOutOfBoundsException("인덱스가 초과됐습니다.");
//			throw aie;
			
			//1. NulPointerException 발생
//			String str = null;
//			System.out.println(str.length());
			NullPointerException ne = new NullPointerException("null발생");
			throw ne;
			//2. ArithmeticException 발생
//			int result = 10 / 0;
		} catch(NullPointerException ne) {
			System.out.println(ne.getMessage());
			System.out.println("null값은 출력할 수 없습니다.");
		} catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
			System.out.println("0으로 나눌 수 없습니다.");
		} catch(Exception e) {
			//마지막 catch문은 위에 선언한 catch문을 다 통과한 예외를 처리할 수 있게 모든 예외를 담을 수 있는 예외의 최상위 클래스
			//Exception으로 예외를 처리해준다.
			System.out.println(e.getMessage());
		}
	}

}
