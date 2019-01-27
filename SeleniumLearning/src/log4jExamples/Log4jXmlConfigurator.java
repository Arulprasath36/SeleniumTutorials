package log4jExamples;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Log4jXmlConfigurator {

	static Logger logger = Logger.getLogger(Log4jXmlConfigurator.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DOMConfigurator.configure("log4j.xml");
		
		logger.debug("This is a debug message");
		logger.info("This is an info");
		logger.warn("This is a warning");
		logger.error("This is an error");
		logger.fatal("This is a fatal message");
		
	}

}
