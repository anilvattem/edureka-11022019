package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Guru99Project {
	
	ChromeDriver driver;
	
	public void invokeBrowser()	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil.DESKTOP-NS9DBE9\\eclipse-workspace\\libs\\chromedriver-2.46\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/v4");
	}
		
	public void login(String userid, String password) {
		
		driver.findElement(By.name("uid")).sendKeys(userid);
		
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.name("btnLogin")).click();
		
	}
	
	public void addCustomer() {
		
		driver.findElement(By.linkText("New Customer")).click();
		
		driver.findElement(By.name("name")).sendKeys("Saurabh");
		
		driver.findElement(By.xpath("//input[@value='m']"));
		
		driver.findElement(By.id("dob")).sendKeys("10/10/1995");
		
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("Gurgaon Haryana");
		
		driver.findElement(By.name("city")).sendKeys("Gurgaon");
		
		driver.findElement(By.name("state")).sendKeys("Haryana");
		
		driver.findElement(By.name("pinno")).sendKeys("600001");
		
		driver.findElement(By.name("telephoneno")).sendKeys("9840491438");
		
		String emailId = "aa" + System.currentTimeMillis() + "@gmail.com";
		
		driver.findElement(By.name("emailid")).sendKeys(emailId);
		
		driver.findElement(By.name("password")).sendKeys("esYnAqu");
		
		driver.findElement(By.name("sub")).click();
		
	}
	
	public String getCustID() {
		
		String custID = driver.findElement(By.xpath("//table[@id='customer']/tbody/tr[4]/td[2]")).getText();
		
		/*String custID = driver.findElement(By.xpath("//table[@id='customer']//td[text()='Customer ID']//following-sibling::td)).getText();*/
		
		return custID;
	}
	
	public void addAccount(String custID, String actType ) {
		
		driver.findElement(By.linkText("New Account")).click();
		
		driver.findElement(By.name("cusid")).sendKeys(custID);
		
		WebElement dropdown = driver.findElement(By.name("selaccount"));
		
		Select selAccount = new Select(dropdown);
		
		selAccount.selectByVisibleText(actType);
		
		System.out.println(selAccount.isMultiple());
		
		driver.findElement(By.name("inideposit")).sendKeys("10001");
		
		driver.findElement(By.name("button2")).click();
	}

}
