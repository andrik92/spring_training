package com.epam.spring.core.beans;

import java.text.DateFormat;
import java.util.Date;

public class Event {
	int Max = 10;
	int Min = 1;
	
	int id = (int) (Math.random() * ( Max - Min ));
	String msg;
	Date date;
	DateFormat df;

	public Event(Date date, DateFormat df) {
		this.date = date;
		this.df = df;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", msg=" + msg + ", date=" + df.format(date)
				+ "]\n";
	}

}
