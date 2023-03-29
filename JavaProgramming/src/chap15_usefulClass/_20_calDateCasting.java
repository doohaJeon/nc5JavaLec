package chap15_usefulClass;

import java.util.Calendar;
import java.util.Date;

public class _20_calDateCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal1 = Calendar.getInstance();
		cal1.set(2018, 5, 7);
		
		//Calendar -> Date 형변환
		Date d1 = new Date(cal1.getTimeInMillis());
//		Date를 Calendar타입으로 변환
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(d1);
		
		System.out.println(d1);
		System.out.println(cal2.get(Calendar.DAY_OF_WEEK) + " " + 
		cal2.get(Calendar.DAY_OF_MONTH) + " " + 
		cal2.get(Calendar.DATE) + " " +
		cal2.get(Calendar.HOUR_OF_DAY) + " " +
		cal2.get(Calendar.MINUTE) + " " +
		cal2.get(Calendar.SECOND) + " " + 
		cal2.get(Calendar.YEAR));
		
		Calendar cal3 = Calendar.getInstance();
		System.out.println(cal3.get(Calendar.YEAR) - cal2.get(Calendar.YEAR));
	}

}
