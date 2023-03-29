package chap98_homework;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*Calendar 객체를 오늘날짜로 생성하세요.

1. 오늘날짜를 2023-03-24 형식으로 출력하세요.

2. 오늘날짜를 2023년 03월 24일 xx시 xx분 xx초 형식으로 출력하세요.*/
public class _3_24_Basic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String today = sdf.format(date);
		System.out.println(today);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String today2 = sdf2.format(date);
		System.out.println(today2);
		
	}

}
