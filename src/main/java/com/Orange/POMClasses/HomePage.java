package com.Orange.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericUtils.WebDriverUtil;

public class HomePage {
	WebDriver driver;
	
	@FindBy(xpath="//b[text()='Admin']")
	private WebElement admin;
	
	public WebElement getAdmin() {
		return admin;
	}
	
	@FindBy(id="menu_admin_viewEducation")
	private WebElement Education;
	
	public WebElement getEducation() {
		return Education;
	}

	public WebElement getAddEdBtn() {
		return addEdBtn;
	}

	public WebElement getEducationName() {
		return educationName;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	@FindBy(id="btnAdd")
	private WebElement addEdBtn;
	
	@FindBy(id="education_name")
	private WebElement educationName;
	
	@FindBy(id="btnSave")
	private WebElement savebtn;

	public WebElement getQualification() {
		return qualification;
	}

	public WebElement getSkills() {
		return skills;
	}

	public WebElement getAddSkill() {
		return addSkill;
	}

	public WebElement getSkillName() {
		return skillName;
	}

	public WebElement getLogoutImg() {
		return logoutImg;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	@FindBy(id="skill_description")
	private WebElement skillDesc;
	
	public WebElement getSkillDesc() {
		return skillDesc;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	@FindBy(name="btnSave")
	private WebElement saveBtn;

	@FindBy(xpath="//a[text()='Qualifications']")
	private WebElement qualification;
	
	@FindBy(id="menu_admin_viewSkills")
	private WebElement skills;
	
	@FindBy(id="btnAdd")
	private WebElement addSkill;
	
	@FindBy(id="skill_name")
	private WebElement skillName;
	
	@FindBy(id="welcome")
	private WebElement logoutImg;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void Logout() {
		logoutImg.click();
		logout.click();
	}
	public void moveToQualification()
	{
		admin.click();
		WebDriverUtil wUtil=new WebDriverUtil(driver);
		wUtil.moveToElement(qualification);
		
	}

	
}
