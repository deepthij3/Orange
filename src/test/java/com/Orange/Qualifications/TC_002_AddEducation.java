package com.Orange.Qualifications;

import org.testng.annotations.Test;

import com.Orange.POMClasses.HomePage;
import com.genericUtils.BaseClass;

public class TC_002_AddEducation extends BaseClass{
	@Test
	public void addEducation()
	{
		HomePage hp=new HomePage(driver);
		hp.moveToQualification();
		hp.getEducation().click();
		hp.getAddEdBtn().click();
		hp.getEducationName().sendKeys("BSc");
		hp.getSavebtn().click();
	}

}
