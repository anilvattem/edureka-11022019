package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class workingWithChrome {
	
	//Create an instance of ChromeDriver class
	ChromeDriver driver;
	
	public void invokeBrowser() {

		//Setting the property of a system variable used by chromedriver executable file
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil.DESKTOP-NS9DBE9\\eclipse-workspace\\libs\\chromedriver-2.46\\chromedriver.exe");
		
		//initialize the driver instance
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://facebook.com");
	}	
	
	public void closeBrowser() {
		
		driver.quit();
		
		}
	
	public String pageTitle() {
		
		return driver.getTitle();
	}
	
	public void navigateCommands() {
		
		driver.navigate().to("https://in.yahoo.com");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
	}
		
}
