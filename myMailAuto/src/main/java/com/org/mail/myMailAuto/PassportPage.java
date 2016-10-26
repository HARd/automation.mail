package com.org.mail.myMailAuto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PassportPage {

	///////////////////////////////////
	WebDriver driver;

	public PassportPage(WebDriver ldriver) {

		this.driver = ldriver;
	}

	///////////////////////////////////
	// Poshta
	@FindBy(how = How.XPATH, using = ".//*[@id='newMail']/a")
	WebElement mailBoxTab;

	// menu button
	@FindBy(how = How.XPATH, using = ".//*[@id='header_overall']/div[1]/ul[3]/li[4]/span")
	WebElement menuButton;

	// Logout
	@FindBy(how = How.XPATH, using = ".//*[@id='accountSettingsPopup']/ul/li[7]/a")
	WebElement mailBoxLogout;

	public void logoutOfAccout() {
		menuButton.click();
		mailBoxLogout.click();
	}

	// Avatar tab
	@FindBy(how = How.XPATH, using = "html/body/div[1]/div[4]/ul/li[4]/a")
	WebElement avatar;

	// open that thing
	@FindBy(how = How.XPATH, using = "html/body/div[1]/div[5]/div[1]/div[3]/div[2]/div/div/div[1]/dl/dd/ul/li/span")
	WebElement avatarCollapse;

	// Browse buttom
	@FindBy(how = How.XPATH, using = ".//*[@id='inpFromFileformFile']")
	WebElement browseButton;

	// Upload button
	@FindBy(how = How.XPATH, using = ".//*[@id='cnrinpFromFileformFile']/input[3]")
	WebElement upload;

	// Upload button
	@FindBy(how = How.XPATH, using = "html/body/div[1]/div[5]/div[1]/div[3]/div[2]/div/div/div[1]/dl/dd/ul/li[2]/a")
	WebElement deletePhoto;

	public void uploadPicture() {
		avatarCollapse.click();
		browseButton.sendKeys("C:\\Dv6n0x2FjNc.jpg");
		upload.click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		deletePhoto.click();
		driver.switchTo().alert().accept();

	}

	// Create mail
	@FindBy(how = How.XPATH, using = "html/body/div[1]/div[5]/div[1]/div[1]/p/a")
	WebElement createMail;

}
