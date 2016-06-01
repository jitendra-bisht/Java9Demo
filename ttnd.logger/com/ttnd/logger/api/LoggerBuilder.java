package com.ttnd.logger.api;

import com.ttnd.logger.api.impl.FileLogger;

public final class LoggerBuilder {
	public static Logger getLogger() {
		return new FileLogger();
	}
}
