package PageClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utilities.BaseClass;

public class AccountDetailsClass extends BaseClass {
	
	WebDriver driver;
	public AccountDetailsClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//a[@class='t-menu__link-item'])[7]")
	WebElement accountDetails;
	
	@FindBy(xpath="//select[@id='collection_comp-m8swuunx']")
	WebElement selectName;
	
	@FindBy(xpath="//button[contains(.,'Login')]")
	WebElement clickOnLogin;
	
	@FindBy(xpath="(//span[@class='TabsList2027980309__label'])[2]")
	WebElement clickDeposit;
	
	@FindBy(xpath="(//span[@class='TabsList2027980309__label'])[3]")
	WebElement clickWithdraw;
	
	@FindBy(xpath="//input[@id='input_comp-m8t00o79']") 
	WebElement enterDepoAmount;
	
	@FindBy(xpath="//input[@id='input_comp-m8t03jwk']") 
	WebElement enterWithAmount;
	
	@FindBy(xpath="(//span[@class='EIKVqt wixui-button__label'])[4]")
	WebElement clickBtnDeposit;
	
	@FindBy(xpath="(//button[@class='_NpZMS wixui-button PlZyDq'])[3]")
	WebElement clickBtnWithdraw;
	
	@FindBy(xpath="(//p[@class='font_7 wixui-rich-text__text'])[3]")
	WebElement txtBalance;
	
	
	public void clickOnAccountDetails() {
		accountDetails.click();
	}
	
	public void selectName() throws AWTException {
		/*Select s1 = new Select(selectName);
		//s1.selectByVisibleText("Rahul");
		//s1.selectByIndex(1);
		s1.selectByContainsVisibleText("Rahul");
		s1.selectByIndex(1);*/
		//JavascriptExecutor js = (JavascriptExecutor) driver;

		//js.executeScript("arguments[0].value='highestprice'", selectName);
		
		
		Robot sw = new Robot();
		sw.keyPress(KeyEvent.VK_DOWN);
		sw.keyPress(KeyEvent.VK_ENTER);
		selectName.click();
		sw.keyPress(KeyEvent.VK_DOWN);
		sw.keyPress(KeyEvent.VK_DOWN);
		sw.keyPress(KeyEvent.VK_ENTER);
		
		
	}
	
	public void clickOnLoginButton() {
		clickOnLogin.click();
	}
	
	public void clickOnDepositTab() {
		clickDeposit.click();
	}
	
	public void clickOnWithdrawTab() {
		clickWithdraw.click();
	}
	
	public void enterDepositAmount(String damount) {
		enterDepoAmount.sendKeys(damount);
	}
	public void enterWithdrawAmount(String wamount) {
		enterWithAmount.sendKeys(wamount);
	}
	public void clickOnDepositButton() {
		clickBtnDeposit.click();
	}
	public void clickOnWithdrawButton() {
		clickBtnWithdraw.click();
	}
	public String checkBalance() {
		String message = txtBalance.getText();
		return message;
	}

}
