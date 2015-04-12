package com.qedge.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshots {
	public void takeScreenshot(WebDriver driver,String filename) throws IOException
	{
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile,new File("E:\\March2Batch\\SeleniumWebdriver\\src\\com\\qedge\\screenshots\\"+filename+".png")); 
				
		
	}

}
