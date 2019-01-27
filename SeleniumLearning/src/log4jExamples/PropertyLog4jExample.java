package log4jExamples;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertyLog4jExample {

	static Logger logger= Logger.getLogger(PropertyLog4jExample.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PropertyConfigurator.configure("log4j.properties");
		logger.debug("This is a debug message");
		logger.info("This is an info");
		logger.warn("This is a warning");
		logger.error("This is an error");
		logger.fatal("This is a fatal message");
	}

}
