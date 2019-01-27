package log4jExamples;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class BasicConfiguratorExample {

	
	static Logger logger =Logger.getLogger(BasicConfiguratorExample.class);//Factory design pattern
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BasicConfigurator.configure();//"%-4r [%t] %-5p %c %x - %m%n"
		logger.debug("This is a debug message");
		logger.info("This is an info");
		logger.warn("This is a warning");
		logger.error("This is an error");
		logger.fatal("This is a fatal message");
		
	}

}
