package com.mystore.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class IndexPage extends BaseClass {
	
	@FindBy(xpath = "//input[@id='user-name']") 
	WebElement userName;
//	WebElement userName =driver.findElement(By.id("user-name"));
	@FindBy(xpath = "//input[@id='password']") 
	WebElement password;
	
	@FindBy(xpath = "//input[@id='login-button']") 
	WebElement loginBtn;
	
	public IndexPage() {
		PageFactory.initElements(driver,this);
	
	}
	
	
	
	public HomePage clickOnLogin()
	{
		userName.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		Action.click(driver,loginBtn);
		//String url=driver.getCurrentUrl();
		//return url;
		return new HomePage();
	}
	public String getMyStoreTitle() {
		String title=driver.getTitle();
		return title;
	}

}

