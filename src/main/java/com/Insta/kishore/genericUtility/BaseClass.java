package com.Insta.kishore.genericUtility;

import org.openqa.selenium.WebDriver;

import com.Insta.kishore.pomrepository.library.InstaHomePage;
import com.Insta.kishore.pomrepository.library.InstaLoginPage;

public class BaseClass {
	WebDriver driver;
	InstaHomePage homePage=new InstaHomePage(driver);
	InstaLoginPage loginPage=new InstaLoginPage(driver);
	FileUtility fileUtil=new FileUtility();
	ExcelUtility excelUtil=new ExcelUtility();
	
}
