package com.org.mail.myMailAuto;


import org.testng.annotations.Test;

import com.org.mail.Util.LaunchBrowser;

public class ExecutingTest extends BaseTest {
	
	@Test
	public void checkLogin(){
		LaunchBrowser.starBrowser();
		loginPage.login("ecotest2@i.ua", "eleks2");
		driver.close();
	}

}
