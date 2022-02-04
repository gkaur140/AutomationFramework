package com.automationPractise.PageTest;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationPractice.Pages.DashboardPage;
import com.automationPractice.Pages.LoginPage;
import com.automationPractice.Pages.PimPage;
import com.automationPractise.TestBase.TestBase;

public class PimPageTest extends TestBase {
	PimPage pp;
	LoginPage lp;
	DashboardPage dp;

	@BeforeMethod
	public void intialise() {
		setUp();
		lp = new LoginPage();
		dp = lp.clickDashboardPage();
		pp = dp.clickPimPage();
	}
	@Test
	public void VerifyLicenseNumber()
	{
		pp.clickAddEmployee();
		pp.addFirstName("Gurvir");
		pp.addLastName("Kaur");
		pp.addProfilePicture("C:\\Users\\User\\Downloads\\PHOTO-2022-01-04-09-03-58 (1).jpg");
		pp.clickSaveBtn();
		pp.clickEditBtn();
		pp.addDoB("1997-09-28");
		pp.addDriversLicense("GB67897654");
		pp.addMilitaryField("no");
		pp.addNickName("Gill");
		pp.addSinNum("98765432");
		pp.addssnNum("567876");
		pp.selectDateFOrDriverLicense("2025-09-28");
		pp.selectMaritalStatus();
		pp.selectNationality();
		pp.selectGender();
		pp.clickSaveBtn1();
		String licenseNum = pp.getLicenseNum();
		Assert.assertEquals(licenseNum, "GB67897654");
	}
public void quitDriver()
{
	tearDown();
}
}
