package view;

import model.*;

public class Display {
	
	public static void printAccount(UserAccount user){
		
		if(user instanceof BPIUserAccount){
			BPIUserAccount bpi = (BPIUserAccount) user;
			
			bpi.accountID = "1234-567-8900";
			bpi.firstName = "Dirk";
			bpi.lastName = "Nowitzki";
			bpi.openAccount();
			bpi.depositAccount(800);
			bpi.checkBalance();
			bpi.withdrawAccount(200);
			bpi.closeAccount();
		}else if(user instanceof BDOUserAccount){
			BDOUserAccount bpi = (BDOUserAccount) user;
			
			bpi.accountID = "8900-567-1234";
			bpi.firstName = "Krid";
			bpi.lastName = "Harden";
			bpi.openAccount();
			bpi.depositAccount(800);
			bpi.checkBalance();
			bpi.withdrawAccount(200);
			bpi.closeAccount();
		}
	}
}
