package chap98_homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

//1. 사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)에 add 메소드로 3일뒤로 변경하고
//yyyy-MM-dd 형식으로 출력하세요. (SimpleDateFormat 클래스 사용. SimpleDateFormat의
//parse() 메소드를 이용하면 String -> Date로 변환가능)
public class _3_24_middle {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String day = sc.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//지정된 형식에 따라 문자열을 날짜로 파싱합니다. 즉, 문자열을 Date 객체로 변환합니다.
		Date date = sdf.parse(day);
		
		Calendar cal = Calendar.getInstance();
		// date타입을 Calendar타입으로 변환
		cal.setTime(date);
		
		cal.add(Calendar.DATE, 3);
		// Calendar -> Date
		date = cal.getTime();
		
		String day2  = sdf.format(date);
		System.out.println(day2);
		
		
		
		
		
		
		
		
	}

}
