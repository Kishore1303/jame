package com.Insta.kishore.pomrepository.library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstaLoginPage {
	WebDriver driver;
	public InstaLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username")
	private WebElement userNameTextField;
	
	public WebElement getUserNameTextField() {
		return userNameTextField;
	}
		
	@FindBy(name="password")
	private WebElement passwordTextField;
	
	public WebElement getPasswordTextField() {
		return passwordTextField;
	}
	
	@FindBy(css="button[type='submit']")
	private WebElement loginSubmitButton;
	
	public WebElement getLoginSubmitButton() {
		return loginSubmitButton;
	}
	
}
