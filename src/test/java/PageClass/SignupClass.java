package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utilities.BaseClass;
//import junit.framework.Assert;

public class SignupClass extends BaseClass {
	
	WebDriver driver;
	public SignupClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//a[@class='t-menu__link-item'])[3]")
	WebElement signUp;
	
	@FindBy(xpath="//input[@id='input_1495646567135']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@id='input_1500473664921']")
	WebElement lastname;
	
	@FindBy(xpath = "//input[@id='input_1495646533382']")
	WebElement phonenumber;
	
	@FindBy(xpath = "//input[@id='input_1742711839224']")
	WebElement DOB;
	
	@FindBy(xpath = "//select[@id='input_1742711863977']")
	WebElement gender;
	
	@FindBy(xpath = "//input[@id='input_1495646533382']")
	WebElement cityName;
	
	@FindBy(xpath = "//input[@id='input_1495646533382']")
	WebElement uid;
	
	@FindBy(xpath = "//input[@id='input_1495646533382']")
	WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement btnSubmit;
	
	@FindBy(xpath="//div[@id='tildaformsuccesspopuptitle-new']")
	WebElement textMessage;
	
	public void clickOnSignUp()
	{
		signUp.click();
	}
	
	public void enterFirstName(String fname) {
		firstname.sendKeys(fname);
	}
	public void enterLastName(String lname) {
		lastname.sendKeys(lname);
	}
	public void enterPhoneNumber(String phone) {
		phonenumber.sendKeys(phone);
	}
	public void enterDateOfBirth(String dob) {
		DOB.sendKeys(dob);
	}
	public void selectGender() {
		Select s1 = new Select(gender);
		s1.selectByVisibleText("Male");
	}
	
	public void enterCityName(String cityname) {
		cityName.sendKeys(cityname);
	}
	public void enterUserID(String userId) {
		uid.sendKeys(userId);
	}
	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}
	public void clickOnSubmitButton() {
		btnSubmit.click();
	}
	public String verifyMessage() {
		{
			String message=textMessage.getText();
			return message;
		}
		
	}

}
