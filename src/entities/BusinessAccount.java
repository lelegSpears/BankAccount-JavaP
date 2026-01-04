package entities;

public class BusinessAccount extends Account{
	private Double loanLimit;
	
	public BusinessAccount() {
		
	}

	public BusinessAccount(Integer numero, String holder, Double balance, Double loanLimit) {
		super(numero, holder, balance);
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if (amount <=loanLimit) {
			Balance += amount - 10;
		}
	}
	
}
