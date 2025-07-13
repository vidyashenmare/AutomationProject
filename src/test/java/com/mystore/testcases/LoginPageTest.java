/**
 * 
 */
package com.mystore.testcases;

import org.testng.annotations.BeforeMethod;

import com.mystore.base.BaseClass;

/**
 * @author Vidya shenmare
 *
 */
public class LoginPageTest extends BaseClass{
	@BeforeMethod
	public void setup() {
		launchApp();
		
	}

}
