package container;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Access {
	static  Logger logger = Logger.getLogger(Access.class);
	public static void main(String[] args) {
		
		//BasicConfigurator.configure();
		PropertyConfigurator.configure("log.properties");
		
		logger.debug("This is debug statement");
		logger.error("This is an Error statement");
		logger.info("This is an Info Statement");
		logger.warn("This is a Warning Statement");
		logger.fatal("This is a fatal statement");
	}

}
