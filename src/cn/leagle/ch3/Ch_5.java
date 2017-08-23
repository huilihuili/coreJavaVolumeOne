package cn.leagle.ch3;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import org.junit.Test;

public class Ch_5 {
	
	@Test 
	public void test1() {
		System.out.println(Calendar.MONDAY);
		System.out.println(Calendar.TUESDAY);
		System.out.println(Calendar.WEDNESDAY);
		System.out.println(Calendar.THURSDAY);
		System.out.println(Calendar.FRIDAY);
		System.out.println(Calendar.SATURDAY);
		System.out.println(Calendar.SUNDAY);
		
		
		System.out.println(Calendar.JANUARY);
		System.out.println(Calendar.FEBRUARY);
		System.out.println(Calendar.MARCH);
		System.out.println(Calendar.APRIL);
		System.out.println(Calendar.MAY);
		System.out.println(Calendar.JUNE);
		System.out.println(Calendar.JULY);
		System.out.println(Calendar.AUGUST);
		System.out.println(Calendar.SEPTEMBER);
		System.out.println(Calendar.OCTOBER);
		System.out.println(Calendar.NOVEMBER);
		System.out.println(Calendar.DECEMBER);
	}
	
	@Test
	public void test() {
		Locale.setDefault(Locale.US);
		
		GregorianCalendar d = new GregorianCalendar();
		
		/*
		 * 
		 * °ËÔÂ£º7
		 * 
		 */
		int today = d.get(Calendar.DAY_OF_MONTH);
		int month = d.get(Calendar.MONTH);
		
		d.set(Calendar.DAY_OF_MONTH, 1);
		
		int weekday = d.get(Calendar.DAY_OF_WEEK);
		
		int firstDayOfWeek = Calendar.MONDAY;
		
		int indent = 0;
		while (weekday != firstDayOfWeek) {
			indent++;
			d.add(Calendar.DAY_OF_MONTH, -1);
			weekday = d.get(Calendar.DAY_OF_WEEK);
		}

		String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
//		for (int i = 1; i <= 7; i++)
//			System.out.printf("%4s", weekdayNames[i]);
		
		do {
			System.out.printf("%4s", weekdayNames[weekday]);
			d.add(Calendar.DAY_OF_MONTH, 1);
			weekday = d.get(Calendar.DAY_OF_WEEK);
		} while (weekday != firstDayOfWeek);
		
		System.out.println();
		
		for (int i = 1; i <= indent; i++)
			System.out.print("    ");
		
		d.set(Calendar.DAY_OF_MONTH, 1);
		
		do {
			int day = d.get(Calendar.DAY_OF_MONTH);
			System.out.printf("%3d", day);
			
			if (day == today)
				System.out.print("*");
			else 
				System.out.print(" ");
			
			d.add(Calendar.DAY_OF_MONTH, 1);
			weekday = d.get(Calendar.DAY_OF_WEEK);
			
			if (weekday == firstDayOfWeek)
				System.out.println();
		} while (d.get(Calendar.MONTH) == month);
		
		if (weekday != firstDayOfWeek)
			System.out.println();
	}

}
;