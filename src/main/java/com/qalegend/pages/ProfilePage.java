package com.qalegend.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import com.qalegend.utilities.TestHelper;

public class ProfilePage extends TestHelper {
	public WebDriver driver;
	public ProfilePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	private final String _profileNameButton="//span[text()='efg pqr']";
	@FindBy(xpath=_profileNameButton)
	private WebElement profileNameButton;
	private final String _profileButton="//a[text()='Profile']";
	@FindBy(xpath=_profileButton)
	private WebElement profileButton;
	private final String _currentPassword="//input[@placeholder='Current password']";
	@FindBy(xpath=_currentPassword)
	private WebElement currentPassword;
	private final String _newPassword="//input[@placeholder='New password']";
	@FindBy(xpath=_newPassword)
	private WebElement newPassword;
	private final String _confirmPassword="//input[@placeholder='Confirm new password']";
	@FindBy(xpath=_confirmPassword)
	private WebElement confirmPassword;
	
	private final String _update1="(//button[@type='submit'])[1]";
	@FindBy(xpath=_update1)
	private WebElement update1;
	
	
	
	
	
	private final String _prefix="//input[@id='surname']";
	@FindBy(xpath=_prefix)
	private WebElement prefix;
	private final String _firstName="//input[@id='first_name']";
	@FindBy(xpath=_firstName)
	private WebElement firstName;
	private final String _lastName="//input[@id='last_name']";
	@FindBy(xpath=_lastName)
	private WebElement lastName;
	private final String _eMail="//input[@id='email']";
	@FindBy(xpath=_eMail)
	private WebElement eMail;
	private final String _languageContainer="//span[@id='select2-language-container']";
	@FindBy(xpath=_languageContainer)
	private WebElement languageContainer;
	private final String _english="//span[text()='English']";
	@FindBy(xpath=_english)
	private WebElement english;
	private final String _dutch="//span[text()='Dutch']";
	@FindBy(xpath=_dutch)
	private WebElement dutch;
	private final String _spanish="//span[text()='Spanish - Español']]";
	@FindBy(xpath=_spanish)
	private WebElement spanish;
	private final String _hindi="//span[@class='select2-selection__rendered']";
	@FindBy(xpath=_hindi)
	private WebElement hindi;
	private final String _french="//span[text()='French - Français']";
	@FindBy(xpath=_french)
	private WebElement french;
	private final String _albanian="//span[text()='Albanian - Shqip']";
	@FindBy(xpath=_albanian)
	private WebElement albanian;
	private final String _update2="(//button[@type='submit'])[2]";
	@FindBy(xpath=_update2)
	private WebElement update2;
	
	

	
	public void ProfileDropDown()
	{
	page.clickOnElement(profileNameButton);
	}
	public void profileButton()
	{
	page.clickOnElement(profileButton);
	}
	public void CurrentPasword()
	{
		page.enterText(currentPassword, "123456");
	}
	public void NewPasword()
	{
		page.enterText(newPassword, "123456");
	}
	public void ConfirmPasword()
	{
		page.enterText(confirmPassword, "123456");
	}
	public void update1()
	{
		page.clickOnElement(update1);
	}
	
	
	public void prefix()
	{
		page.enterText(prefix, "c");
	}
	public void firstName()
	{
		page.enterText(firstName, "ninu");
	}
	public void lastName()
	{
		page.enterText(lastName, "antony");
	}
	public void eMail()
	{
		page.enterText(eMail, "ninuantony777@gmail.com");
	}
	public void selectLanguageContainer()
	{
		page.clickOnElement(languageContainer);
	}
	public void languageContainerEnglish()
	{
		page.dropDownSelectByIndex(english, 0);
		page.clickOnElement(english);
	
	}
	public void languageContainerAlbanian()
	{
		page.dropDownSelectByValue(albanian, _albanian);
	
	}
	public void languageContainerFrench()
	{
		page.dropDownSelectByValue(dutch, _dutch);
	}
		public void languageContainerHindi()
		{
			page.dropDownSelectByValue(hindi, _hindi);
		
		}
		public void languageContainerSpanish()
		{
			page.dropDownSelectByValue(spanish, _spanish);
		
		}
		public void update2()
		{
			page.clickOnElement(update2);
		}
		
}
	
