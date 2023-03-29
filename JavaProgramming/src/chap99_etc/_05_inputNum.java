package chap99_etc;

import java.util.Random;
import java.util.Scanner;

public class _05_inputNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1~200사이의 숫자를 입력하세요. : ");
		
		Scanner sc = new Scanner(System.in);
		
		//컴퓨터는 변수에 1~200 랜덤값
		
		int com = (int)(Math.random() * 200) + 1;
		Random rand;
		while(true) {
			
			System.out.println(com);
			//사용자 입력 정수 받기 nextInt
			int input = sc.nextInt();
			
			//201이면 while문 종료
			if(input == 201) {
				System.out.println("종료합니다.");
				break;
			}
			
			// com == input
			// 맞췄습니다.
			// 계속 하시겠습니까?
			// 1 => com = 새로운 1~200까지의 난수, 다시 게임 시작
			// 0 => 게임 종료
			else if(input == com) {
				System.out.println("맞췄습니다. 계속 하시겠습니까? : " );
				int input2 = sc.nextInt();
				
				if(input2 == 1) {
					rand = new Random();
					com = rand.nextInt(200) + 1;
					continue;
					
				} else if(input2 == 0) {
					System.out.println("게임 종료");
					break;
				} else {
					System.out.println("잘못 입력하셨습니다.");
				}
				
			} else {
				System.out.println("틀렸습니다. 다시 입력하세요.");
				
			
			}
			
			
			//틀렸습니다. 다시 입력하세요.
			//입력값 다시 받도록 
		}
		sc.close();
		
	}

}
