package chap99_etc.game;

import java.util.Scanner;

public class RockScissPaper extends Game{
	//몇승 몇무 몇패인지 셀 변수
		private int win = 0;
		private int draw = 0;
		private int lose = 0;
		
		//승점 담아줄 변수(승:1, 무:0, 패:-1)
		private int score = 0;
		
		//승무패 기록을 담아줄 배열
		private int[] wdl;
		
		//게임 실행 메소드
		public void start() {
			
			while(true) {
				win = 0; draw = 0; lose = 0; score = 0;
				Scanner sc = new Scanner(System.in);
					
				//사용자가 입력한 round 만큼 게임진행
				System.out.print("진행할 게임의 판 수를 입력하세요.");
				int round = sc.nextInt();
				wdl = new int[round];
					
				//총 10판 진행
				for(int i = 0; i < wdl.length; i++) {
					//클래스 안에 랜덤 변수를 발생시키는 메소드
					//1 ~ 3까지 랜덤 변수 발생(1:가위, 2:바위, 3:보)
					int randomVal = generateRandom();
					System.out.println(randomVal);
					//int randomVal2 = generateRandom();
						
					//사용자 입력 값 받아서 정수형 변환해주는 메소드
					int userNum = convertUserInput(sc);
						
					if(userNum == 0) {
						System.out.println("잘못 입력하셨습니다.");
						//해당 게임을 다시 진행하기 위해 1 감소
						//for문에서 continue문을 만나면 증감식으로 이동하기 때문
						i--;
						continue;
					}
						
					//승, 무, 패 판단해주는 메소드
					//가위, 바위, 보 비교
					//무승부
					judgeWdl(userNum, randomVal, i);
						
						
						
				}
				//승점 계산해주는 메소드
				//승점 계산
				sumScore();

				if(reGame()) {
					continue;
				} else {
					break;
				}
			}
		}
		
		//1~3 중 랜덤 값 발생시키는 메소드
		public int generateRandom() {
			int ran = (int)(Math.random() * 3 + 1);
			return ran;
		}
		
		//사용자 입력 값을 정수형을 변환해주는 메소드
		public int convertUserInput(Scanner sc) {
			int userNum = 0;
			while(true) {
			 String userInput = sc.next();
			 if(userInput.equals("가위")) {
				 userNum = 1;
				 break;
			 }else if(userInput.equals("바위")) {
				 userNum = 2;
				 break;
			 } else if(userInput.equals("보")) {
				 userNum = 3;
				 break;
			 } else {
				 System.out.println("다시 입력해주세요.");
				 continue;
			 }
		}
			return userNum;
		}
		
		//승, 무, 패 판단 메소드
		public void judgeWdl(int userNum, int randomVal, int i) {
			for(int j = i; j <= i; j++) {
				switch(userNum - randomVal) {
				 case 0:
					 draw++;
					 wdl[j] = 0;
					 break;
				 case -2: case 1:
					 win++;
					 wdl[j] = 1;
					 break;
				 case -1: case 2:
					 lose++;
					 wdl[j] = -1;
					 break;
				}
			}
		}
		
		//승점 계산 및 출력 메소드
		public void sumScore() {
			
			for(int i = 0; i < wdl.length; i++) {
				score += wdl[i];
			}
			System.out.println(win +"승 " +draw+"무 " +lose + "패" );
			System.out.println("승점 : " + score);
		}	
		public boolean reGame() {
			boolean isRegame = false;
			System.out.println("게임이 끝났습니다. 1을 입력하면 다시 시작하고 0을 입력하면 종료합니다.");
			while(true) {
				Scanner sc = new Scanner(System.in);
				int input = sc.nextInt();
				if(input == 1) {
					isRegame = true;
					break;
				} else if(input == 0) {
					break;
				} else {
					System.out.println("1과 0중에서 하나 입력해주세요");
					continue;
				}
			}
			
			return isRegame;
		}
}
