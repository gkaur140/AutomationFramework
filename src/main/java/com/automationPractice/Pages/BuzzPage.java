package com.automationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationPractise.TestBase.TestBase;

public class BuzzPage extends TestBase {
	public BuzzPage() {

		PageFactory.initElements(wd, this);
	}

	@FindBy(id = "createPost_content")
	WebElement postField;
	@FindBy(id = "postSubmitBtn")
	WebElement postBtn;
	@FindBy(id = "postContent_15")
	WebElement textPosted;

	public void enterPost(String postText) {

		inputPost(postText);
		clickPostBtn();

	}

	void inputPost(String postText) {
		postField.sendKeys(postText);
	}

	void clickPostBtn() {
		postBtn.click();
	}

	public String getPostedText() {

		return textPosted.getText();
	}

}
