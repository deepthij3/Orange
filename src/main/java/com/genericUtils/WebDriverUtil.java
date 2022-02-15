package com.genericUtils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriverUtil {
	WebDriver driver;
	
	public WebDriverUtil(WebDriver driver) 
	{
		this.driver=driver;
		}
	
	
	public void maximizePage()
	{
		driver.manage().window().maximize();
	}
	public void pageLoadWait()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void moveToElement(WebElement element) 
	{
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
		}

}
