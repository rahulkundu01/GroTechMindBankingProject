package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class ForgetPasswordClass extends BaseClass {
	
	WebDriver driver;
	public ForgetPasswordClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//a[@class='t-menu__link-item'])[6]")
	WebElement forgetPassword;
	
	@FindBy (xpath = "//input[@id='input_7539084004150']")
	WebElement emailAddress;
	
	@FindBy (xpath = "//input[@id='input_7539084004151']")
	WebElement phoneNumber;
	
	@FindBy (xpath = "//button[@class='t-submit']")
	WebElement fbBtnForgetPassword;
	
	@FindBy(xpath="//div[@class='js-successbox t-form__successbox t-text t-text_md']")
	WebElement fptextMessage;
	
	public void clickOnForgetPassword()
	{
		forgetPassword.click();
	}
	
	public void enterEmailAddress(String emailaddress) {
		emailAddress .sendKeys(emailaddress);
	}
	
	public void enterPhoneNumber(String phonenumber ) {
		phoneNumber .sendKeys(phonenumber);
	}
	
	public void clickOnForgetPasswordButton() {
		fbBtnForgetPassword.click();
	}
	
	public String verifyForgetPasswordMessage() {
		
			String message = fptextMessage.getText();
			return message;
		
	}
}