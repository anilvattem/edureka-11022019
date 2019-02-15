package Assignment1;

public class DemoBank {

	public static void main(String[] args) {
		BankAccount Account1;
		Account1 = new BankAccount();
		Account1.getAcct_No(100);
		Account1.getAcc_Name("John");
		Account1.getEmail("john@email.com");
		Account1.getPh_No(1012151445);
		Account1.Acct_Bal = 5000;
		Account1.Deposit_Amt = 200;
		Account1.Withdrawal_Amt = 4800;
		int Balance_Post_Deposit = Account1.Deposit();
		System.out.println("Account Balance post Deposit is "+Balance_Post_Deposit);
		int Balance_Post_Withdrawal = Account1.Withdrawal();
		System.out.println("Account Balance post withdrawal is "+Balance_Post_Withdrawal);
		System.out.println("------------------------");
		
	}
}