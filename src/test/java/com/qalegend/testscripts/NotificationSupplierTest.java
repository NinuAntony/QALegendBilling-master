package com.qalegend.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qalegend.base.BaseSetUp;
import com.qalegend.pages.LoginPage;
import com.qalegend.pages.NotificationCustomerPage;
import com.qalegend.pages.NotificationSupplierPage;

public class NotificationSupplierTest extends BaseSetUp {
	LoginPage login;
	NotificationSupplierPage supplier;

	@Test(priority = 1, description = "TC016_Customer New Order", groups = { "Regression" })
	public void TC016_customerNewOrderForm() {
		login = new LoginPage(driver);
		login.loginCrendentials();
		supplier = new NotificationSupplierPage(driver);
		supplier.NewOrderForm();
		supplier.NewOrderEmailSubject();
		supplier.NewOrderEmailBody();
		supplier.NewOrderSmsBody();
		supplier.SaveButton();

	}

	@Test(priority = 2, description = "TC017_Customer Payment Paid", groups = { "Regression" })
	public void TC018_customerPaymentPaidForm() {
		login = new LoginPage(driver);
		login.loginCrendentials();
		supplier = new NotificationSupplierPage(driver);
		supplier.PaymentPaid();
		supplier.PaymentPaidEmailSubject();
		supplier.PaymentPaidEmailBody();
		supplier.PaymentPaidSmsBody();
		supplier.SaveButton();
	}

	@Test(priority = 3, description = "TC018_Customer Items Pending", groups = { "Regression" })
	public void TC018_customerItemsPendingForm() {
		login = new LoginPage(driver);
		login.loginCrendentials();
		supplier = new NotificationSupplierPage(driver);
		supplier.ItemsPending();
		supplier.ItemsPendingEmailSubject();
		supplier.ItemsPendingEmailBody();
		supplier.ItemsPendingSmsBody();
		supplier.SaveButton();

	}

	@Test(priority = 4, description = "TC020_Customer Items Received", groups = { "Regression" })
	public void TC020_customerItemsReceivedForm() {
		login = new LoginPage(driver);
		login.loginCrendentials();
		supplier = new NotificationSupplierPage(driver);
		supplier.ItemsReceived();
		supplier.ItemsReceivedEmailSubject();
		supplier.ItemsReceivedEmailBody();
		supplier.ItemsReceivedSmsBody();
		supplier.SaveButton();

	}

}
