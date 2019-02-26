package day4;

public class demoWorkingWithChrome {

	public static void main(String[] args) {
		
		workingWithChrome wc = new workingWithChrome();
				
		wc.invokeBrowser();
		
		wc.navigateCommands();
		
		System.out.println("Title of the webpage is "+wc.pageTitle());
		
		wc.closeBrowser();

	}

}
