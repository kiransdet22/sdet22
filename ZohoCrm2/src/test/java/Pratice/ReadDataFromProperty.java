package Pratice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty 
{
	public void readDataFromPropertyfile() throws IOException
	{
		FileInputStream fis=new FileInputStream("./Data1/commonData.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		
		String url = pobj.getProperty("url");
		String Browser = pobj.getProperty("browser");
		String us = pobj.getProperty("username");
		String password = pobj.getProperty("password");
		System.out.println(url);
		System.out.println(Browser);
		System.out.println(us);
		System.out.println(password);
	}

}
