package com.ttnd.jobs;

import com.ttnd.logger.api.Logger;
import com.ttnd.logger.api.LoggerBuilder;

public class BirthdayWishJob {
	public static void main(String []args) {
		Logger logger = LoggerBuilder.getLogger();
		logger.log("Happy Birthday Java 9");
	}
}
