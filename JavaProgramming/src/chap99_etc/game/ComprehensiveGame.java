package chap99_etc.game;

import java.util.Scanner;

public class ComprehensiveGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean exit = false;
		Game game = null;
		while(true) {
			System.out.println("게임을 선택하세요");
			System.out.println("1. 가위바위보");
			System.out.println("2. 야구게임");
			System.out.println("3. 로또 게임");
			System.out.println("4. 게임 종료");
			
			Scanner sc = new Scanner(System.in);
			
			int user = sc.nextInt();
			
			switch(user) {
				
			case 1: 
				 game = new RockScissPaper();
				
				break;
			case 2:
				game = new NumBaseball();
				
				break;
			case 3:
				game = new Lotto();
				
				break;
			case 4:
				System.out.println("게임을 종료합니다.");
				exit = true;
				break;
				default:
					System.out.println("다시 입력해주세요");
					continue;
				
			}
			game.start();
			
			if(exit)
				break;
			else {
				continue;
			}
			
				
		}
	}

}
