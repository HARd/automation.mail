package com.org.mail.myMailAuto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MailBox {

	// constructor
	WebDriver driver;

	public MailBox(WebDriver ldriver) {

		this.driver = ldriver;
	}

	@FindBy(how = How.XPATH, using = "html/body/div[1]/div[5]/div/div[1]/div[2]/ul[1]/li[1]/h4/a")
	WebElement mailBoxTab;

}
