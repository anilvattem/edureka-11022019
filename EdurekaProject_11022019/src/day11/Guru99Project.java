package day11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Guru99Project {
	
	ChromeDriver driver;
	
	@BeforeClass
	public void invokeBrowser() {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil.DESKTOP-NS9DBE9\\eclipse-workspace\\libs\\chromedriver-2.46\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/v4");
		
	}
	
	@Test
	public void verifyTitleOfThePage () {
		
		String actualPageTitle = driver.getTitle();
		String expectedPageTitle = "Guru99 Bank Home Page";
		Assert.assertEquals(actualPageTitle, expectedPageTitle);
		
	}
	
	@Test(enabled=false)
	public void verifyLogInWithCorrectCredentials() {
		
	}
	@AfterClass
	public void closeBrowser() {
		
		driver.quit();
	}

}
