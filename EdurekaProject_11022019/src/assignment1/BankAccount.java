package assignment1;

public class BankAccount {

	private int Acct_No;
	int Acct_Bal;
	private String Acc_Name;
	private String email;
	private int Ph_No;
	int Deposit_Amt;
	int Withdrawal_Amt;
	
	public int getAcct_No(int Acct_No) {
		return Acct_No;
	}

	public String getAcc_Name(String Acc_Name) {
		return Acc_Name;
	}

	public String getEmail(String email) {
		return email;
	}

	public int getPh_No(int Ph_No) {
		return Ph_No;
	}

	public int Deposit()	{
		int Net_Balance_Post_Deposit = Acct_Bal + Deposit_Amt;
		return Net_Balance_Post_Deposit;
	}
	
	public int Withdrawal() {
		int Net_Balance_Post_Withdrawal = Acct_Bal - Withdrawal_Amt;
		if (Net_Balance_Post_Withdrawal <= 500) {
			System.err.println("Minimum Balance Rule Violated. Hence cannot withdraw");
		}
		return Net_Balance_Post_Withdrawal;
	}
}


