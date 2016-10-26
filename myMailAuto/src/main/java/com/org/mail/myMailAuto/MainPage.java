package com.org.mail.myMailAuto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {

	///////////////////////////////////
	WebDriver driver;

	public MainPage(WebDriver ldriver) {
		this.driver = ldriver;
	}
	///////////////////////////////////

	// Logged under my name and enter mail box
	@FindBy(how = How.XPATH, using = "html/body/div[2]/div[3]/ul[1]/li[2]/a")
	WebElement myName;

	// Login as another user button
	@FindBy(how = How.XPATH, using = "html/body/div[2]/div[3]/ul[1]/li[7]/a/img")
	WebElement otherLog;
	
	// Exit
	@FindBy(how = How.XPATH, using = "html/body/div[2]/div[3]/ul[1]/li[8]/a")
	WebElement exit;

	@FindBy(how = How.LINK_TEXT, using = "Почта")
	WebElement mailBoxButton;

	// Check is logged in correctly
	
}
