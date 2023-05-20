package com.qalegend.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import com.qalegend.constants.Constants;



public class BaseSetUp {
public static WebDriver driver;
public Properties prop;
public FileInputStream fs;
public BaseSetUp()
{
	prop=new Properties();
	try {
		fs=new FileInputStream(System.getProperty("user.dir")+ Constants.CONFIG_FILE);
	}
	catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.load(fs);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
}
	
	@BeforeMethod(alwaysRun=true)
	@Parameters({"browser"})
	public void setUp(String browser)
	{
		 getBrowser(browser);
		  //String browser=prop.getProperty("browser")
		  
		  
		  String url=prop.getProperty("url");
		  driver.get(url);
		  
	}
	
	
	
	public void getBrowser(String br)
	{
	if(br.equals("chrome"))	
	{
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		  System.setProperty("Webdriver.chrome.driver", "/QALegendBilling-master/src/main/resources/chromedriver.exe");
		
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
	}
	else
	{
		  System.setProperty("Webdriver.edge.driver", "C:\\Users\\ASUS\\Desktop\\edge\\msedgedriver.exe");
		  		driver=new EdgeDriver();
		  
	}
	}
	
	@AfterMethod(alwaysRun=true)
	
	public void close()

	{
		driver.close();
	}
		/*public void tearDown(ITestResult result) throws IOException
	}
	
	{
		 if(result.getStatus()==ITestResult.FAILURE)
		  {
			 TakesScreenshot takescreenshot= (TakesScreenshot)driver;
			 
			  File screenshot= takescreenshot.getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(screenshot,new File("C:\\Users\\ASUS\\Desktop\\seleniumscreenshot\\"+ result.getName()+ ".png"));
	  }
		 
		
	}*/
}
