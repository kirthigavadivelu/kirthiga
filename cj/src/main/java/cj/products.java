package cj;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class products {
	static Logger logger = Logger.getLogger(products.class);

	public static void main(String[] args) {
		String name = "hi";

		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		logger.info("this is a message....:" + name);
		logger.warn("warning message...:" + name);
		logger.error("error message...:" + name);
	}
}
