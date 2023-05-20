package com.qalegend.testscripts;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qalegend.RetryAnalyzer1.Retry;
import com.qalegend.base.BaseSetUp;
import com.qalegend.constants.Constants;
import com.qalegend.pages.LoginPage;

import com.qalegend.utilities.ExcelUtility;

public class LoginTest extends BaseSetUp{
  LoginPage login;
  

  
 @Test (dataProvider= "UserCredentials", priority=2, description="TC002_Verify valid login",groups= {"Regression"},retryAnalyzer=Retry.class)
public void TC002_verifyLogin(String usname,String pwd) 
{
	  login=new LoginPage(driver);
	  System.out.println("username is"+usname);
	  System.out.println("password is"+pwd);
	  //login.enterUserName("admin");
	  //login.enterPassword("123456");
	  login.enterUserName(usname);
	  login.enterPassword(pwd);
	  login.loginButtonClick();
	  String currenturl=driver.getCurrentUrl();
	  System.out.println(currenturl);
	  String expectedurl="https://qalegend.com/billing/public/home";
	  Assert.assertEquals(currenturl, expectedurl);
}
 @DataProvider(name="UserCredentials")
 public Object[][]  UserCredentials() throws InvalidFormatException, IOException
 {
 Object[][] data=ExcelUtility.getDataFromExcel(System.getProperty("user.dir")+ Constants.EXCEL_PATH, "LoginData");
 return data;
 }
  
  
 @Test(priority=1,description="TC001_Verify login page title",groups= {"Smoke"},retryAnalyzer=Retry.class)
  public void TC001_verifyLoginTitle()
  {
	 Assert.assertTrue(false);
  login=new LoginPage(driver);
  String actualHomePageTitle=login.getLoginPageTitle();
  
  String expectedHomePageTitle="Login - Demo POS";
  
  Assert.assertEquals(actualHomePageTitle, expectedHomePageTitle);
  System.out.println(actualHomePageTitle);
  }
 
 @Test(priority=3,description="TC003_Verify invalid login",groups= {"Regression"},retryAnalyzer=Retry.class) 
 public void TC003_verifyInvalidLogin()
 {
 	  login=new LoginPage(driver);
 	  login.enterUserName("admi");
 	  login.enterPassword("12345");
 	  login.loginButtonClick();
 	  String currenturl=driver.getCurrentUrl();
 	  String expectedurl="https://qalegend.com/billing/public/home"; 
 	 System.out.println("These credentials do not match our records.");
 	  Assert.assertNotEquals(currenturl, expectedurl);
 	 
 }
 	  
 
 
 @Test(priority=4,description="TC004_Verify click on remember me checkbox", groups= {"Regression"},retryAnalyzer=Retry.class)
 public void TC004_rememberMeCheckBox()
 {
	 login=new LoginPage(driver);
	 login.rememberMeCheckBoxClick();
	 Boolean status=login.checkBoxSelected();
	Assert.assertTrue(status);
 }
}

