package com.org.mail.myMailAuto;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.org.mail.Util.LaunchBrowser;

public class ExecutingTest extends BaseTest {

	@BeforeMethod
	public void openBrowser() {
		LaunchBrowser.starBrowser();
		loginPage.login("ecotest2@i.ua", "eleks2");
		System.out.println("<----Open browser and login---->");
	}

	
	@Test (description="Upload the profile picture")
	public void testA() {
		mainPage.myName.click();
		passportPage.avatar.click();
		passportPage.uploadPicture();
		passportPage.logoutOfAccout();
		
		System.out.println("----Uploaded a picture----");
		
	}

	@Test (description="Send a email")
	public void testB(){
		mainPage.mailBoxButton.click();
		mailBox.sendMessage();
		Assert.assertTrue(mailBox.messageSent(), "Everything worked");
		passportPage.logoutOfAccout();
		System.out.println("----Sent a email----");
	}
	
	@Test
	public void testC(){
		mainPage.mailBoxButton.click();
		mailBox.deleteMail();
		passportPage.logoutOfAccout();
	}
	
	@Test
	public void testD(){
		mainPage.exit.click();
	}
	
	
	
	@AfterClass
	public void quit() {
		driver.quit();
		System.out.println("<<<-Close browsers->>>");
	}

}
