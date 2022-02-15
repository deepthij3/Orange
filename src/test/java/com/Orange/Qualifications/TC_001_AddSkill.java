package com.Orange.Qualifications;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.Orange.POMClasses.HomePage;
import com.genericUtils.BaseClass;
import com.genericUtils.ExcelUtil;

public class TC_001_AddSkill extends BaseClass{
	@Test
	public void addingSkill() throws EncryptedDocumentException, IOException
	{
		HomePage hp=new HomePage(driver);
		hp.moveToQualification();
		hp.getSkills().click();
		hp.getAddSkill().click();
		ExcelUtil eu=new ExcelUtil();
		String skill=eu.readDataFromExcel("Skills", 1, 0);
		hp.getSkillName().sendKeys(skill);
		String desc=eu.readDataFromExcel("Skills", 1, 1);
		hp.getSkillDesc().sendKeys(desc);
		hp.getSaveBtn().click();
	}
}


