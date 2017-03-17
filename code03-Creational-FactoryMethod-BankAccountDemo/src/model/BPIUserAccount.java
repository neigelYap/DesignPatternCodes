package model;

public class BPIUserAccount extends UserAccount {
	
	public BPIUserAccount(){
		this.bankName = "BPI";
	}

	@Override
	public void openAccount() {
		System.out.println(accountID + " created");

	}

	@Override
	public void checkBalance() {
		System.out.println("Bank account balance of " + firstName + " " + lastName + " is P" + amount);

	}

	@Override
	public void depositAccount(double amount) {
		System.out.println(this.bankName + "bank account of " + firstName + " " + lastName + " deposited an initial amount of P" + amount);
		this.amount += amount;
	}

	@Override
	public void withdrawAccount(double amount) {
		if(this.amount >= amount){
			System.out.println("Bank account of " + firstName + " " + lastName + " withdrew an initial amount of P" + amount);
			this.amount -= amount;
		}else{
			System.err.println("Cannot withdraw");
		}

	}

	@Override
	public void closeAccount() {
		this.amount = 0;
		System.out.println(accountID + " terminated");

	}

}
