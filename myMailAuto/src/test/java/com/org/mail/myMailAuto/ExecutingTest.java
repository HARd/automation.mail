package com.org.mail.myMailAuto;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.org.mail.Util.LaunchBrowser;

public class ExecutingTest extends BaseTest {

	@BeforeMethod
	public void openBrowser() {
		LaunchBrowser.starBrowser();
		loginPage.login("ecotest2@i.ua", "eleks2");
		System.out.println("Login");
	}

	@Test
	public void testA() {
		mainPage.myName.click();
		mailBox.mailBoxTab.click();
		System.out.println("Open mails");

	}

	@Test
	public void testB() {
		mainPage.myName.click();
		driver.navigate().back();
	}

	@AfterClass
	public void quit() {
		driver.quit();
		System.out.println("Close browsers");
	}

}
