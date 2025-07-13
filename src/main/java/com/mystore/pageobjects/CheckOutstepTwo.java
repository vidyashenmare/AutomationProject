package com.mystore.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class CheckOutstepTwo extends BaseClass{
	@FindBy(xpath = "//button[@id='finish']") 
	WebElement chkOutFinishBtn;

	
public CheckOutstepTwo() {
	PageFactory.initElements(driver,this);

}

public String getcurrUrl()
{
	String currentUrl=driver.getCurrentUrl();
	return currentUrl;
	
}
public void chkOutFinishBtnClick()
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,120)", chkOutFinishBtn);
	Action.click(driver, chkOutFinishBtn);
	//return new CheckOutstepone;
}
}
