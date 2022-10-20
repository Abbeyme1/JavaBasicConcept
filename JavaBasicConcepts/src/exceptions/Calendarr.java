package exceptions;

import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Calendarr {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
//		Calendar c = Calendar.getInstance();
//		System.out.println(c.getTimeInMillis());
//		System.out.println(c.getTime());
//		
//		System.out.println(c.get(Calendar.YEAR));
//		System.out.println(c.get(Calendar.MINUTE));
//		
//		System.out.println(c.getMaximum(Calendar.WEEK_OF_MONTH));
//		
//		System.out.println(c.getMinimum(Calendar.WEEK_OF_YEAR));
//		
//		c.add(Calendar.MONTH, -2);
//		System.out.println(c.getTime());
//		
		
		
		Date d = new Date();
		
		String df = DateFormat.getDateTimeInstance().format(d);
		
		System.out.println(df);
		
		df = DateFormat.getInstance().format(d);
		
		System.out.println(df);
		
		df = DateFormat.getTimeInstance().format(d);
		
		System.out.println(df);
		
		df = DateFormat.getTimeInstance(DateFormat.SHORT).format(d);
		
		System.out.println(df);
		
		df = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(d);
		
		System.out.println(df);
		
		df = DateFormat.getTimeInstance(DateFormat.LONG).format(d);
		
		System.out.println(df);
		
		df = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT).format(d);
		
		System.out.println(df);
		
		
		
		TimeZone tz = TimeZone.getDefault();
		System.out.println(tz);
		
		
		tz = TimeZone.getTimeZone("ddd"); // if random then GMT is used
		
		
		tz.setID("Asia/Calcutta");
		System.out.println(tz);
		
		
		System.out.println(tz.getID());
		
		System.out.println(tz.getDisplayName());
		
		 
		
//		for(String t : TimeZone.getAvailableIDs())
//		{
//			System.out.println(t);
//		}
		
	}

}
