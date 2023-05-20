/*
 * package com.qalegend.pages;
 * 
 * public class ForgetPasswordPage {
 * 
 * }
 */
package com.qalegend.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.qalegend.utilities.TestHelper;
public class ForgetPasswordPage extends TestHelper {
	public WebDriver driver;
	public ForgetPasswordPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	private final String _forgetPasswordbutton="//a[@class='btn btn-link']";
	@FindBy(xpath=_forgetPasswordbutton)
	private WebElement forgetPasswordbutton;
	private final String _emailAddressField="//input[@name='email']";
	@FindBy(xpath=_emailAddressField)
	private WebElement emailAddressField;
	private final String _sendPasswordlink="//button[@class='btn btn-primary']";
	@FindBy(xpath=_sendPasswordlink)
	private WebElement sendPasswordlink;
	
	public String getForgetPasswordPageTitle() {
		String title=page.getPageTitle(driver);
		return title;
	}
	
	public void forgotYourPasswordButtonClick()
	{
		page.clickOnElement(forgetPasswordbutton);
		
	}
	
	public void emailAddressFormControl(String Email)
	{
		page.enterText(emailAddressField, Email);
	}
	
	 public void sendButton()
	 {
		 page.clickOnElement(sendPasswordlink);
	 }
}