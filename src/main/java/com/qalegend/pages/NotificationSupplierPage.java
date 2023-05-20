package com.qalegend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qalegend.utilities.TestHelper;

public class NotificationSupplierPage extends TestHelper {
		public WebDriver driver;
		public   NotificationSupplierPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		private final String _notificationTemplatesEnvelope="//span[text()='Notification Templates']";
		@FindBy(xpath=_notificationTemplatesEnvelope)
		private WebElement notificationTemplatesEnvelope;
		
		private final String _newOrderForm="(//a[@href='#cn_new_order']";
		@FindBy(xpath=_newOrderForm)
		private WebElement newOrderForm;
		private final String _newOrderemailSubject="//input[@name='template_data[new_order][subject]']";
		@FindBy(xpath=_newOrderemailSubject)
		private WebElement newOrderemailSubject;
		private final String _newOrderemailBody="iframe";
		@FindBy(tagName=_newOrderemailBody)
		private WebElement newOrderemailBody;
		private final String _newOrdersmsBody="//textarea[@name='template_data[new_order][sms_body]']";
		@FindBy(xpath=_newOrdersmsBody)
		private WebElement newOrdersmsBody;
		
		
		private final String _paymentPaidForm="//a[@href='#cn_payment_paid']";
		@FindBy(xpath=_paymentPaidForm)
		private WebElement paymentPaidForm;
		private final String _paymentPaidemailSubject="//input[@value='Payment Paid, from {business_name}']";
		@FindBy(xpath=_paymentPaidemailSubject)
		private WebElement paymentPaidemailSubject;
		private final String _paymentPaidemailBody="iframe";
		@FindBy(tagName=_paymentPaidemailBody)
		private WebElement paymentPaidemailBody;
		private final String _paymentPaidsmsBody="//textarea[@name='template_data[payment_paid][sms_body]']";
		@FindBy(xpath=_paymentPaidsmsBody)
		private WebElement paymentPaidsmsBody;
		
		private final String _itemsReceivedForm="//a[@href='#cn_items_received']";
		@FindBy(xpath=_itemsReceivedForm)
		private WebElement itemsReceivedForm;
		private final String _itemsReceivedemailSubject="//input[@value='Items received, from {business_name}']";
		@FindBy(xpath=_itemsReceivedemailSubject)
		private WebElement itemsReceivedemailSubject;
		private final String _itemsReceivedemailBody="iframe";
		@FindBy(tagName=_itemsReceivedemailBody)
		private WebElement itemsReceivedemailBody;
		private final String _itemsReceivedsmsBody="//textarea[@name='template_data[items_received][sms_body]]'";
		@FindBy(xpath=_itemsReceivedsmsBody)
		private WebElement itemsReceivedsmsBody;
		
		private final String _itemsPendingForm="//a[href='#cn_items_pending']";
		@FindBy(xpath=_itemsPendingForm)
		private WebElement itemsPendingForm;
		private final String _itemsPendingemailSubject="//input[@value='Items Pending, from {business_name}']";
		@FindBy(xpath=_itemsPendingemailSubject)
		private WebElement itemsPendingemailSubject;
		private final String _itemsPendingemailBody="iframe";
		@FindBy(tagName=_itemsPendingemailBody)
		private WebElement itemsPendingemailBody;
		private final String _itemsPendingsmsBody="//textarea[@name='template_data[items_pending][sms_body]]'";
		@FindBy(xpath=_itemsPendingsmsBody)
		private WebElement itemsPendingsmsBody;
		
		private final String _saveButton="//button[@type='submit']";
		@FindBy(xpath=_saveButton)
		private WebElement saveButton;
		
		public void NotificationTreeView()
		{
			page.clickOnElement(notificationTemplatesEnvelope);
		}
		
		public void NewOrderForm()
		{
			page.clear(newOrderForm);
		page.clickOnElement(newOrderForm);
		}
		public void NewOrderEmailSubject()
		{
			page.clear(newOrderemailSubject);
			page.enterText(newOrderemailSubject,"New Order, from {business_name}");
		}
		public void NewOrderEmailBody()
		{
			page.clear(newOrderemailBody);
			page.enterText(newOrderemailBody, "Dear {contact_name},\n"
					+ "\n"
					+ "We have a new order with reference number {invoice_number}. Kindly process the products as soon as possible.\n"
					+ "\n"
					+ "{business_name}\n"
					+ "{business_logo}");
		}
		public void NewOrderSmsBody()
		{
			page.clear(newOrdersmsBody);
			page.enterText(newOrdersmsBody, "Dear {contact_name}, We have a new order with reference number {invoice_number}. Kindly process the products as soon as possible. {business_name}");
		}
		public void SaveButton()
		{
			page.clickOnElement(saveButton);
		}
		
		
		
		public void PaymentPaid()
		{
		page.clickOnElement(paymentPaidForm);
		}
		public void PaymentPaidEmailSubject()
		{
			page.clear(paymentPaidemailSubject);
			page.enterText(paymentPaidemailSubject, "Payment Paid, from {business_name}");
		}
		public void PaymentPaidEmailBody()
		{
			page.clear(paymentPaidemailBody);
			page.enterText(paymentPaidemailBody, "Dear {contact_name},\n"
					+ "\n"
					+ "We have paid amount {paid_amount} again invoice number {invoice_number}.\n"
					+ "Kindly note it down.\n"
					+ "\n"
					+ "{business_name}\n"
					+ "{business_logo}");
		}
		public void PaymentPaidSmsBody()
		{
			page.clear(paymentPaidsmsBody);
			page.enterText(paymentPaidsmsBody, "We have paid amount {paid_amount} again invoice number {invoice_number}.\n"
					+ "                    Kindly note it down. {business_name}");
		}
		
		
		public void ItemsReceived()
		{
		page.clickOnElement(itemsReceivedForm);
		}
		public void ItemsReceivedEmailSubject()
		{
			page.clear(itemsReceivedemailSubject);
			page.enterText(itemsReceivedemailSubject, "Items received, from {business_name}");
		}
		public void ItemsReceivedEmailBody()
		{
			page.clear(itemsReceivedemailBody);
			page.enterText(itemsReceivedemailBody, "Dear {contact_name},\n"
					+ "\n"
					+ "We have received all items from invoice reference number {invoice_number}. Thank you for processing it.\n"
					+ "\n"
					+ "{business_name}\n"
					+ "{business_logo}");
		}
		public void ItemsReceivedSmsBody()
		{
			page.clear(itemsReceivedsmsBody);
			page.enterText(itemsReceivedsmsBody, "We have received all items from invoice reference number {invoice_number}. Thank you for processing it. {business_name}");
		}
		
		public void ItemsPending()
		{
		page.clickOnElement(itemsPendingForm);
		}
		public void ItemsPendingEmailSubject()
		{
			page.clear(itemsPendingemailSubject);
			page.enterText(itemsPendingemailSubject, "Items Pending, from {business_name}");
		}
		public void ItemsPendingEmailBody()
		{
			page.clear(itemsPendingemailBody);
			page.enterText(itemsPendingemailBody, "Dear {contact_name},\n"
					+ "This is to remind you that we have not yet received some items from invoice reference number {invoice_number}. Please process it as soon as possible.\n"
					+ "\n"
					+ "{business_name}\n"
					+ "{business_logo}");
		}
		public void ItemsPendingSmsBody()
		{
			page.clear(itemsPendingsmsBody);
			page.enterText(itemsPendingsmsBody, "This is to remind you that we have not yet received some items from invoice reference number {invoice_number} . Please process it as soon as possible.{business_name}");
		}
}
		
