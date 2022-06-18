package com.inetbanking.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddnewAccount {
	public WebDriver driver;
	
	private By clickNewAccount = By.xpath("//a[text()= \"New Account\"]");
	private By entercustId=By.name("cusid");
	private By accType=By.name("selaccount");
	private By intialDeposit=By.name("inideposit");
	private By submit = By.name("button2");
	private By VerifyAccountCreated = By.xpath("//*[@class ='heading3']");

	
	
	
	
	
	public AddnewAccount(WebDriver driver) {
		// TODO Auto-generated constructor stub		
		this.driver=driver;	
	}
	public WebElement getClickNewAccount() {
		return driver.findElement(clickNewAccount);
	}

	public WebElement SelectnewAccType() {
		return driver.findElement(accType);
	}

	public WebElement EnterIntialDeposit() {
		return driver.findElement(intialDeposit);
	}


	public WebElement ClickSubmit() {
		return driver.findElement(submit);
	}
	public WebElement EnterCustId() {
		return driver.findElement(entercustId);
	}
	
	public WebElement VerifyAccountCreated() {
		return driver.findElement(entercustId);
	}
}
