package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// 현재 시간
		Date now = new Date();
		
		System.out.println( now );
		printDate( now );
		
		// 특정 시간 세팅(2000/08/04)
		Date d1 = new Date(100, 7, 4);
		printDate( d1 );
		
		// 특정 시간 세팅(2000/08/04 14:30:30)
		Date d2 = new Date(100, 7, 4, 14, 30, 30);
		printDate2( d2 );
		
		// 1970년 1월1일 00:00:00 기준
		Date d3 = new Date( 24L * 60 * 60 * 1000 * 365 * 30);
		printDate2(d3);
	}
	
	public static void printDate( Date date ) {
		SimpleDateFormat sdf =
			new SimpleDateFormat( "yyyy년 MM월 dd일 hh시mm분ss초" );
		System.out.println( sdf.format(date) );
	}
	
	public static void printDate2( Date d ) {
		// 년도 (+1900)
		int year = d.getYear();
		
		// 월(0-11)
		int month = d.getMonth();
		
		// 일
		int date = d.getDate();
		
		// 시
		int hour = d.getHours();
		
		//분
		int minutes = d.getMinutes();
		
		//초
		int seconds = d.getSeconds();
		
		//System.out.println( String.format("%02d", hour) );
		System.out.println(
			(year + 1900) + "년 " +
			(month + 1) + "월 " +
			date + "일 " +
			(hour < 10 ? "0" : "") + hour + ":" +
			minutes + ":" +
			seconds);
		
		
		
		
	}

}
