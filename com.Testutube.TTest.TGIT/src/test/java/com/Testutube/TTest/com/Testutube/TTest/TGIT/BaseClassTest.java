package com.Testutube.TTest.com.Testutube.TTest.TGIT;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClassTest {
	
	//WebDriver wd;
	AndroidDriver driver;
	@BeforeTest 
	public void setUp() throws MalformedURLException{ 
	    
		DesiredCapabilities capabilities = new DesiredCapabilities();
		//capabilities.setCapability("appium-version", "1.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.3");
		capabilities.setCapability("deviceName", "HTC4.3");
		capabilities.setCapability("app", "/Users/tanmoyray/Documents/AndroidApk/Parking/veiculu.apk");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	  
	}
		
	@Test(priority = 2)	
	public void Login() throws InterruptedException {
			LoginPageObjets login = new LoginPageObjets(driver);
			login.LoginUserName.sendKeys("9836067653");
			login.LoginPassword.sendKeys("tanmoy");
			login.btn_Login.click();
			
			driver.manage().timeouts().implicitlyWait(9000, TimeUnit.SECONDS);
			
			} 
	
	
	 	
	

	@AfterTest 
	public void teardown(){ 
	    
	    driver.quit(); 
	} 

}
