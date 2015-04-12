package com.qedge.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRead {
	
	public String readProperties(String locator) throws IOException
	{
		FileInputStream f=new FileInputStream("E:\\March2Batch\\SeleniumWebdriver\\OR.properties");
		Properties prop=new Properties();
		prop.load(f);
		return prop.getProperty(locator);
	}

}
