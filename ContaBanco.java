package entities2;

public class ContaBanco {
	
	private int numberAccount;
	private String nameAccount;
	private double initialDeposit;
	
	public ContaBanco() {
		
	}
	
	
	public ContaBanco(int numberAccount, String nameAccount) {
		super();
		this.numberAccount = numberAccount;
		this.nameAccount = nameAccount;
	}


	public ContaBanco(int numberAccount, String nameAccount, double initialDeposit) {
		super();
		this.numberAccount = numberAccount;
		this.nameAccount = nameAccount;
		this.initialDeposit = initialDeposit;
	}


	public int getNumberAccount() {
		return numberAccount;
	}



	public String getNameAccount() {
		return nameAccount;
	}
	
	public void setNameAccount(String name) {
		this.nameAccount = name;
	}




	public double getInitialDeposit() {
		return initialDeposit;
	}


	public void setInitialDeposit(double initialDeposit) {
		this.initialDeposit = initialDeposit;
	}

	public void deposit(double deposit) {
		this.initialDeposit += deposit;
	}
	
	public void withdraw(double withdraw) {
		this.initialDeposit = this.initialDeposit - withdraw - 5;
	}

	@Override
	public String toString() {
		return "\nNumero da conta: " 
				+numberAccount 
				+ "\nNome da conta: " 
				+ nameAccount 
				+ "\nSaldo da conta: "
				+ initialDeposit
				+ "\n";
	
	
	}
	

}
