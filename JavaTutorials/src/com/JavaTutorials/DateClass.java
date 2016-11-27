package com.JavaTutorials;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		
		Date d=new Date();
		//System.out.println(d.toString());
		SimpleDateFormat sdf=new SimpleDateFormat(" E G MM/dd/y 'at' hh:mm:ss a z");
		System.out.println(sdf.format(d));
		
		
		

	}

}
