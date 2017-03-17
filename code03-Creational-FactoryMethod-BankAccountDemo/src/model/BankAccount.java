package model;

public interface BankAccount {
	
	void openAccount();
	void checkBalance();
	void depositAccount(double amount);
	void withdrawAccount(double amount);
	void closeAccount();
}
