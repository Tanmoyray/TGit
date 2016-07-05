package com.Testutube.TTest.com.Testutube.TTest.TGIT;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPageObjets {
	
	@Test(priority = 1)
	public LoginPageObjets(AppiumDriver driver) {
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
	
//Login
		@AndroidFindBy(id = "LoginUserName")
		public WebElement LoginUserName;
		
	//Not working xpath
		//@AndroidFindBy(xpath = ("//android.widget.EditText[@text='Username']"))
		//public WebElement LoginUserName;
		
		
		@AndroidFindBy(id = "LoginPassword")
		public WebElement LoginPassword;
		@AndroidFindBy(id = "btn_Login")
		public WebElement btn_Login;
				
		@AndroidFindBy(id = "tv_changePasssword")
		public WebElement LostPassword;
		
//HomePage
		@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]")
		public WebElement Homepage;
		
		
//Create an Account
		@AndroidFindBy(id = "tv_creatAccount")
		public WebElement CreateAccount;		
				
		@AndroidFindBy(id = "txt_name")
		public WebElement txt_name;
		@AndroidFindBy(id = "txt_password")
		public WebElement txt_password;
		@AndroidFindBy(id = "txt_mail")
		public WebElement txt_mail;
		@AndroidFindBy(id = "txt_carNo")
		public WebElement txt_carNo;
		@AndroidFindBy(id = "txt_phone")
		public WebElement txt_phoneNo;
		@AndroidFindBy(xpath ="android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.CheckBox[1]")
		public WebElement Accept_checkbox;
		@AndroidFindBy(id = "txt_register")
		public WebElement txt_register;
		//Login with Facebook
		@AndroidFindBy(id = "facebook")
		public WebElement facebook;
		//Login with google
		@AndroidFindBy(id = "google")
		public WebElement google;
				
// Lost Password
		@AndroidFindBy(id = "tv_changePasssword")
		public WebElement tv_changePasssword;
		@AndroidFindBy(id = "et_mobile_no")
		public WebElement et_mobile_no;
		@AndroidFindBy(id = "btn_next")
		public WebElement btn_next;
				
}
