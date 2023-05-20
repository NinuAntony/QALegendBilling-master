package com.qalegend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qalegend.utilities.TestHelper;

public class ContactPage extends TestHelper {
	public WebDriver driver;
	public ContactPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	private final String _contactsTreeView="//span[text()='Contacts']";
	@FindBy(xpath=_contactsTreeView)
	private WebElement contactsTreeView;
	
}

