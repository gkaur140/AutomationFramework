package com.automationPractise.PageTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationPractice.Pages.LoginPage;
import com.automationPractice.Pages.AdminPage;
import com.automationPractice.Pages.DashboardPage;
import com.automationPractise.TestBase.TestBase;

public class AdminPageTest extends TestBase {
	AdminPage ap;
	LoginPage lp;
	DashboardPage dp;

	@BeforeMethod
	public void intialise() {
		setUp();
		lp = new LoginPage();
		dp = lp.clickDashboardPage();
		ap=dp.clickAdminPage();
	}

	@Test
	public void verifySearchedName() {
		String name = ap.getPostedText("dilshad");
		Assert.assertEquals(name, "dilshad");
	}

	@AfterMethod
	public void quitDriver() {
		tearDown();
	}

}
