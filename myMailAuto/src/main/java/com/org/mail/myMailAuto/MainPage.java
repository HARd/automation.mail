package com.org.mail.myMailAuto;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {
	
	@FindBy(how=How.XPATH, using="html/body/div[2]/div[3]/ul[1]/li[2]/a") WebElement myName;

}
