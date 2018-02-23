package util;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		printDate( cal );
		
		Calendar cal2 = Calendar.getInstance();
		cal2.set( Calendar.YEAR, 2007 );
		cal2.set( Calendar.MONTH, 1); //-1
		cal2.set( Calendar.DATE, 22);
		printDate( cal2 );
		
		cal2.add( Calendar.DATE, 100);
		printDate( cal2 );
		
		//기념일
		cal2.set( 1971, 12, 18 );
		cal2.add( Calendar.DATE, 17000);
		printDate( cal2 );
		
		
		
	}

	public static void printDate( Calendar cal ) {
		String[] days =
			{ "일", "월", "화", "수", "목", "금", "토" };
		
		int year = cal.get( Calendar.YEAR );
		// 0 - 11
		int month = cal.get( Calendar.MONTH );
		int date = cal.get( Calendar.DATE ) ;
		//1(일) - 7(토)
		int day = cal.get( Calendar.DAY_OF_WEEK );
		//0->AM, 1->PM
		int am = cal.get( Calendar.AM_PM );
		int hour = cal.get( Calendar.HOUR );
		int minute = cal.get( Calendar.MINUTE );
		int second = cal.get(Calendar.SECOND );
		
		System.out.println(
				year + "년 " +
				(month + 1) + "월 " +
				date + "일 " +
				days[day-1] + "요일 " +
				( am == 0 ? "오전 " : "오후 " ) +
				hour + ":" +
				minute + ":" +
				second );
	}
}
