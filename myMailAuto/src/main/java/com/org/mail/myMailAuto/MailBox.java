package com.org.mail.myMailAuto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MailBox {
	///////////////////////////////////
	WebDriver driver;

	public MailBox(WebDriver ldriver) {

		this.driver = ldriver;
	}
	//////////////////////////////////

	// Email is ecotest2@rambler.ru

	/// Create mail locators
	@FindBy(how = How.XPATH, using = "html/body/div[1]/div[5]/div[1]/div[1]/p/a")
	WebElement createMail;

	@FindBy(how = How.ID, using = "to")
	WebElement sendTo;

	@FindBy(how = How.XPATH, using = "html/body/div[4]/div[5]/div[1]/div[1]/div[1]/div/form/div[5]/div[2]/span/input[1]")
	WebElement subject;
	
	//@FindBy(how = How.NAME, using = "subject_utf")
	//WebElement sugsubject;

	@FindBy(how = How.ID, using = "text")
	WebElement textArea;

	@FindBy(how = How.NAME, using = "send")
	WebElement sendButton;

	@FindBy(how = How.XPATH, using = "html/body/div[1]/div[5]/div[2]/div/div/div[1]/div/div[5]")
	WebElement confirmText;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='sugg_man_td_right_0']")
	WebElement selectedMail;
	///

	//// Mail credentials
	String emailName = "ecotest2@rambler.ru";
	String emailTopic = "Bonjur";
	String emailTest = "This is a test subject";
	

	///
	
	public void sendMessage(){
		createMail.click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		sendTo.sendKeys(emailName);
		selectedMail.click();
		subject.sendKeys(emailTopic);
		textArea.sendKeys(emailTest);
		confirmText.click();
	}
	
	
	
	public boolean messageSent() {
		if (confirmText.getText().equalsIgnoreCase("Письмо успешно отправлено адресатам"))
			;
		{
			return true;
		}

	}

}
