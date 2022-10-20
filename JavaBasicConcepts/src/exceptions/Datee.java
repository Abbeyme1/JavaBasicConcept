package exceptions;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import java.util.Locale;

public class Datee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate d = LocalDate.of(2000, 4, 25);
		
		LocalTime t = LocalTime.now();
		
		
		System.out.println(d.getDayOfWeek());
		LocalDate nextMonday = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		
		
		System.out.println(nextMonday);
		System.out.println(t);
		
		t = LocalTime.now(ZoneId.of("America/Virgin"));
		System.out.println(t);
		
		// all time zones
//		for(String s : ZoneId.getAvailableZoneIds())
//			System.out.println(s);
		
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		
		System.out.println(System.currentTimeMillis()/1000/3600);
		
	
		
		
		Date date = new Date();
		Date d2 = new Date(2000,04,12);
		d2.setDate(25);
		
		System.out.println(date.compareTo(d2));
		System.out.println(d2);
		
		// time at that particular instant
		Instant ist = d2.toInstant();
		
		System.out.println(d2.toLocaleString());
		
		
		
		YearMonth ym = YearMonth.of(20, Month.FEBRUARY);
		System.out.println(ym);
		System.out.println(ym.lengthOfYear());
		System.out.println(ym.lengthOfMonth());
		
		MonthDay md = MonthDay.of(Month.FEBRUARY, 29);
		System.out.println(md.isValidYear(2000));

	}

}
