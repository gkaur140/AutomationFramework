package com.automationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationPractise.TestBase.TestBase;

public class AdminPage extends TestBase {
	public AdminPage() {

		PageFactory.initElements(wd, this);
	}

	@FindBy(id = "searchBtn")
	WebElement searchButton;
	@FindBy(css = "td.left")
	WebElement userNameText;
	@FindBy(css = "input[id=searchSystemUser_userName]")
	WebElement username;

	public void inputName(String name) {
		username.sendKeys(name);
	}

	public void clickSearchbtn() {

		searchButton.click();

	}

	public String getPostedText(String name) {

		inputName(name);
		clickSearchbtn();
		return userNameText.getText();
	}

}
