/**
 * 
 */
package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

/**
 * @author SUVED
 *
 */
public class HomePage extends BaseClass{
	
	@FindBy(xpath = "//button[@name='add-to-cart-sauce-labs-backpack']") 
	WebElement Addtocartbtn;
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement ChkoutCartBtn;


public HomePage() {
	PageFactory.initElements(driver,this);

}
public String getcurrUrl()
{
	String currentUrl=driver.getCurrentUrl();
	return currentUrl;
	
}
public void clickOnaddTocart()
{
	Action.click(driver,Addtocartbtn);
}
public CheckOutProcessFirst clickonChkOutcart()
{
	Action.click(driver,ChkoutCartBtn);
	return new CheckOutProcessFirst();
	
}

}