package com.org.mail.myMailAuto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.org.mail.Util.LaunchBrowser;

abstract class BaseTest {

	WebDriver driver = LaunchBrowser.starBrowser();
	LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
	PassportPage passportPage = PageFactory.initElements(driver, PassportPage.class);
	MailBox mailBox = PageFactory.initElements(driver, MailBox.class);
}
