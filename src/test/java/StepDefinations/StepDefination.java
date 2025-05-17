package StepDefinations;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageClass.AccountDetailsClass;
import PageClass.ContactUsClass;
import PageClass.ForgetPasswordClass;
import PageClass.LoginClass;
import PageClass.SignupClass;
import Utilities.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefination extends BaseClass {
	WebDriver driver; 
	SignupClass sc1;
	String actualMessage = "Thank you! Your data has been submitted.";
	String actualBalance1 = "₹10000";
	String actualBalance2 = "₹5000";
	LoginClass lc1;
	ForgetPasswordClass fp1;
	ContactUsClass cu1;
	AccountDetailsClass ad1;
	
	//------------------------------Initilization ---------------------//
	@Before  //before hook
	public void initilizeSetup() {
	driver = BaseClass.initilizeDriver();
	sc1 = new SignupClass(driver);
	lc1 = new LoginClass(driver);
	fp1 = new ForgetPasswordClass(driver);
	cu1 = new ContactUsClass(driver);
	ad1 = new AccountDetailsClass(driver);
	log = (Logger) LogManager.getLogger(StepDefination.class); //invoking logger
	}

	// -----------------------Common Method --------------------------//
	
	@Given("User open the URL of Banking application")
	public void user_open_the_url_of_banking_application() {
		System.out.println("Application Launched");
		System.out.println(getPageTitle());
		log.info("GroTechMind Banking application is launched");
		//BaseClass.initilizeDriver();
		//sc1 = new SignupClass(driver);
	    
	}
	
	//------------------------------------Signup Page --------------------------------//
	
	@Given("user clicks on SignUp Button in WebPage")
	public void user_clicks_on_sign_up_button_in_web_page() {
		
		sc1.clickOnSignUp();
		log.info("TC1: step1_Clicked on Signup menu");
	}

	@Given("user enters firstname as {string}")
	public void user_enters_firstname_as(String firstname) {
	    sc1.enterFirstName(firstname);
	    log.info("TC1: step2_Entered First Name.");
	}

	@Given("user enters lastname as {string}")
	public void user_enters_lastname_as(String lastname) {
	    sc1.enterLastName(lastname);
	    log.info("TC1: step3_Entered Last Name");
	}

	@Given("user enters phone number as {string}")
	public void user_enters_phone_number_as(String phonenumber) {
	   sc1.enterPhoneNumber(phonenumber);
	   log.info("TC1: step4_Entered Phone Number");
	}

	@Given("user enters Date of Birth as {string}")
	public void user_enters_date_of_birth_as(String DOB) {
		addImplicitWait();
	   sc1.enterDateOfBirth(DOB);
	   scrollDown();
	   log.info("TC1: step5_Entered Date of Birth");
	}

	@Given("user selects the gender")
	public void user_selects_the_gender() {
	    sc1.selectGender();
	    log.info("TC1: step6_Gender is selected");
	}

	@Given("user enters city name as {string}")
	public void user_enters_city_name_as(String cityname) {
		addImplicitWait();
	   sc1.enterCityName(cityname);
	   log.info("TC1: step7_Entered City Name");
	}

	@Given("user enters the user id as {string}")
	public void user_enters_the_user_id_as(String uid) {
	   sc1.enterUserID(uid);
	   log.info("TC1: step8_Entered UserId");
	}

	@Given("user enters the password as {string}")
	public void user_enters_the_password_as(String password) {
	    sc1.enterPassword(password);
	    log.info("TC1: step9_Entered Password");
	}

	@When("user clicks on Submit button")
	public void user_clicks_on_Submit_button() {
	  sc1.clickOnSubmitButton(); 
	  log.info("TC1: step10_Clicked on Submit Button");
	  
	}

	@Then("user will get a success message from the site")
	public void user_will_get_a_success_message_from_the_site() throws InterruptedException, IOException {
		
	   addExplicitWait(By.xpath("//div[@class='js-successbox t-form__successbox t-text t-text_md']"));
	   String sumessage = sc1.verifyMessage();
	   Assert.assertEquals(actualMessage, sumessage);
	   log.info("TC1: step11_Verified if the success message is visible or not.");
	   screenshot(driver,"Verify the success message after signup");
	}
	
	//----------------------------------Login Page -------------------------------------------------
	@Given("clicks on Log in button in Webpage")
	public void clicks_on_log_in_button_in_webpage() {
		lc1.clickOnLogIn();
	    
	}

	@Given("user enters username as {string}")
	public void user_enters_username_as(String username) {
		lc1.enterUserName(username);
	}

	@Given("user enters password as {string}")
	public void user_enters_password_as(String password) {
		lc1.enterPassword(password);
	    
	}

	@When("user click  on Login button")
	public void user_click_on_login_button() {
		lc1.clickOnLoginButton();
	    
	}

	@Then("user will get a success message from the website")
	public void user_will_get_a_success_message_from_the_website() throws InterruptedException, IOException {
		
		   addExplicitWait(By.xpath("//div[@class='js-successbox t-form__successbox t-text t-text_md']"));
		   String lmessage = lc1.verifyLoginMessage();
		   Assert.assertEquals(actualMessage, lmessage);
		   log.info("TC2: Verified if the success message is visible or not.");
		   screenshot(driver,"Verify the success message after login");
	    
	}
	
	//-----------------------End of Login Functionality ----------------------//
	
	
	// ------------------------Forget Password -------------------------------//
	
	@Given("clicks on Forget Password button in Webpage")
	public void clicks_on_forget_password_button_in_webpage() {
		fp1.clickOnForgetPassword(); 
	}

	@Given("user enters email in Forget Password page as {string}")
	public void user_enters_email_in_forget_password_page_as(String fp_email) {
	    fp1.enterEmailAddress(fp_email);
	}

	@Given("user enters phone number in Forget Password page as {string}")
	public void user_enters_phone_number_in_forget_password_page_as(String fp_phone) {
	   fp1.enterPhoneNumber(fp_phone);
	}

	@When("user click  on forget password button")
	public void user_click_on_forget_password_button() {
		
		fp1.clickOnForgetPasswordButton();
	    
	}

	@Then("user will get a success message in Forget Password page")
	public void user_will_get_a_success_message_in_forget_password_page() throws IOException {
		
		   addExplicitWait(By.xpath("//div[@class='js-successbox t-form__successbox t-text t-text_md']"));
		   String fpmessage = fp1.verifyForgetPasswordMessage();
		   Assert.assertEquals(actualMessage, fpmessage);
		   log.info("TC3: Verified if the success message is visible or not.");
		   screenshot(driver,"Verify the success message after forget password");
	    
	}
	
	//----------------------------End of Forget Password Functionality-------------------//
	
	
	//----------------------------Contact Us Functionality --------------------------------//
	
	@Given("user clicks on ContactUs button in WebPage")
	public void user_clicks_on_contact_us_button_in_web_page() {
	    cu1.clickOnContactUs();
	}

	@Given("user enters name as {string}")
	public void user_enters_name_as(String contact_name) {
		cu1.enterContactName(contact_name);
	    
	}

	@Given("user enters email as {string}")
	public void user_enters_email_as(String contact_email) {
	   cu1.enterEmailAddress(contact_email);
	}

	@Given("user enters phone as {string}")
	public void user_enters_phone_as(String contact_phone) {
	   scrollDown();
	   cu1.enterPhoneNumber(contact_phone);
	}

	@Given("user enters address as {string}")
	public void user_enters_address_as(String contact_address) {
	    cu1.enterContactAddress(contact_address);
	}

	@Given("user enters country as {string}")
	public void user_enters_country_as(String contact_country) {
	    cu1.enterContactCountrye(contact_country);
	}

	@Given("user enters zip as {string}")
	public void user_enters_zip_as(String contact_zip) {
	    cu1.enterContactZip(contact_zip);
	}

	@When("user clicks on Submit button in ContactUs page")
	public void user_clicks_on_submit_button_in_contact_us_page() {
	    cu1.clickOnSumbitButton();
	}

	@Then("user will get a success message in ContactUs page")
	public void user_will_get_a_success_message_in_contact_us_page() throws IOException {
		
		   addExplicitWait(By.xpath("//div[@class='js-successbox t-form__successbox t-text t-text_md']"));
		   String cumessage = cu1.verifyContactSuccessMessage();
		   Assert.assertEquals(actualMessage, cumessage);
		   log.info("TC4: Verified if the success message is visible or not.");
		   screenshot(driver,"Verify the success message after contact Us");
	}
	//----------------------------End of ContactUs Functionality-------------------//
	
	
	//------------------------------Account Details Functionality --------------------//
	@Given("user clicks on Account Details button in WebPage")
	public void user_clicks_on_account_details_button_in_web_page() throws InterruptedException {
	    ad1.clickOnAccountDetails();
	    windowHandle(1);
	    addHardcodedWait();
	    System.out.println(driver.getCurrentUrl());
	}

	@Given("select and customer from the dropdown")
	public void select_and_customer_from_the_dropdown() throws AWTException {
	    ad1.selectName();
	}

	@Given("Click on Login")
	public void click_on_login() {
	   ad1.clickOnLoginButton();
	}

	@Given("click on deposit tab")
	public void click_on_deposit_tab() {
	   ad1.clickOnDepositTab();
	}

	@Given("enter the amount to be deposited as {string}")
	public void enter_the_amount_to_be_deposited_as(String d_amount) {
	   ad1.enterDepositAmount(d_amount);
	}

	@When("click on Deposit button")
	public void click_on_deposit_button() {
		ad1.clickOnDepositButton();
	   
	}

	@Then("balance is updated")
	public void balance_is_updated() throws IOException {
		String admessage = ad1.checkBalance();
		System.out.println(admessage);
		Assert.assertEquals(actualBalance1, admessage);
		log.info("TC5: Verified if balance matches the requirement.");
		screenshot(driver,"Verify balance after deposit");
		
	   
	}

	@Then("click on withdrawl tab")
	public void click_on_withdrawl_tab() {
	  ad1.clickOnWithdrawTab();
	}

	@Then("enter amount to be withdrawn as {string}")
	public void enter_amount_to_be_withdrawn_as(String w_amount) {
	    ad1.enterWithdrawAmount(w_amount);
	}

	@When("click on withdraw button")
	public void click_on_withdraw_button() {
	    ad1.clickOnWithdrawButton();
	}

	@Then("balance will be updated")
	public void balance_will_be_updated() throws IOException {
		
		String awmessage = ad1.checkBalance();
		System.out.println(awmessage);
		Assert.assertEquals(actualBalance2, awmessage);
		log.info("TC5: Verified if balance matches the requirement.");
		   screenshot(driver,"Verify balance after withdrawal");
		
		windowHandle(0);
		
	    
	}

	
	//--------------------------------Tear Down -----------------------------------------//
	@After //after hook
	public void tearDown() throws InterruptedException {
		closeBrowser();
		
	}

}
