package com.qalegend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

import com.qalegend.utilities.TestHelper;

public class NotificationCustomerPage extends TestHelper {
	public WebDriver driver;
	public NotificationCustomerPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
}
	private final String _notificationTemplatesEnvelope="//span[text()='Notification Templates']";
	@FindBy(xpath=_notificationTemplatesEnvelope)
	private WebElement notificationTemplatesEnvelope;
	private final String _newSaleForm="(//a[@data-toggle='tab'])[1]";
	@FindBy(xpath=_newSaleForm)
	private WebElement newSaleForm;
	private final String _newSaleemailSubject="//input[@id='new_sale_subject']";
	@FindBy(xpath=_newSaleemailSubject)
	private WebElement newSaleemailSubject;
	private final String _newSaleemailBody="//iframe[@title='Rich Text Editor, new_sale_email_body']";
	@FindBy(xpath=_newSaleemailBody)
	private WebElement newSaleemailBody;
	private final String _smsBody="template_data[new_sale][sms_body]";
	@FindBy(name=_smsBody)
	private WebElement smsBody;
	private final String _checkHelper1="(//ins[@class='iCheck-helper'])[1]";
	@FindBy(xpath=_checkHelper1)
	private WebElement checkHelper1;
	private final String _checkHelper2="(//ins[@class='iCheck-helper'])[2]";
	@FindBy(xpath=_checkHelper2)
	private WebElement checkHelper2;	

	private final String _paymentReceivedForm="(//a[@data-toggle='tab'])[2]";
	@FindBy(xpath=_paymentReceivedForm)
	private WebElement paymentReceivedForm;
	private final String _paymentReceivedemailSubject="//input[@id='payment_received_subject']";
	@FindBy(xpath=_paymentReceivedemailSubject)
	private WebElement paymentReceivedemailSubject;
	private final String _paymentReceivedemailBody="//iframe[@title='Rich Text Editor, payment_received_email_body']";
	@FindBy(xpath=_paymentReceivedemailBody)
	private WebElement paymentReceivedemailBody;
	private final String _paymentReceivedsmsBody="//textarea[@name='template_data[payment_received][sms_body]']";
	@FindBy(xpath=_paymentReceivedsmsBody)
	private WebElement paymentReceivedsmsBody;
	
	private final String _paymentRemainderForm="//a[@href='#cn_payment_reminder']";
	@FindBy(xpath=_paymentRemainderForm)
	private WebElement paymentRemainderForm;
	private final String _paymentRemainderemailSubject="//input[@name='template_data[payment_reminder][subject]']";
	@FindBy(xpath=_paymentRemainderemailSubject)
	private WebElement paymentRemainderemailSubject;
	private final String _paymentRemainderemailBody="Rich Text Editor, payment_reminder_email_body";
	@FindBy(xpath=_paymentRemainderemailBody)
	private WebElement paymentRemainderemailBody;
	private final String _paymentRemaindersmsBody="//textarea[@id='payment_reminder_sms_body']";
	@FindBy(name=_paymentRemaindersmsBody)
	private WebElement paymentRemaindersmsBody;
	
	
	private final String _newBookingForm="//a[@href='#cn_new_booking']";
	@FindBy(xpath=_newBookingForm)
	private WebElement newBookingForm;
	private final String _newBookingemailSubject="//input[@id='new_booking_subject']";
	@FindBy(xpath=_newBookingemailSubject)
	private WebElement newBookingemailSubject;
	private final String _newBookingemailBody="Rich Text Editor, new_booking_email_body";
	@FindBy(xpath=_newBookingemailBody)
	private WebElement newBookingemailBody;
	private final String _newBookingsmsBody="template_data[new_sale][sms_body]";
	@FindBy(name=_newBookingsmsBody)
	private WebElement newBookingsmsBody;
	
	
	
	
	public void NotificationTreeView()
	{
		page.clickOnElement(notificationTemplatesEnvelope);
	}
	public void NewSale()
	{
		page.clickOnElement(newSaleForm);
	}
	public void NewSaleEmailSubject()
	{
		page.clear(newSaleemailSubject);;
		page.enterText(newSaleemailSubject, "Thank you from {business_name}");
	}
	public void NewSaleEmailBody()
	{
		page.clear(newSaleemailBody);
		page.enterText(newSaleemailBody, "Dear {contact_name},\n"
				+ "\n"
				+ "Your invoice number is {invoice_number}\n"
				+ "Total amount: {total_amount}\n"
				+ "Paid amount: {paid_amount}\n"
				+ "\n"
				+ "Thank you for shopping with us.\n"
				+ "\n"
				+ "{business_logo}");
	}
	public void NewSaleSmsBody()
	{
		page.clear(smsBody);
		page.enterText(smsBody, "jhhjhj");
	}
	public void CheckHelper1()
	{
		page.checkBoxFunctionIsSelected(checkHelper1);
	}
	public void CheckHelper2()
	{
		page.checkBoxFunctionIsSelected(checkHelper2);
	}
	public boolean checkBoxSelected1() 
	{
		boolean status = page.checkBoxFunctionIsSelected(checkHelper1);
		return status;
	}
	public boolean checkBoxSelected2() 
	{
		boolean status = page.checkBoxFunctionIsSelected(checkHelper2);
		return status;
	}
	
	public void PaymentReceived()
	{
		page.clickOnElement(paymentReceivedForm);
	}
	public void PaymentReceivedEmailSubject()
	{
		page.clear(paymentReceivedemailSubject);
		page.enterText(paymentReceivedemailSubject, "Payment Received, from {business_name}");
	}
	public void PaymentReceivedEmailBody()
	{
		page.clear(paymentReceivedemailBody);
		
		  page.enterText(paymentReceivedemailBody, "Dear {contact_name},\n" + "\n" +
		  "We have received a payment of {paid_amount}\n" + "\n" + "{business_logo}");
		 
	}
	public void PaymentReceivedSmsBody()
	{
		page.clear(paymentReceivedsmsBody);
		page.enterText(paymentReceivedsmsBody, "Dear {contact_name}, We have received a payment of {paid_amount}. {business_name}");
	}
	
	

	public void PaymentRemainder()
	{
		page.clickOnElement(paymentRemainderForm);
	}
	public void PaymentRemainderEmailSubject()
	{
		page.clear(paymentRemainderemailSubject);
		page.enterText(paymentRemainderemailSubject, "Payment Reminder, from {business_name}");
	}
	public void PaymentRemainderEmailBody()
	{
		page.clear(paymentRemainderemailBody);
		
	page.enterText(paymentRemainderemailSubject, "Dear {contact_name},\n"
			+ "\n"
			+ "This is to remind you that you have pending payment of {due_amount}. Kindly pay it as soon as possible.\n"
			+ "\n"
			+ "{business_logo}");
	}
	public void PaymentRemainderSmsBody()
	{
		page.clear(paymentRemaindersmsBody);
		page.enterText(paymentRemaindersmsBody, "Dear {contact_name}, You have pending payment of {due_amount}. Kindly pay it as soon as possible. {business_name}");
	}
	
	
	public void NewBooking()
	{
		page.clickOnElement(newBookingForm);
	}
	public void NewBookingEmailSubject()
	{
		page.clear(newBookingemailSubject);
		page.enterText(newBookingemailSubject, "Booking Confirmed - {business_name}");
	}
	public void NewBookingEmailBody()
	{
		page.clear(newBookingemailBody);
	page.enterText(newBookingemailSubject, "Dear {contact_name},\n"
			+ "\n"
			+ "Your booking is confirmed\n"
			+ "\n"
			+ "Date: {start_time} to {end_time}\n"
			+ "\n"
			+ "Table: {table}\n"
			+ "\n"
			+ "Location: {location}\n"
			+ "\n"
			+ "{business_logo}");
	}
	public void NewBookingSmsBody()
	{
		page.clear(newBookingsmsBody);
		page.enterText(newBookingsmsBody, "Dear {contact_name}, Your booking is confirmed. Date: {start_time} to {end_time}, Table: {table}, Location: {location}" );
	}
}
	

	
	
	
