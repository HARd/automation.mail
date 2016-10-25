package com.org.mail.myMailAuto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.org.mail.Util.LaunchBrowser;

public class BaseTest {
	
	@Test
	public void checkLogin(){
		
		WebDriver driver = LaunchBrowser.starBrowser();
		
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		
		login.login("ecotest2@i.ua", "eleks2");
		
		driver.close();
	}

	@Test
	public void checkMail(){
		
	}
}
