package coreJava.DateConcept;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal =Calendar.getInstance();
		
		SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(sd.format(cal.getTime())); 
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.AM_PM));
		System.out.println(cal.get(Calendar.MAY));
		System.out.println(Calendar.DECEMBER);
		System.out.println(cal.get(Calendar.MINUTE));



	}

}
