package com.qalegend.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qalegend.utilities.TestHelper;

public class SignOutPage extends TestHelper {
	public static WebDriver driver;
	public SignOutPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	
	private final String _signOutButton="//a[text()='Sign Out']";
	@FindBy(xpath=_signOutButton)
	private WebElement signOutButton;
	

public void waitElement()
{
	wait.setExplicitWait(driver, signOutButton);
}
public void signOutButtonClick()
{
page.clickOnElement(signOutButton);
}
}
