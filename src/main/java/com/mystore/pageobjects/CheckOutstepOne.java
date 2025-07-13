package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class CheckOutstepOne extends BaseClass{
	@FindBy(xpath = "//input[@id='first-name']") 
	WebElement firstName;
	
	@FindBy(xpath = "//input[@id='last-name']") 
	WebElement lastName;

	@FindBy(xpath = "//input[@id='postal-code']") 
	WebElement postalCode;
	
	@FindBy(xpath = "//input[@id='continue']") 
	WebElement continueBtn;

	
	public CheckOutstepOne() {
		PageFactory.initElements(driver,this);

	}
public CheckOutstepTwo addCheckOutInfo()
{
	firstName.sendKeys("Vidya");
	lastName.sendKeys("shenmare");
	postalCode.sendKeys("411036");
	Action.click(driver,continueBtn);
	return new CheckOutstepTwo();
	
}



}
