package day7;

// Encapsulations example
public class Bank {
	private int accountNo;
	private String acctHolder;
	private double ammount;

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getAcctHolder() {
		return acctHolder;
	}

	public void setAcctHolder(String acctHolder) {
		this.acctHolder = acctHolder;
	}

	public double getAmmount() {
		return ammount;
	}

	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}

	@Override
	public String toString() {
		return "Bank accountNo=" + accountNo + ", acctHolder=" + acctHolder + ", ammount=" + ammount + "";
	}

}
