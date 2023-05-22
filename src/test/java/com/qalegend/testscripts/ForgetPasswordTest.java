package com.qalegend.testscripts;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qalegend.base.BaseSetUp;
import com.qalegend.constants.Constants;
import com.qalegend.pages.ForgetPasswordPage;

import com.qalegend.utilities.ExcelUtility;

public class ForgetPasswordTest extends BaseSetUp {
	ForgetPasswordPage forgetpassword;

	@Test(priority = 1, description = "TC005_Verify password reset page title", groups = { "Smoke" }, enabled = false)
	public void TC005_verifypasswordresetPageTitle() {
		forgetpassword = new ForgetPasswordPage(driver);
		forgetpassword.forgotYourPasswordButtonClick();
		String actualforgetpasswordPageTitle = forgetpassword.getForgetPasswordPageTitle();

		String expectedforgetpasswordPageTitle = "Reset Password - Demo POS";

		Assert.assertEquals(actualforgetpasswordPageTitle, expectedforgetpasswordPageTitle);

	}

	@Test(dataProvider = "EmailAddress", priority = 2, description = "TC006 _Forget password email send", groups = {
			"Smoke" })

	public void TC006_EmailSend(String mail, String pass) {
		forgetpassword = new ForgetPasswordPage(driver);

		forgetpassword.forgotYourPasswordButtonClick();

		forgetpassword.emailAddressFormControl(mail);

		forgetpassword.passwordAddressFormControl(pass);
		forgetpassword.sendButton();
	}

	@DataProvider(name = "EmailAddress")
	public Object[][] EmailAddress() throws InvalidFormatException, IOException {
		Object[][] data = ExcelUtility.getDataFromExcel(System.getProperty("user.dir") + Constants.EXCEL_PATH, "email");
		return data;
	}

}
