package Utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageClass.SignupClass;

public class BaseClass {
	public static WebDriver driver;
	static String browserName;
	public static Logger log;
	
	public static WebDriver initilizeDriver() {
		
		browserName = FetchDataFromProperty.readDataFromProperty().getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			try {
				driver.get(FetchDataFromExcel.getURL());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.manage().window().maximize();	
			
		}
		
		if(browserName.equalsIgnoreCase("firefox"))
		{
			
			driver=new FirefoxDriver();
			try {
				driver.get(FetchDataFromExcel.getURL());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			driver.manage().window().maximize();
		}
		
		if(browserName.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			try {
				driver.get(FetchDataFromExcel.getURL());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			driver.manage().window().maximize();
		}
	
		
		return driver;	
	}

	
	public static void addImplicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	
	public static void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
	}
	
	public static String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}
	public static void addHardcodedWait() throws InterruptedException
	{
		Thread.sleep(20000);
	}

	public static void addExplicitWait(By locator) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static void windowHandle(int a) {
		String currHandle=driver.getWindowHandle();
		Object[] windowHandles=driver.getWindowHandles().toArray();
		driver.switchTo().window((String) windowHandles[a]);
	}
	
	public static void closeBrowser() throws InterruptedException {
		addHardcodedWait();
		driver.quit();
	}
	
    public static void screenshot(WebDriver driver ,String filename) throws IOException {
		
		TakesScreenshot ts = ((TakesScreenshot)driver); //declearing
		File srcFile = ts.getScreenshotAs(OutputType.FILE); //taking screen shot as file
		FileUtils.copyFile(srcFile, new File("Screenshot\\"+filename+".png"));
		
	}
	
	
	
	//public SignupClass sc1;
}
