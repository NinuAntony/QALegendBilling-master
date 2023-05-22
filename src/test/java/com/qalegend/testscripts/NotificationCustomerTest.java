package com.qalegend.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qalegend.base.BaseSetUp;
import com.qalegend.pages.LoginPage;
import com.qalegend.pages.NotificationCustomerPage;

public class NotificationCustomerTest extends BaseSetUp {
	LoginPage login;
	NotificationCustomerPage customer;
	
		@Test(priority = 1, description = "TC011_verify Notification Template Title ", groups = { "Regression" })
		public void TC011_verifynotificationTemplatePageTitle() 
		{
			login = new LoginPage(driver);
			login.loginCrendentials();
			customer=new NotificationCustomerPage(driver);
			customer.NotificationTreeView();
			String actual = "Notification Tempaltes - QAlegend";

			String expected = driver.getCurrentUrl();
			Assert.assertEquals(actual, expected);

	}
		@Test(priority = 2, description = "TC012_Customer New Sale", groups = { "Regression" })
		public void TC012_customerNewSaleForm() 
		{
			login = new LoginPage(driver);
			login.loginCrendentials();
			customer=new NotificationCustomerPage(driver);
			customer.NotificationTreeView();
			customer.NewSale();
			customer.NewBookingEmailSubject();
			customer.NewBookingEmailBody();
			customer.NewSaleSmsBody();
			customer.CheckHelper1();
			customer.CheckHelper2();
			Boolean status=customer.checkBoxSelected1();
			Boolean status1=customer.checkBoxSelected2();
			Assert.assertTrue(status);
			Assert.assertTrue(status1);
		}
		
		@Test(priority = 3, description = "TC013_Customer Payment Received", groups = { "Regression" })
		public void TC0013_customerPaymentRecivedForm() 
		{
			login = new LoginPage(driver);
			login.loginCrendentials();
			customer=new NotificationCustomerPage(driver);
			customer.NotificationTreeView();
			customer.PaymentReceived();
			customer.PaymentReceivedEmailSubject();
			customer.PaymentReceivedEmailBody();
			customer.PaymentReceivedSmsBody();
		}
		
		@Test(priority = 3, description = "TC014_Customer Payment Remainder", groups = { "Regression" })
		public void TC014_customerPaymentRemainderForm() 
		{
			login = new LoginPage(driver);
			login.loginCrendentials();
			customer=new NotificationCustomerPage(driver);
			customer.NotificationTreeView();
			customer.PaymentRemainder();
			customer.PaymentRemainderEmailSubject();
			customer.PaymentRemainderEmailBody();
			customer.PaymentRemainderSmsBody();
		}
		
		@Test(priority = 4, description = "TC015_Customer New Booking", groups = { "Regression" })
		public void TC015_customerNewBookingForm() 
		{
			login = new LoginPage(driver);
			login.loginCrendentials();
			customer=new NotificationCustomerPage(driver);
			customer.NotificationTreeView();
			customer.NewBooking();
			customer.NewBookingEmailSubject();
			customer.NewBookingEmailBody();
			customer.NewBookingSmsBody();
		}
		
		
		
			
	}
