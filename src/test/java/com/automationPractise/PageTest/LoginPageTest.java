package com.automationPractise.PageTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationPractice.Pages.LoginPage;
import com.automationPractise.TestBase.TestBase;

public class LoginPageTest extends TestBase {
	LoginPage lp;

	@BeforeMethod
	public void intialise() {
		setUp();
		lp = new LoginPage();
	}

	@Test
	public void verifyTitleOfThePage() {

		 lp.clickDashboardPage();
		 String titleOfThePage = wd.getTitle();
		Assert.assertEquals(titleOfThePage, "OrangeHRM");
	}

	@AfterMethod
	public void quitDriver() {
		tearDown();
	}

}
