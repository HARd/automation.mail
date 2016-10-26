package com.org.mail.myMailAuto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	/*
	 * ecotest2@i.ua EMAIL eleks2 password
	 * 
	 */

	// constructor
///////////////////////////////////	
	WebDriver driver;

	public LoginPage(WebDriver ldriver) {

		this.driver = ldriver;
	}
///////////////////////////////////
	
	// Login data
	@FindBy(how = How.NAME, using = "login")
	WebElement email;

	@FindBy(how = How.NAME, using = "pass")
	WebElement password;

	@FindBy(how = How.XPATH, using = "html/body/div[1]/div[2]/form/input[6]")
	WebElement submit;

	// verification data
	@FindBy(how = How.XPATH, using = "html/body/div[2]/div[3]/ul[1]/li[2]/a")
	WebElement myName;

	// Methods
	public void login(String mail, String pass) {

		email.sendKeys(mail);
		password.sendKeys(pass);
		submit.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

}
