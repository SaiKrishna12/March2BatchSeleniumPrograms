package day26;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataqdrivenTestingOnGrid {
	
	@DataProvider(parallel=true)
	public Object[][] getData() throws IOException
	{
		FileInputStream f=new FileInputStream("C:\\Users\\sai\\Desktop\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		int rCount=ws.getLastRowNum()+1;
		Iterator<Row> row=ws.iterator();
		Row r=row.next();
		int cCount=r.getLastCellNum();
		
		System.out.println(rCount);
		System.out.println(cCount);
		
		Object[][] data=new Object[rCount][cCount];
		row=ws.iterator();
		for(int i=0;i<rCount;i++)
		{
			
			for(int j=0;j<cCount;j++)
			{
				data[i][j]=r.getCell(j).getStringCellValue();
			}
			r=row.next();
		}
		return data;
	}
	
	@Test(dataProvider="getData")
	public void loginTest(String u,String p,String b) throws IOException, InterruptedException
	{
		
		
		System.out.println(b);
		DesiredCapabilities cap=null;
		if(b.equals("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.ANY);
		}
		else if(b.equals("chrome"))
		{
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
		RemoteWebDriver driver=new RemoteWebDriver(new URL
				           ("http://localhost:4444/wd/hub"),cap);
		driver.get("http://gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.name("Email")).sendKeys(u);
		Thread.sleep(5000);
		driver.findElement(By.id("Passwd")).sendKeys(p);
		Thread.sleep(5000);
		driver.findElement(By.id("signIn")).click();
	}
		
		
	}


