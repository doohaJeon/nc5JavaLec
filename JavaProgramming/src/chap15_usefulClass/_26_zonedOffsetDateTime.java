package chap15_usefulClass;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class _26_zonedOffsetDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//현재 날짜와 시간의 LocalDateTime객체 생성
		LocalDateTime ldt = LocalDateTime.now();
		
		//ZonedId 객체 생성
		ZoneId zid = ZoneId.of("Asia/Seoul");
		
		//LocalDateTime에 ZoneId추가해서
				//ZonedDateTime 객체 생성
		ZonedDateTime zdt = ldt.atZone(zid);
		
		ZonedDateTime zdt2 = ZonedDateTime.now();
		//ZonedDateTime 객체에 ZoneId 추가
		ZonedDateTime zdt3 = ZonedDateTime.now().withZoneSameInstant(zid);
		
		//zonedDateTime -> OffsetDateTime
		OffsetDateTime odt = zdt.toOffsetDateTime();
		
		System.out.println(zdt);
		System.out.println(zdt2);
		System.out.println(zdt3);
		System.out.println(odt);
		
		
		
		
		
	}

}
