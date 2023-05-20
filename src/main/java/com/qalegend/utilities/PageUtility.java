package com.qalegend.utilities;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.qalegend.base.BaseSetUp;

public class PageUtility extends BaseSetUp {
public String getPageTitle(WebDriver driver) 
{
	String title=driver.getTitle();
	return title;
	}

public String getCurrentUrl(WebDriver driver) 
{
	String url=driver.getCurrentUrl();
	return url;
	}

public String getPageSource(WebDriver driver) 
{
	String pagesource=driver.getPageSource();
	return pagesource;
	}

public void pageRefresh(WebDriver driver) 
{
driver.navigate().refresh();
	}

public void pageForward(WebDriver driver) 
{
driver.navigate().forward();
	}

public void pageBackward(WebDriver driver) 
{
driver.navigate().back();
    }

public String getWindowHandle(WebDriver driver) 
{
	String handleId=driver.getWindowHandle();
	return handleId;
	
	}

public Set<String> getWindowHandles(WebDriver driver) 
{
	Set<String>handlesIDs=driver.getWindowHandles();
	return handlesIDs;
    }
	
public void clickOnElement(WebElement element)
{
    element.click();
    }
public void submitElement(WebElement element)
{
    element.submit();
    }
public void enterText(WebElement element,String Text)
{
	element.sendKeys(Text);
	}
public void simpleAlert(WebDriver driver)
{
	Alert alert=driver.switchTo().alert();
	alert.accept();
	}
public void confirmationAlert(WebDriver driver)
{
	Alert alert=driver.switchTo().alert();
	alert.dismiss();
	}
public void promptAlert(WebDriver driver)
{
	Alert alert=driver.switchTo().alert();
	alert.sendKeys(null);
	alert.accept();
	}
public void rightClick(WebDriver driver,WebElement target)
{
	Actions action=new Actions(driver);
	action.contextClick(target).build().perform();
}
public void doubleClick(WebDriver driver,WebElement target)
{
	Actions action=new Actions(driver);
	action.doubleClick(target).build().perform();
}
public void mouseOver(WebDriver driver,WebElement target)
{
	Actions action=new Actions(driver);
	action.moveToElement(target).build().perform();
}
public String getElementText(WebElement element)
{
	String text=element.getText();
	return text;
}
public void dragAndDrop(WebDriver driver,WebElement source,WebElement destination)
{
	 Actions act=new Actions(driver);
	  act.dragAndDrop(source, destination);
	  act.build().perform();
}
public void dragAndDropByOffset(WebDriver driver,WebElement source,int x,int y)
{
	 Actions act=new Actions(driver);
	  act.dragAndDropBy(source, x,y);
	  act.build().perform();
}
public void reSize(WebDriver driver,WebElement source,int x,int y)
{
	 Actions act=new Actions(driver);
	  act.clickAndHold().dragAndDropBy(source, x,y);
	  act.build().perform();
}
public void mouseOverByOffsetAndWebElement(WebDriver driver,WebElement target,int x,int y)
{
	 Actions act=new Actions(driver);
	  act.moveToElement(target, x,y);
	  act.build().perform();
}
public void mouseOverByOffset(WebDriver driver,int x,int y)
{
	 Actions act=new Actions(driver);
	  act.moveByOffset(x,y);
	  act.build().perform();
}
public void dropDownSelectByIndex(WebElement target,int index)
{
	 Select select=new Select(target);
	  select.selectByIndex(index);
}
public void dropDownSelectByValue(WebElement target,String attributeValue)
{
	 Select select=new Select(target);
	  select.selectByValue(attributeValue);
}
public void dropDownSelectByVisibleText(WebElement target,String text)
{
	 Select select=new Select(target);
	  select.selectByVisibleText(text);
}
public boolean checkBoxFunctionIsSelected(WebElement element)
{
	  Boolean status=element.isSelected();
	  return status;
	 
}
public List webElementsSelection(String a)
{
	List<WebElement> li=driver.findElements(By.xpath(a));
	return li;
}


public void clear(WebElement element)
{
	element.clear();
}


    }  



