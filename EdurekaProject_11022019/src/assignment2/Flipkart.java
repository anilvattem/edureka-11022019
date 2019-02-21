package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	
	ChromeDriver driver;
	
	public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil.DESKTOP-NS9DBE9\\eclipse-workspace\\libs\\chromedriver-2.46\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.flipkart.com");
		
	}

	public void FlipkartLogin(String emailid, String pwd) {
		
		driver.findElement(By.xpath("//input[@class='_2zrpKA']")).sendKeys(emailid);
		
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv']")).sendKeys(pwd);
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
	}
	
}
