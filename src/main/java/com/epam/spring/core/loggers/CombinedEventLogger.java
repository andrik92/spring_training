//package com.epam.spring.core.loggers;
//
//import java.util.Collection;
//
//import com.epam.spring.core.beans.Event;
//import com.epam.spring.core.loggers.interfaces.EventLogger;
//
//public class CombinedEventLogger implements EventLogger{
//
//	Collection<EventLogger> loggers;
//	
//	public CombinedEventLogger(Collection<EventLogger> loggers) {
//		super();
//		this.loggers = loggers;
//	}
//
//	public void logEvent(Event event) {
//		for (EventLogger i : loggers) {
//			i.logEvent(event);
//		}
//	}
//
//}
