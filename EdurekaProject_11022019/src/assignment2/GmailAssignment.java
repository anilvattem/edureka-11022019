package assignment2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailAssignment {
	
	ChromeDriver driver;
	
	public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil.DESKTOP-NS9DBE9\\eclipse-workspace\\libs\\chromedriver-2.46\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.gmail.com");
						
	}

	public void gmailLoginID(String email) {
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
						
	}
	
	public void gmailPwd(String pwd) {
		
		//Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	}
	
	public void composeMail(String toMailid, String sub, String content) {
		
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		
		driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys(toMailid);
		
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys(sub);
		
		driver.findElement(By.xpath("//div[@id=':qn']")).sendKeys(content);
		
		driver.findElement(By.xpath("//div[@id=':p8']")).click();
	}
}
