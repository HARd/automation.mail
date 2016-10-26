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
	
	@FindBy(how = How.XPATH, using = "html/body/div[1]/div[5]/div[2]/div[1]/div[2]/div[3]/ul/li[2]/a")
	WebElement sentMessages;
	///

	/// Mail credentials
	String emailName = "ecotest2@rambler.ru";
	String emailTopic = "Bonjur";
	String emailTest = "This is a test subject";
	

	///Send message method and check if it was successful
	
	public void sendMessage(){
		createMail.click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		sendTo.sendKeys(emailName);
		selectedMail.click();
		subject.sendKeys(emailTopic);
		textArea.sendKeys(emailTest);
		sendButton.click();
	}
	
		
	public boolean messageSent() {
		if (confirmText.getText().equalsIgnoreCase("Письмо успешно отправлено адресатам"))
			;
		{
			return true;
		}

	}
	
	///
	
	///Delete the sent messages
	
	@FindBy(how = How.XPATH, using = "html/body/div[1]/div[4]/ul/li[2]/a")
	WebElement mailTab;//Mail tab after the message was sent
	
	@FindBy(how = How.XPATH, using = ".//*[@id='mesgList']/div/span[1]/span[1]/i")
	WebElement selectCheckbox;
		
	@FindBy(how = How.XPATH, using = ".//*[@id='m_select']/div/ul/li[2]/span")
	WebElement checkAll;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='mesgList']/div/span[1]/span[1]/input")
	WebElement checkbox;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='fieldset1']/fieldset[3]/span")
	WebElement deleteButton;
	
	public void deleteMail (){
		sentMessages.click();
		checkbox.click();
		if(checkbox.isSelected()){
			deleteButton.click();
			driver.switchTo().alert().accept();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		} else {
			System.out.println("---You have no mail---");
		}
	}

}
