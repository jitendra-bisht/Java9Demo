package com.ttnd.logger.api.impl;

import com.ttnd.logger.api.Logger;

public class FileLogger implements Logger {
	public void log(String message) {
		System.out.println(message);
	}
}
