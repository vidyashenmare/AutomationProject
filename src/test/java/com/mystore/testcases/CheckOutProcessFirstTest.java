/**
 * 
 */
package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.CheckOutProcessFirst;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;

/**
 * @author Vidya shenmare
 *
 */
public class CheckOutProcessFirstTest extends BaseClass{
IndexPage indexPage;
HomePage homePage;
CheckOutProcessFirst checkoutprocessfirst;
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
	
}
public void tearDown() {
	getDriver().quit();
}

@Test(groups = "Smoke")

public void checkoutprocess()
{
	indexPage=new IndexPage();
	homePage=indexPage.clickOnLogin();
	
	
	homePage.clickOnaddTocart();
	
	checkoutprocessfirst=homePage.clickonChkOutcart();
	
	//checkoutprocessfirst.checkOutprocessbtnclick();
	// String expectedURL = "https://www.saucedemo.com/inventory.html";
	//Assert.assertEquals(actURL,expectedURL,"Login URL not match");
	
}
@Test
public void checkoutprocessStart()
{
	checkoutprocessfirst.checkOutprocessbtnclick();
}



}

