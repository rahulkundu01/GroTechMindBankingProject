package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class ContactUsClass extends BaseClass {
	
	WebDriver driver;
	public ContactUsClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//a[@class='t-menu__link-item'])[2]")
	WebElement contactUs;
	
	@FindBy(xpath="//input[@id='input_1496238250184']")
	WebElement contactName;
	
	@FindBy(xpath="//input[@id='input_1496238230199']")
	WebElement contactEmail;
	
	@FindBy(xpath="//input[@id='input_1496238259342']")
	WebElement contactPhone;
	
	@FindBy(xpath="//input[@id='input_1742714856123']")
	WebElement contactAddress;
	
	@FindBy(xpath="//input[@id='input_1742714886366']")
	WebElement contactCountry;
	
	@FindBy(xpath="//input[@id='input_1742714901821']")
	WebElement contactZip;
	
	@FindBy(xpath="//button[@class='t-submit']")
	WebElement contactBtnSubmit;
	
	@FindBy(xpath="//div[@id='tildaformsuccesspopuptitle-new']")
	WebElement contactSuccessMessage;
	
	public void clickOnContactUs() {
		contactUs.click();
	}
	public void enterContactName(String cname) {
		contactName.sendKeys(cname);
	}
	public void enterPhoneNumber(String cphone) {
		contactPhone.sendKeys(cphone);
	}
	public void enterEmailAddress(String cemail) {
		contactEmail.sendKeys(cemail);
	}
	public void enterContactAddress(String caddress) {
		contactAddress.sendKeys(caddress);
	}
	public void enterContactCountrye(String ccountry) {
		contactCountry.sendKeys(ccountry);
	}
	public void enterContactZip(String czip) {
		contactZip.sendKeys(czip);
	}
	public void clickOnSumbitButton() {
		contactBtnSubmit.click();
	}
	public String verifyContactSuccessMessage() {
		String message = contactSuccessMessage.getText();
		return message;
	}
	
	
	
}
