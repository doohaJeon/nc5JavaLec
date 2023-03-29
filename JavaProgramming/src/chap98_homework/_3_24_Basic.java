package chap98_homework;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*1. 객체의 날짜를 2020년 4월 8일로 변경하고 출력하세요.

2. 위의 객체의 날짜를 add 메소드를 이용해서 5년뒤 2달뒤 3일뒤(동시에)로 변경하고 출력하세요.*/
public class _3_24_Basic {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2020, 3, 8);
		
		Date date = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
        String formattedDate = sdf.format(date);
        System.out.println(formattedDate);
        
        cal.add(Calendar.DATE, (365*5+63));
        System.out.println(cal.get(Calendar.YEAR)+ "년 " + cal.get(Calendar.MONTH) + "월 " + cal.get(Calendar.DATE)+ "일");
        
        
	}
}
