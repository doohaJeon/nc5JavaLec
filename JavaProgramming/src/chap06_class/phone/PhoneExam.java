package chap06_class.phone;

import java.util.Scanner;

public class PhoneExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneInfo pi = new PhoneInfo();
		Scanner sc = new Scanner(System.in);
		
		//switch~case문에서 break;시 switch~case문만 종료되기 때문에 while문을 종료시킬 플래그
		boolean isExit = false;

		while (true) {
			System.out.println("---------연락처 목록---------");
			System.out.println("1. 정보 입력");
			System.out.println("2. 모든 정보 출력");
			System.out.println("3. 인덱스로 정보 검색");
			System.out.println("4. 종료");
			
			//nextInt는 enter 값을 처리하지 못하기 때문에
			//숫자 입력 후 엔터를 누르면 엔터값이 남아있다.
			int userInput = sc.nextInt();
			
			switch(userInput) {
				case 1:
					System.out.println("이름을 입력하세요. : ");
					String name = sc.next();
					sc.nextLine();
					System.out.println("번호를 입력하세요. : ");
					String phoneNum = sc.nextLine();
					
					pi.insertPhoneNum(name, phoneNum);
			        break;
				case 2:
					pi.printAllPhoneNum();
					break;
				case 3:
					System.out.println("인덱스 번호를 입력해주세요");
					int num = sc.nextInt();
					pi.printPhoneNum(num);
					break;
				case 4:
					isExit = true;
					break;
				default:
					System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
					continue;
			}
			if(isExit == true) {
				break;
			}
		}
	

	}

}
