package ATIMmanament;
import java.util.List;

public class ATMstroring {
	private List<Accounts> accounts;
	

	public void School(List<Accounts> accounts) {
		this.accounts = accounts;
	}
	
	public List<Accounts> getAccounts() {
		return accounts;
	}
	
	public void addAccount(Accounts account) {
		accounts.add(account);
	}
	
	
	
	
	
	
}
