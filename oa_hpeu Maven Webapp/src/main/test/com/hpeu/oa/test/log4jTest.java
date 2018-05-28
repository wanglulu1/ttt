package com.hpeu.oa.test;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class log4jTest {
	 @Test
	    public void log4j2Test(){
	        Logger logger = LogManager.getLogger();
	        logger.info("5555555");
	    }
}
