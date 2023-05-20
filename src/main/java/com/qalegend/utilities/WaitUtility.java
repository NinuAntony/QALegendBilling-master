package com.qalegend.utilities;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitUtility {
 
	public static final long EXPLICIT_WAIT=20000;
	public static final long IMPLICIT_WAIT=20;
	public static final long HARD_WAIT=20000;
	public static final long FLUENT_WAIT=20000;
	
	public void setHardWait()
	{
		try {
			Thread.sleep(HARD_WAIT);
		}
		catch (InterruptedException e)
		{
			throw new RuntimeException(e);
		}
	}
	
	public static void  setImplicitWait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
	}
	
public static void  setExplicitWait(WebDriver driver, WebElement element)
{
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(100));
	 wait.until(ExpectedConditions.visibilityOf(element));
}

public void setFluentWait(WebDriver driver)
{
	 Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
		        .withTimeout(Duration.ofSeconds(30))
		        .pollingEvery(Duration.ofSeconds(5))
		        .ignoring(NoSuchElementException.class);
}
}