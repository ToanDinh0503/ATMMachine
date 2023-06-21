package ATIMmanament;
import java.util.Date;
import java.util.Scanner;
public class Accounts {
	private String user_name;
	private String pass_word;
	private double balance = 0;
	private double deposit = 0;
	private double withdraw = 0;
	
	Accounts(){
		
	}
	Accounts(String user_name,String pass_word,double balance)
	{
		this.user_name=user_name;
		this.pass_word = pass_word;
		this.balance = balance;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPass_word() {
		return pass_word;
	}
	public void setPass_word(String pass_word) {
		this.pass_word = pass_word;
	}

	public void Deposit(double deposit) {
		balance += deposit;
	}
	public void Withdraw(double withdraw) {
		if(balance >= withdraw)
		{
			balance -= withdraw;
		}
	}
	public double getBalance() {
		return balance;
	}
	
}
