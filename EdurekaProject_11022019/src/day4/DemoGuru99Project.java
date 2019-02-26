package day4;

public class DemoGuru99Project {

	public static void main(String[] args) {
		
		Guru99Project guru = new Guru99Project();
		
		guru.invokeBrowser();
		
		guru.login("mngr179054", "esYnAqu");
		
		guru.addCustomer();
		
		String custID = guru.getCustID();
		
		guru.addAccount(custID, "Savings");

	}

}
