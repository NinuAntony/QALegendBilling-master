package com.qalegend.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qalegend.base.BaseSetUp;
import com.qalegend.pages.LoginPage;
import com.qalegend.pages.ProfilePage;
import com.qalegend.pages.SignOutPage;

public class SignOutTest extends BaseSetUp {
	SignOutPage signout;
	LoginPage login;
	ProfilePage profile;

	@Test(priority = 1, description = "TC007_Sign Out", groups = { "Regression" })
	public void TC007_signOutClick() throws InterruptedException {
		login = new LoginPage(driver);
		login.loginCrendentials();

		profile = new ProfilePage(driver);
		profile.ProfileDropDown();

		signout = new SignOutPage(driver);

		signout.waitElement();
		String actual = driver.getCurrentUrl();

		signout.signOutButtonClick();
		String expected = "https://qalegend.com/billing/public/login";
		Assert.assertNotEquals(actual, expected);

	}
}
