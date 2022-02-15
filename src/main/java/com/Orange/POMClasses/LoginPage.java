package com.Orange.POMClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericUtils.FileUtility;

public class LoginPage {
	WebDriver driver;
	@FindBy(id="txtUsername")
	private WebElement username;
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	@FindBy(id="txtPassword")
	private WebElement password;
	
	@FindBy(name="Submit")
	private WebElement login;
	
	public LoginPage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	public void loginToApp() throws IOException
	{
		username.sendKeys(FileUtility.objForFileUtility().readDataFromPropFile("username"));
		password.sendKeys(FileUtility.objForFileUtility().readDataFromPropFile("password"));
		login.click();
	}

}
