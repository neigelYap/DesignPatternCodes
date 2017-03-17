package factory;
import model.*;
public class BankAccountFactory {
	
	public static UserAccount getBankAccountFactory(String bankAccount){
		UserAccount account = null;
		
		if(bankAccount.equalsIgnoreCase("BPI")){
			account = new BPIUserAccount();
		}else if(bankAccount.equalsIgnoreCase("BDO")){
			account = new BDOUserAccount();
		}
		
		return account;
	}
}
