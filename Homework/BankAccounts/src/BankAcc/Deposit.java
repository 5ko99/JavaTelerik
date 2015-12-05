package BankAcc;

import customers.Customer;

public class Deposit extends Bank {
	
	
	
	public Deposit(double balance, double interestRate, Customer customer) {
		super(balance, interestRate, customer);
		// TODO Auto-generated constructor stub
	}

	public  void withDraw(double sum){
		if(getBalance()>=sum){
			balance-=sum;
			System.out.printf("Succsesuful With Draw! \n Sum=%s \n Ammount=%s \n",sum,this.balance);
		}
		else {
			System.out.println("You don't have enought money to Whith Draw");
		}
	}
}
