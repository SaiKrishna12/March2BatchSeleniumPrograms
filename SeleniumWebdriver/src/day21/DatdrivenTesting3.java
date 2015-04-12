package day21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DatdrivenTesting3 {
	FirefoxDriver driver=null;
	@BeforeMethod
	public void setUp()
	{
		 driver=new FirefoxDriver();
		 driver.get("https://care.ideacellular.com/wps/portal/account/express-paybill");

	}
	@Test
	public void AjaxTest() throws IOException
	{
		FileInputStream f=new FileInputStream("E:\\March2Batch\\SeleniumWebdriver\\src\\com\\qedge\\excelfiles\\Ajax.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Iterator<Row> row=ws.iterator();
		row.next();
		while(row.hasNext())
		{
			String phno=null;
			Row r=row.next();
			if(r.getCell(0).getCellType()==r.getCell(0).CELL_TYPE_NUMERIC)
			{
				phno=Long.toString((long)r.getCell(0).getNumericCellValue());
			}
			else
			{
				phno=r.getCell(0).getStringCellValue();
			}
			driver.findElement(By.id("ns_Z7_JH56H4K0KOIPA0ASI08BTI30O5_mobileNumber")).clear();
			driver.findElement(By.id("ns_Z7_JH56H4K0KOIPA0ASI08BTI30O5_mobileNumber")).sendKeys(phno);
			driver.findElement(By.id("ns_Z7_JH56H4K0KOIPA0ASI08BTI30O5_confmobileNo")).click();
			WebElement ajax=driver.findElement(By.xpath("//*[@id='errorHolder']/label"));
			String actajax=null;
			if(ajax.getText().isEmpty())
			{
				 actajax="No Ajax";
			}
			else
			{
			     actajax=driver.findElement(By.xpath("//*[@id='errorHolder']/label")).getText();
			}
			Cell c=r.createCell(2);
			c.setCellValue(actajax);
			String expajax=r.getCell(1).getStringCellValue();
			c=r.createCell(3);
			if(actajax.equals(expajax))
			{
				c.setCellValue("Passed");
			}
			else
			{
				c.setCellValue("Failed");
			}
			
		}
		FileOutputStream f1=new FileOutputStream("E:\\March2Batch\\SeleniumWebdriver\\src\\com\\qedge\\resultexcelfiles\\ajaxResults.xlsx");
		wb.write(f1);
		f1.close();
	}

}
