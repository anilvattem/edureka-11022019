package Day4;


import org.openqa.selenium.chrome.ChromeDriver;

public class workingWithChrome {
	
	ChromeDriver driver;
	
	public void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil.DESKTOP-NS9DBE9\\eclipse-workspace\\libs\\chromedriver-2.46\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
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
