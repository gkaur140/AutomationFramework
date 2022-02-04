package com.automationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationPractise.TestBase.TestBase;

public class LoginPage extends TestBase {
	public LoginPage() {

		PageFactory.initElements(wd, this);
	}

	@FindBy(id = "txtUsername")
	WebElement userName;
	@FindBy(id = "txtPassword")
	WebElement password;
	@FindBy(id = "btnLogin")
	WebElement loginButton;

	public void enterUsername() {
		userName.sendKeys("Admin");
	}

	public void enterPassword() {
		password.sendKeys("admin123");
	}
	public void clickLoginBtn()
	{
		loginButton.click();
	}

	public DashboardPage clickDashboardPage() {

		enterUsername();
		enterPassword();
		clickLoginBtn();
		return new DashboardPage();
	}

}
