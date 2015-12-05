

import BankAcc.*;
import customers.*;

public class BankStartup {
	public static void main(String[] args){
	Companie companie = new Companie("Gen'Soft","Montana");
	Individual individual = new Individual("Petko","Sofia");
	
	Deposit deposit = new Deposit(256.36,2.5,individual);
	Loan loan = new Loan(51235.3, 4.25, companie);
	
	System.out.println(loan.getBalance());
	loan.deposit(250);
	
	System.out.println(deposit.getBalance());
	deposit.withDraw(160);
   System.out.println( deposit.calcInterestAmount(6));
   System.out.println(loan.getCustomer());
	
	}
}