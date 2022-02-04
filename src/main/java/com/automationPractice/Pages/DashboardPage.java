package com.automationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationPractise.TestBase.TestBase;

public class DashboardPage extends TestBase {
	public DashboardPage() {

		PageFactory.initElements(wd, this);
	}

	@FindBy(id = "menu_pim_viewPimModule")
	WebElement pimPageClick;
	@FindBy(id = "menu_admin_viewAdminModule")
	WebElement adminPageClick;
	@FindBy(id = "menu_buzz_viewBuzz")
	WebElement buzzPageClick;
	@FindBy(id = "menu_leave_viewLeaveModule")
	WebElement leavePageClick;

	public PimPage clickPimPage() {

		pimPageClick.click();

		return new PimPage();

	}

	public AdminPage clickAdminPage() {
		adminPageClick.click();
		return new AdminPage();
	}

	public BuzzPage clickBuzzPage() {
		buzzPageClick.click();
		return new BuzzPage();
	}

	public LeavePage clickleavePage() {
		leavePageClick.click();
		return new LeavePage();
	}

}
