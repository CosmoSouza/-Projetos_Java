package Application;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		if (amount > withdrawLimit) {
			throw new IllegalArgumentException("Erro: valor excede o limite de saque: ");	
		}
		if (amount > balance) {
			throw new IllegalArgumentException("Erro: saldo insuficiente.");	
		}
		balance -= amount;
	}
	
	public Double getBalance() {
		return balance;
	}

}
