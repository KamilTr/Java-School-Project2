package del1_del2;

//*******************************************************
//Account.java
//
//A bank account class with methods to deposit to, withdraw from,
//change the name on, charge a fee to, and print a summary of the account.
//*******************************************************
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Account implements Comparable<Account>{
	private double balance;
	private String acctNum;

	// ----------------------------------------------
	// Constructor -- initializes balance, owner, and account number
	// ----------------------------------------------
	public Account(String number, double initBal) {
		balance = initBal;
		acctNum = number;
	}

	// ----------------------------------------------
	// Checks to see if balance is sufficient for withdrawal.
	// If so, decrements balance by amount; if not, prints message.
	// ----------------------------------------------
	public String withdraw(double amount) {
		String info = "Insufficient funds";
		if (balance >= amount) {
			balance = balance - amount;
			info = "Succeeded, the new balance is : " + balance;
		}

		return info;
	}

	// ----------------------------------------------
	// Adds deposit amount to balance.
	// ----------------------------------------------
	public String deposit(double amount) {
		String info = "";
		if (amount < 0)
			info = " Wrong amount";
		else {
			balance = balance + amount;
			info = " Succeeded, the new balance is: " + balance;
		}

		return info;
	}

	// ----------------------------------------------
	// Returns balance.
	// ----------------------------------------------
	public double getBalance() {
		return balance;
	}

	// ----------------------------------------------
	// Returns a string containing the name, account number, and balance.
	// ----------------------------------------------
	public String toString() {
		return " Numer: " + acctNum + " Balance: " + balance;
	}

	// ----------------------------------------------
	// Returns accoutn number.
	// ----------------------------------------------

	public String getAcctNum() {
		return acctNum;
	}

	public boolean equals(Object other) {
		// detta skall du g�ra
		return true;
	}

	
	public ArrayList<Account> sort(ArrayList<Account> list) {
		ArrayList<Account> temp = list;
		int added = 0;
		for(int i = 0; i < list.size(); i++){
			//if(Comparator.(list.get(i)));
		}
		
		
		return list;
	}

	
	
	public static void main(String[] arg) {
		ArrayList<Account> lista = new ArrayList<Account>();
		Account a = new Account("1111111111", 1000);
		// skapa account och l�gg den i listan samtidigt
		lista.add(new Account("99", 2000));
		lista.add(new Account ("12", 1337));
		lista.add(new Account ("11", 7777));
		
		
		// f�r att anropa metod skall f�rst objektet returneras fr�n listan
		// det g�rs med metoden get();
		// h�r nedan direkt anrop
		lista.get(1).deposit(4000);

		// h�r nedan f�rst anrop av get() sedan,
		Account konto = lista.get(1);
		Collections.sort(lista);
		//System.out.println(konto.deposit(300));
		System.out.println(lista);
	}

	@Override
	public int compareTo(Account o) {
		// TODO Auto-generated method stub
		return 0;
	}
}