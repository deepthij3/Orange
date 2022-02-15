package com.genericUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	private FileUtility()
	{
		
	}
	public static FileUtility objForFileUtility() {
		FileUtility f=new FileUtility();
		return f;
	}
	
	
public String readDataFromPropFile(String key) throws IOException {
	FileInputStream fis=new FileInputStream(IAutoConstants.propfilepath);
	Properties prop=new Properties();
	prop.load(fis);
	return prop.getProperty(key);
}	




}
