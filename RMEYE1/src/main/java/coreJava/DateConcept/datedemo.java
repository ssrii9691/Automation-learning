package coreJava.DateConcept;

import java.text.SimpleDateFormat;
import java.util.Date;

public class datedemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		
		System.out.println(d); //output:-current date-time ist format
		
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
		System.out.println(sdf.format(d)); //output:-5/23/2024 
		
		SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(sd.format(d)); //output:-5/23/2024 10:04:15

	}

}
