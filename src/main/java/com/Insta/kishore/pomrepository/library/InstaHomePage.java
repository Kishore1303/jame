package com.Insta.kishore.pomrepository.library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstaHomePage {
	WebDriver driver;
	public InstaHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="input[type='text']")
	private WebElement searchTextField;
	
	public WebElement getSearchTextField() {
		return searchTextField;
	}
	
	@FindBy(css = "*[aria-label='Home']")
	private WebElement homeLink;
	
	public WebElement getHomeButton() {
		return homeLink;
	}
	
	@FindBy(css = "*[aria-label='New post']")
	private WebElement newPostLink;
	
	public WebElement getNewPostButton() {
		return newPostLink;
	}
	
	@FindBy(css = "*[aria-label='Find People']")
	private WebElement findPeopleLink;
	
	public WebElement getFindPeopleLink() {
		return findPeopleLink;
	}
	
	@FindBy(css = "*[aria-label='Activity Feed']")
	private WebElement activityLink;
	
	public WebElement getActivityLink() {
		return activityLink;
	}
	
	@FindBy(css = "img[crossorigin='anonymous']")
	private WebElement profileLink;
	
	public WebElement getProfileLink() {
		return profileLink;
	}
	
	@FindBy(tagName = "Log Out")
	private WebElement logoutButton;
	
	public WebElement getLogoutButton() {
		return logoutButton;
	}
	
	@FindBy(tagName = "Send Message")
	private WebElement sendMessage;
	
	public WebElement getSendMessage() {
		return sendMessage;
	}
	
	@FindBy(name = "queryBox")
	private WebElement toSearchTextField;
	
	public WebElement getToTextField() {
		return toSearchTextField;
	}
	
	 @FindBy(id="f1c69c64f59f68")
	 private WebElement userSelectLink;
	 
	 public WebElement getUserSelectLink() {
		 return userSelectLink;
	 }
	 
	 @FindBy(tagName = "Next")
	 private WebElement nextButton;
	 
	 public WebElement getNextButton() {
		 return nextButton;
	 }
	 
	 @FindBy(xpath = "//button[text()='Send']")
	 private WebElement sendButton;
	 
	 public WebElement getSendButton() {
		 return sendButton;
	 }
}
