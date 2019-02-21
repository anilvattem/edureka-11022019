package assignment2;

public class DemoGmailAssignment {

	public static void main(String[] args) {
		
		GmailAssignment login = new GmailAssignment();
		
		login.invokeBrowser();
		
		login.gmailLoginID("anil.vattem@gmail.com");
		
		login.gmailPwd("");
		
		login.composeMail("anil.vattem@gmail.com", "Test subject", "Test content");

	}

}
