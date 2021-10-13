package com.crm.vtiger.GenericUtils;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility
{
	public String getPropertyKeyValue(String key) throws Throwable 
	{
	FileInputStream file=new FileInputStream(Ipathconstant.PROPERTY_FILEPATH);
	Properties prop=new Properties();
	prop.load(file);
	return prop.getProperty(key);
	}
	

}
