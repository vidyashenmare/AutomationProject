/**
 * 
 */
package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.CheckOutProcessFirst;
import com.mystore.pageobjects.CheckOutstepOne;
import com.mystore.pageobjects.CheckOutstepTwo;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;

/**
 * @author Vidya shenmare
 *
 */
public class CheckOutstepTwoTest extends BaseClass{
IndexPage indexPage;
HomePage homePage;
CheckOutProcessFirst checkoutprocessfirst;
CheckOutstepOne checkoutstepone;
CheckOutstepTwo checkoutsteptwo;
private static boolean initialised = false;
//@BeforeMethod(groups = {"Smoke"})
@BeforeMethod
public void setup() {
	
	
	if(!initialised)
	{
		launchApp();
		 initialised = true;
	}
	homePage= new HomePage();
	checkoutprocessfirst=new CheckOutProcessFirst();
	checkoutstepone=new CheckOutstepOne();
	checkoutsteptwo =new CheckOutstepTwo();
}
public void tearDown() {
	getDriver().quit();
}

@Test(groups = "Smoke")

public void finishChkOutStep()
{
	indexPage=new IndexPage();
	homePage=indexPage.clickOnLogin();
	
	
	homePage.clickOnaddTocart();
	
	checkoutprocessfirst=homePage.clickonChkOutcart();
	checkoutprocessfirst.checkOutprocessbtnclick();
	checkoutsteptwo=checkoutstepone.addCheckOutInfo();
	//checkoutsteptwo.chkOutFinishBtnClick();
	
	
	//checkoutprocessfirst.checkOutprocessbtnclick();
	String actURL=checkoutsteptwo.getcurrUrl();
	 String expectedURL = "https://www.saucedemo.com/checkout-step-two.html";
	Assert.assertEquals(actURL,expectedURL,"URL not match");
	
}
@Test
public void finishcheckoutsteplast()
{
	checkoutsteptwo.chkOutFinishBtnClick();
}



}

