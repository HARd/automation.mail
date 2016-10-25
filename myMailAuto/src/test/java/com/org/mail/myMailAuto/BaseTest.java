package com.org.mail.myMailAuto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.org.mail.Util.LaunchBrowser;

public class BaseTest {
	
	@Test
	public void CheckLogin(){
		
		WebDriver driver = LaunchBrowser.starBrowser();
		
		PageFactory.initElements(driver, LoginPage.class);
		
	}

}
