package entities;

public class Account {
	private Integer Numero;
	private String Holder;
	protected Double Balance;
	
	public Account() {

	}

	public Account(Integer numero, String holder, Double balance) {
		Numero = numero;
		Holder = holder;
		Balance = balance;
	}

	public Integer getNumero() {
		return Numero;
	}

	public void setNumero(Integer numero) {
		Numero = numero;
	}

	public String getHolder() {
		return Holder;
	}

	public void setHolder(String holder) {
		Holder = holder;
	}

	public Double getBalance() {
		return Balance;
	}

	public void withdraw(Double amount) {
		Balance -= amount;
	}
	
	public void deposit(Double amount) {
		Balance += amount;
	}
	
	
	
	
	
}
