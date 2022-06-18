package com.inetbanking.testCases;


import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddnewAccount;
import com.inetbanking.pageObjects.LoginPage;

public class TC_addNewAccount extends BaseClass {
	@Test
	public void addnewAccount() throws InterruptedException, IOException {
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		AddnewAccount ad = new AddnewAccount(driver);
		ad.getClickNewAccount().click();
		logger.info("Clicked On New Account");
		ad.EnterCustId().sendKeys("39212");
		logger.info("Enter Cust Id");
		Select selAcctype = new Select(ad.SelectnewAccType());
		List <WebElement> options =  selAcctype.getOptions();
		for(WebElement o : options ) {
			if(o.getText().equalsIgnoreCase("Savings")) {
				o.click();
				break;
			}
		}
		logger.info("Account Type Selected");
		ad.EnterIntialDeposit().sendKeys("10000");
		logger.info("Intial Deposit");
		ad.ClickSubmit().click();
//		String strAccountVerified = ad.VerifyAccountCreated().getText();
		boolean res=driver.getPageSource().contains("Account Generated Successfully!!!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("test case passed....");
			
		}
		else
		{
			logger.info("test case failed....");
			captureScreen(driver,"addNewAccount");
			Assert.assertTrue(false);
		}
		
	}
	
	

}
