package com.crm.vtiger.GenericUtils;

import java.util.Date;
import java.util.Random;

public class JavaUtilites {

	public static String getRandomData() 
	{
	   Random random = new Random();	
	int ran = random.nextInt(1000);
	return null;

	}
		
	public static String getCurrentDate() 
	{
	Date date = new Date();
	String currentdate=date.toString();
	return currentdate;
		
	}

}
