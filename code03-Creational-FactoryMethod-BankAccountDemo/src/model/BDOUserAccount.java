package model;

public class BDOUserAccount extends UserAccount {
	
	public BDOUserAccount(){
		this.bankName = "BDO";
	}

	@Override
	public void openAccount() {
		System.out.println(accountID + " created");
		System.out.println("Free coupons for two at Sogo Hotel");
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
