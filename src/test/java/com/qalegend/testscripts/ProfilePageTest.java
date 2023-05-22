package com.qalegend.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qalegend.base.BaseSetUp;
import com.qalegend.pages.LoginPage;
import com.qalegend.pages.ProfilePage;
import com.qalegend.pages.SignOutPage;

public class ProfilePageTest extends BaseSetUp {
	LoginPage login;
	ProfilePage profile;

	@Test(priority = 1, description = "TC008_verify Profile Title ", groups = { "Regression" })
	public void TC008_verifyprofileTitle() {
		login = new LoginPage(driver);
		login.loginCrendentials();

		profile = new ProfilePage(driver);
		profile.ProfileDropDown();
		profile.profileButton();
		String actual = "My Profile - QAlegend";

		String expected = driver.getCurrentUrl();
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 2, description = "TC009_Profile Password Update", groups = { "Regression" })
	public void TC009_profilePasswordUpdate() {
		login = new LoginPage(driver);
		login.loginCrendentials();

		profile = new ProfilePage(driver);
		profile.ProfileDropDown();
		profile.profileButton();
		profile.CurrentPasword();
		profile.NewPasword();

		profile.ConfirmPasword();
		profile.update1();
		String actual = "password updated successfully";
		String expected = profile.updateMessage1();
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 3, description = "TC009_Invalid current Password", groups = { "Regression" })
	public void TC009_invalidcurrentPassword() 
	{
		login = new LoginPage(driver);
		login.loginCrendentials();

		profile = new ProfilePage(driver);
		profile.ProfileDropDown();
		profile.profileButton();
		profile.CurrentPasword();
		profile.NewPasword();

		profile.ConfirmPasword();
		profile.update1();
		String actual= "you have entered wrong password";
		String expected= profile.wrongPasswordMessage();
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 4, description = "TC009_ Mismatch new and Confirm Password", groups = { "Regression" })
	public void TC009_mismatchPasswords() 
	{
		login = new LoginPage(driver);
		login.loginCrendentials();

		profile = new ProfilePage(driver);
		profile.ProfileDropDown();
		profile.profileButton();
		profile.CurrentPasword();
		profile.NewPasword();

		profile.WrongConfirmPasword();
		profile.update1();
		String actual= "Please enter the same value again.";
		String expected= profile.passwordMismatchMessage();
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 5, description = "TC010 ProfileUpdate", groups = { "Regression" })
	public void TC010_profileUpdate() {
		profile.prefix();
		profile.wait1();
		profile.firstName();
		profile.wait2();
		profile.lastName();
		profile.wait3();
		profile.eMail();
		profile.waitElement();
		profile.selectLanguageContainer();
		/*
		 * profile.languageContainerAlbanian();
		 * 
		 * profile.languageContainerEnglish(); profile.languageContainerFrench();
		 * profile.languageContainerHindi(); profile.languageContainerSpanish();
		 */

	}
}
