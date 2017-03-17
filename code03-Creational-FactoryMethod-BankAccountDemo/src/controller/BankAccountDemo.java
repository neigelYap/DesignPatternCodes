package controller;
import view.Display;
import factory.BankAccountFactory;
import model.*;
public class BankAccountDemo {

	public static void main(String[] args) {
		
		UserAccount userBankAccount = BankAccountFactory.getBankAccountFactory("bdo");
		Display.printAccount(userBankAccount);
		
		userBankAccount = BankAccountFactory.getBankAccountFactory("bpi");
		Display.printAccount(userBankAccount);

	}

}
