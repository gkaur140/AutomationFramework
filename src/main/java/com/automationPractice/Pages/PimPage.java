package com.automationPractice.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationPractise.TestBase.TestBase;

public class PimPage extends TestBase {
	public PimPage() {

		PageFactory.initElements(wd, this);
	}

	@FindBy(id = "menu_pim_addEmployee")
	WebElement addEmployeeButton;
	@FindBy(id = "firstName")
	WebElement firstName;
	@FindBy(id = "lastName")
	WebElement lastName;
	@FindBy(id = "photofile")
	WebElement profilePhoto;
	@FindBy(id = "btnSave")
	WebElement saveBtn;
	@FindBy(css = "input[id=btnSave]")
	WebElement editBtn;

	@FindBy(id = "personal_txtLicenNo")
	WebElement driversLisenceField;

	@FindBy(id = "personal_txtNICNo")
	WebElement ssnNumField;

	@FindBy(id = "personal_txtSINNo")
	WebElement sinNumField;

	@FindBy(id = "personal_cmbMarital")
	WebElement maritalStatusField;
	@FindBy(css = "select>option:nth-of-type(2)")
	WebElement genderSingleField;
	@FindBy(id = "personal_cmbNation")
	WebElement nationalityField;
	@FindBy(css = "select>option:nth-of-type(84)")
	WebElement indianNationalityField;
	@FindBy(id = "personal_txtEmpNickName")
	WebElement nickNameField;
	@FindBy(id = "personal_txtMilitarySer")
	WebElement militaryServiceField;
	@FindBy(id = "personal_txtLicExpDate")
	WebElement driverLicenseDateField;
	@FindBy(id = "personal_DOB")
	WebElement dOBField;
	@FindBy(id = "btnSave")
	WebElement saveBtn1;

	@FindBy(id = "personal_optGender_2")
	WebElement gender;

	public void clickAddEmployee() {

		addEmployeeButton.click();

	}

	public void addFirstName(String name) {

		firstName.sendKeys(name);

	}

	public void addLastName(String lastName1) {

		lastName.sendKeys(lastName1);

	}

	public void addProfilePicture(String jpgFile) {

		profilePhoto.sendKeys(jpgFile);

	}

	public void clickSaveBtn() {

		saveBtn.click();

	}

	public void clickEditBtn() {

		editBtn.click();

	}

	public void addDriversLicense(String licenseNum) {

		driversLisenceField.sendKeys(licenseNum);

	}

	public void addssnNum(String ssnNum) {

		ssnNumField.sendKeys(ssnNum);

	}

	public void selectGender() {

		gender.click();

	}

	public void addSinNum(String sinNum) {

		sinNumField.sendKeys(sinNum);

	}

	public void selectMaritalStatus() {

		maritalStatusField.click();
		genderSingleField.click();

	}

	public void selectNationality() {

		nationalityField.click();
		indianNationalityField.click();

	}

	public void addNickName(String nickName) {

		nickNameField.sendKeys(nickName);

	}

	public void addMilitaryField(String militaryOption) {

		militaryServiceField.sendKeys(militaryOption);

	}

	public void selectDateFOrDriverLicense(String date) {
		driverLicenseDateField.click();

		driverLicenseDateField.sendKeys(date);

		driverLicenseDateField.sendKeys(Keys.ENTER);
	}

	public void addDoB(String DATEoFbIRTH) {
		dOBField.click();
		dOBField.sendKeys(DATEoFbIRTH);
		dOBField.sendKeys(Keys.ENTER);

	}

	public void clickSaveBtn1() {

		saveBtn1.click();

	}

	public String getLicenseNum() {
		//return "efwffweff";
		 return driversLisenceField.getAttribute("value");
	}

}
