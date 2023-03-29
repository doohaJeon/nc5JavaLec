package chap04_controlStatement;

import java.util.ArrayList;
import java.util.List;

public class _11_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. for문의 contunue는 증감식으로 돌아가는 역할
		//
		for(int i = 0; i < 10; i++) {
			
			if(i < 5) {
				continue;
			}
			
			System.out.println(i);
			
		}
		
		//2. while의 continue
		//while문은 증감식이 없어서 조건식으로 돌아간다.
		int num = 0;
		while(num <= 20) {
			num++;
			
			if(num % 3 == 0) {
				continue;
			}
			
			System.out.println(num);
		}
		
		//3.
		List<String> memberList = new ArrayList<String>();
		
		//모든 회원 아이디에 a를 붙이는 작업
		//아이디가 admin인 회원은 제외
		for(int i = 0; i < memberList.size(); i++) {
			if(memberList.get(i).equals("admin")) {
				continue;
			}
			
			String newMemberId = memberList.get(i) + "a";
		}
	}

}
