package com.mystore.base;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.mystore.actiondriver.Action;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static Properties prop;
    public static WebDriver driver;
	
	
	
	public BaseClass() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\SUVED\\selenium-workspace\\MyStoreProject\\configuration\\config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void launchApp() {
		//String browserName="FireFox";
		
		String browserName = prop.getProperty("browser");
				
		if (browserName.contains("Chrome")) {
			WebDriverManager.chromedriver().setup();
			//WebDriverManager.chromedriver().avoidBrowserDetection().setup();
			//WebDriverManager.chromedriver().browserVersion("136.0.7103.93").setup(); 
		//	WebDriver driver = new ChromeDriver();
			driver=new ChromeDriver();
			
			
		} else if (browserName.contains("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("IE")) {
			WebDriverManager.iedriver().setup();
			//WebDriverManager.firefoxdriver().avoidBrowserDetection().setup();
			driver=new InternetExplorerDriver();
		}
		 Action.implicitWait(driver,10);
		 Action.pageLoadTimeOut(driver,30);
		 driver.get(prop.getProperty("url"));
		// System.out.print(driver);
		
			}
	public WebDriver getDriver() {
		// Get Driver from threadLocalmap
		return driver;
	}
	
}