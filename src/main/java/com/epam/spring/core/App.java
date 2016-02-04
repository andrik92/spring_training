package com.epam.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.epam.spring.core.beans.Client;
import com.epam.spring.core.beans.Event;
import com.epam.spring.core.loggers.ConsoleEventLogger;

public class App {
	private Client client;
	private ConsoleEventLogger eventLogger;

	public App(Client client, ConsoleEventLogger eventLogger) {
		super();
		this.client = client;
		this.eventLogger = eventLogger;
	}

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring.xml");

		App app = (App) ctx.getBean("app");
		Event event = (Event) ctx.getBean("event");
		

		
		// app.client = new Client("1", "John Smith");
		// app.eventLogger = new ConsoleEventLogger();

		
		
//		app.logEvent("Some event for user 1");
//		app.logEvent("Some event for user 2");
		
		app.logEvent(event);
	}

	private void logEvent(Event event) {
//		//String message = msg.replaceAll(client.getId(), client.getFullName());
//		eventLogger.logEvent(event);
		event.setMsg("It's a magic :-)");
		eventLogger.logEvent(event);
	}
}
