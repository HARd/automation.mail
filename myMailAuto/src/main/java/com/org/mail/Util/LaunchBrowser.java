package com.org.mail.Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser{
	
	static WebDriver driver = new FirefoxDriver();
	static String url = "https://passport.i.ua/login/";
	
	public static WebDriver starBrowser(){
		driver.manage().window().maximize();
		driver.get(url);
		
		return driver;
		
	}

}
