package com.testinc.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import org.joda.time.LocalTime;

public class TeriniryOperator {
	String action;
	public String checkTerinory() {
		String Inputone="somecontent";
		action = (Inputone!=null)?"sayhello":"never say hellow";
		return action;
	}

	public String showDate() {
		GregorianCalendar cal = new GregorianCalendar();
		Date creationDate = cal.getTime();
		SimpleDateFormat date_format = new SimpleDateFormat("MMM dd,yyyy HH:mm");
		System.out.println(date_format.format(creationDate));
		return date_format.format(creationDate);

	}

	public String showjodaTime() {
		LocalTime currentTime = new LocalTime();
		return ("The current local time is: " + currentTime);

	}
}



