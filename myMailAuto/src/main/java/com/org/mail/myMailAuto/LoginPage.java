package com.org.mail.myMailAuto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	/*
	  	ecotest2@i.ua EMAIL
		eleks2 password
	
	*/
	
	//URL
	private String url = "https://passport.i.ua/login/";
	
	public String getUrl(){
		return url;
	}
	
	//constructor
	WebDriver driver;
	public LoginPage(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	//Locators
	@FindBy(how=How.NAME, using="login")
		WebElement email;
	@FindBy(how=How.NAME, using="pass")
		WebElement password;
	@FindBy(how=How.XPATH, using="html/body/div[1]/div[2]/form/input[6]") 
		WebElement submit; 
	
	public void login(String mail, String pass){
		
		email.sendKeys(mail);
		password.sendKeys(pass);
		submit.click();
	}

}
