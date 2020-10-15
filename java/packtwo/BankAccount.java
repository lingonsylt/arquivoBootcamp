public class BankAccount{

	private int
	account,
	branch;

	private String
	accountType;

	private float
	balance;
	
	public BankAccount(int account, int branch, String accountType, int balance){
		this.account = account;
		this.branch = branch;
		this.accountType = accountType;
		this.balance = balance;
	}

	public int getAccount(){
		return account;
	}

	public int getBranch(){
		return branch;
	}

	public String getAccountType(){
		return accountType;
	}

	public float getBalance(){
		return balance;
	}

	public void setAccount(int account){
		this.account = account;
	}

	public void setBranch(int branch){
		this.branch = branch;
	}

	public void setAccountType(String accountType){
		this.accountType = accountType;
	}

	public void setBalance(int balance){
		this.balance = balance;
	}

	public void accountStatus(){
		System.out.printf("Conta: %d. Agência: %d. Tipo de conta: %s. Saldo: R$%.2f.\n", account, branch, accountType, balance);
	}
}
