package com.automationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationPractise.TestBase.TestBase;

public class LandingPage extends TestBase {
	public LandingPage() {

		PageFactory.initElements(wd, this);
	}

	@FindBy(id = "txtUsername")
	WebElement contactUsButton;

	@FindBy(css = "div.header_user_info")
	WebElement signInButton;

	public ContactUsPage clickContactUs() {
		contactUsButton.click();
		return new ContactUsPage();
	}

	public SignInPage clickSignInButton() {
		signInButton.click();
		return new SignInPage();
	}

}
