package com.qalegend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qalegend.utilities.TestHelper;

public class LoginPage extends TestHelper {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private final String _userNameField = "username";
	@FindBy(id = _userNameField)
	private WebElement userNameField;
	private final String _passwordField = "password";
	@FindBy(id = _passwordField)
	private WebElement passwordField;
	private final String _loginButton = "//button[@type='submit']";
	@FindBy(xpath = _loginButton)
	private WebElement loginButton;
	private final String _rememberMeCheckBox = "//input[@type='checkbox']";
	@FindBy(xpath = _rememberMeCheckBox)
	private WebElement rememberMeCheckBox;
	private final String _applicationTourPopUp = "//button[text()='End tour']";
	@FindBy(xpath = _applicationTourPopUp)
	private WebElement applicationTourPopUp;

	public String getLoginPageTitle() {
		String title = page.getPageTitle(driver);
		return title;
	}

	public void loginCrendentials() {

		page.enterText(userNameField, "admin");
		page.enterText(passwordField, "123456");
		page.clickOnElement(loginButton);
		page.clickOnElement(applicationTourPopUp);
	}

	public void enterUserName(String userName) {

		page.enterText(userNameField, userName);
	}

	public void enterPassword(String password) {
		page.enterText(passwordField, password);
	}

	public void loginButtonClick() {
		page.clickOnElement(loginButton);
	}

	public void rememberMeCheckBoxClick() {
		page.clickOnElement(rememberMeCheckBox);
	}

	public void PopUpApplicationTour() {
		page.clickOnElement(applicationTourPopUp);
	}

	public boolean checkBoxSelected() {
		boolean status = page.checkBoxFunctionIsSelected(rememberMeCheckBox);
		return status;
	}

}