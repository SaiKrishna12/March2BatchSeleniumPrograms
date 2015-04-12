package day22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GmailLogin_Keywords {
	
	@Test
	public void loginTest() throws IOException
	{
		LoginActionKeywords keys=new LoginActionKeywords();
		FileInputStream f=new FileInputStream("E:\\March2Batch\\SeleniumWebdriver\\src\\com\\qedge\\OR\\ActionsKeywords.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheetAt(0);
		
		FileInputStream f1=new FileInputStream("E:\\March2Batch\\SeleniumWebdriver\\GmailLogin.properties");
		Properties prop=new Properties();
		prop.load(f1);
		Iterator<Row> row=ws.iterator();
		row.next();
		while(row.hasNext())
		{
			Row r=row.next();
			String action=r.getCell(3).getStringCellValue();
			if(action.equals("launchBrowser"))
			{
				keys.launchBrowser();
			}
			else if(action.equals("navigate"))
			{
				keys.navigate();
			}
			else if(action.equals("enterUsername"))
			{
				keys.enterUsername(prop.getProperty("txt_username"));
			}
			else if(action.equals("enterPassword"))
			{
				keys.enterPassword(prop.getProperty("txt_password"));
			}
			else if(action.equals("clickLogin"))
			{
				keys.clickLogin(prop.getProperty("btn_signin"));
			}
		}
	}

}
