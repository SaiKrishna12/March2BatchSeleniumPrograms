package day13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	
	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("E:\\March2Batch\\SeleniumWebdriver\\myFile.properties");
		Properties prop=new Properties();
		prop.load(f);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		System.out.println(prop.getProperty("country"));
		
	}

}
