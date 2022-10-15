package com.Insta.kishore.genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	public void getBrowserName() throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/common.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String browserName = pobj.getProperty("browser");
	}
	
	public void getURL() throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/common.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String browserName = pobj.getProperty("url");
	}
	
	public void getUserName() throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/common.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String browserName = pobj.getProperty("username");
	}
	
	public void getPassword() throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/common.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String browserName = pobj.getProperty("password");
	}
}
