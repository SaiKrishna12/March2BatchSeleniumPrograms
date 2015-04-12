package com.qedge.utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperations {
	
	public XSSFSheet excelRead(String path,String sheet) throws IOException
	{
		FileInputStream f=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet(sheet);
		return ws;
	}

}
