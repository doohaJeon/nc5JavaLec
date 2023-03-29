package chap98_homework;

import java.util.Calendar;

public class _3_24_advance {
	/*
	 * 1. 2001년 12월 19일이 결혼기념일인 부부가 있다. 윤년이 있는 년도에는 결혼기념일의 날짜를 하루씩 더하기로 했다. 2022년의
	 * 결혼기념일 날짜를 구하세요.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		cal.set(2001, 11, 19);
		for(int i = 2001; i<2023; i++) {
			if(isLeap(i)) {
				cal.add(Calendar.DATE, 1);
			}
		}
		
		System.out.println((cal.get(Calendar.MONTH)+1)+"월" + cal.get(Calendar.DATE) + "일");
	}
	
	public static boolean isLeap(int year) {
		//400으로 나눠떨어지거나
		//4로 나눠 떨어지고 100으로 나눠떨어지지 않는것
		if(year % 400 ==0 || (year % 4 ==0 && year % 100 != 0)) {
			return true;
		} else { 
			return false;
		}
			
	}

}
