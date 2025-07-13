/**
 * 
 */
package com.mystore.testcases;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.mystore.base.BaseClass;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;

/**
 * @author SUVED
 *
 */
public class IndexPageTest extends BaseClass{
	private IndexPage indexPage;
	HomePage homePage;
	private static boolean initialised = false;
	@BeforeMethod(groups = {"Smoke"})
	public void setup() {
		
		
		if(!initialised)
		{
			launchApp();
			 initialised = true;
		}
		indexPage= new IndexPage();
		homePage=new HomePage();
		
	}
	
	public void tearDown() {
		getDriver().quit();
	}
	@Test(groups = "Smoke")
	public void verifyTitle()
	{
		
		
		String actTitle=indexPage.getMyStoreTitle();
        String expectedTitle = "Swag Labs";
        //String actualTitle = driver.getTitle();
        Assert.assertEquals(actTitle, expectedTitle, "Page title does not match!");
	}
	@Test(groups = "Smoke")
	
	public void login()
	{
		//after login going to homepage so function return the homepage class object
		homePage=indexPage.clickOnLogin();
		String actURL=homePage.getcurrUrl();
		String expectedURL = "https://www.saucedemo.com/inventory.html";
		Assert.assertEquals(actURL,expectedURL,"Login URL not match");
		
	}


}
