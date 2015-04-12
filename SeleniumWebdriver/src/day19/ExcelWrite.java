package day19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	
	public static void main(String[] args) throws IOException {
		FileInputStream f=new  FileInputStream("C:\\Users\\sai\\Desktop\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Iterator<Row> row=ws.iterator();
		int i=1;
		while(row.hasNext())
		{
			Row r=row.next();
			r.getCell(1).setCellValue("abc"+i);
			Cell c=r.createCell(2);
			c.setCellValue("xyz"+i);
			i++;
		}
		
		
		FileOutputStream f1=new FileOutputStream("C:\\Users\\sai\\Desktop\\Book1.xlsx");
		wb.write(f1);
		f1.close();
		
		

	}

}
