package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class CheckOutProcessFirst extends BaseClass{
	@FindBy(xpath = "//button[@id='checkout']") 
	WebElement checkOutbuttonProcess;

	
public CheckOutProcessFirst() {
	PageFactory.initElements(driver,this);

}

public String getcurrUrl()
{
	String currentUrl=driver.getCurrentUrl();
	return currentUrl;
	
}
public void checkOutprocessbtnclick()
{
	
	Action.click(driver, checkOutbuttonProcess);
	//return new CheckOutstepone;
}
}
