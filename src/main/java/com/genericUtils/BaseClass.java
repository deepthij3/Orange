package com.genericUtils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Orange.POMClasses.HomePage;
import com.Orange.POMClasses.LoginPage;

public class BaseClass {
	public WebDriver driver;
	
	public LoginPage lp;
	
	@BeforeSuite
	public void connectToDB() {
		System.out.println("Connected to DB");
	}
	@BeforeClass
		public void launch_browser() throws IOException
		{
			String browser=FileUtility.objForFileUtility().readDataFromPropFile("browser");
			
			System.out.println(browser);
			if(browser.equalsIgnoreCase("chrome"))
			  {
				driver=new ChromeDriver();
			  }
			  else if(browser.equalsIgnoreCase("firefox")) 
			  {
					driver=new FirefoxDriver();
				  }
			  else if(browser.equalsIgnoreCase("safari"))
			  {
					driver=new SafariDriver();
				  }
			  else
			  {
				  driver=new ChromeDriver();
			  }
			 driver.get(FileUtility.objForFileUtility().readDataFromPropFile("url"));
			 WebDriverUtil wUtil=new WebDriverUtil(driver); 
			 wUtil.maximizePage();
			 wUtil.pageLoadWait();
			 lp=new LoginPage(driver);
			
		}
	@BeforeMethod
	public void loginApp() throws IOException {
		lp.loginToApp();
	}
	
	@AfterMethod
	public void logoutApp()
	{
		HomePage hp=new HomePage(driver);
		hp.Logout();
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	@AfterSuite
	public void disConnectDB()
	{
		System.out.println("Disconnect");
	}
	}
	


