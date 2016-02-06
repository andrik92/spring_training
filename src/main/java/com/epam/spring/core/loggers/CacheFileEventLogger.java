package com.epam.spring.core.loggers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.epam.spring.core.beans.Event;

public class CacheFileEventLogger extends FileEventLogger {

	int cacheSize;
	List<Event> cache = new ArrayList<Event>();

	public CacheFileEventLogger(String filename, int cacheSize) {
		super(filename);
		this.filename = filename;
		this.cacheSize = cacheSize;
	}

	// public CacheFileEventLogger(int cacheSize) {
	// super();
	// this.cacheSize = cacheSize;
	// }

	@Override
	public void logEvent(Event event) {
		cache.add(event);
		cache.add(event);
		cache.add(event);
		cache.add(event);

		if (cache.size() == cacheSize) {
			writeEventsFromCache();
			cache.clear();
		}
	}

	private void writeEventsFromCache() {
		boolean append = true;

		for (Event i : cache) {
			try {
				FileUtils.writeStringToFile(new File(filename), i.toString(),
						append);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void destroy() {
		if (!cache.isEmpty()) {
			writeEventsFromCache();
		}
	}
}
