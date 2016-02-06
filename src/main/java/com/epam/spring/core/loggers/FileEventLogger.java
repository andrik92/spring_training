package com.epam.spring.core.loggers;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.epam.spring.core.beans.Event;
import com.epam.spring.core.loggers.interfaces.EventLogger;

public class FileEventLogger implements EventLogger {
	String filename;
	private File file;

	public FileEventLogger(String filename) {
		super();
		this.filename = filename;
	}

	public void logEvent(Event event) {
		boolean append = true;
		try {
			FileUtils.writeStringToFile(new File(filename), event.toString(),
					append);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void init() throws IOException {
		this.file = new File(filename);
		
		if (file.createNewFile()) {
			System.out.println("File is created!");
		} else {
			System.out.println("File is already existed!");
		}
		
		if (!file.canWrite())
			throw new IOException("Can't write!");
	}
}
