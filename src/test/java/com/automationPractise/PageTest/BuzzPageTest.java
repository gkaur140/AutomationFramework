package com.automationPractise.PageTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automationPractice.Pages.BuzzPage;
import com.automationPractice.Pages.LoginPage;
import com.automationPractice.Pages.DashboardPage;
import com.automationPractise.TestBase.TestBase;
import com.automationPractise.qa.Utils.ExcelUtils;

public class BuzzPageTest extends TestBase {
	DashboardPage dp;
	LoginPage lp;
	BuzzPage bp;

	@BeforeMethod
	public void intialise() {
		setUp();
		lp = new LoginPage();
		dp = lp.clickDashboardPage();
		bp = dp.clickBuzzPage();
	}

	@Test(dataProvider = "PostMessages")
	public void verifyPostedElement(String post) {

		 bp.enterPost(post);

		Assert.assertEquals(bp.getPostedText(), post);
	}

	@AfterMethod
	public void quitDriver() {
		tearDown();

	}

	@DataProvider(name = "PostMessages")
	public String[][] dataProviderForBuzzPost() throws Exception {
		String path = "C:\\Users\\User\\Desktop\\ContactUs.xlsx";
		int rowsCount = ExcelUtils.getRowCount(path, "Sheet1");
		int cellCount = ExcelUtils.getCellCount(path, "Sheet1", rowsCount);

		String[][] data = new String[rowsCount][cellCount];

		for (int i = 0; i < rowsCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				data[i][j] = ExcelUtils.getCellData(path, "Sheet1", i, j);

			}

		}

		return data;

	}
}
