package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class LoginClass extends BaseClass {
	
	WebDriver driver;
	public LoginClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//a[@class='t-menu__link-item'])[5]")
	WebElement logIn;
	
	@FindBy (xpath = "//input[@id='input_1495646567135']")
	WebElement loginUserName;
	
	@FindBy (xpath = "//input[@id='input_1742715919526']")
	WebElement loginPassword;
	
	@FindBy (xpath = "//button[@class='t-submit']")
	WebElement loginBtnLogin;
	
	@FindBy(xpath="//div[@class='js-successbox t-form__successbox t-text t-text_md']")
	WebElement textMessage;
	
	public void clickOnLogIn()
	{
		logIn.click();
	}
	
	public void enterUserName(String uname) {
		loginUserName .sendKeys(uname);
	}
	
	public void enterPassword(String paswd) {
		loginPassword .sendKeys(paswd);
	}
	
	public void clickOnLoginButton() {
		loginBtnLogin.click();
	}
	
	public String verifyLoginMessage() {
		
			String message=textMessage.getText();
			return message;
		
	}
}
