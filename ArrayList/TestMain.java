package com.pratian.assignment1;

import java.util.ArrayList;

public class TestMain {

	public static void main(String[] args) {
		
		ArrayList<Account> accountArr = new ArrayList<Account>();
		
		Account account1 = new Account(1001, "kumar", 25000);
		Account account2 = new Account(1002, "shanthi", 6000);
		Account account3 = new Account(1003, "kavya", 22000);
		Account account4 = new Account(1004, "Mohan", 5000);
		Account account5 = new Account(1005, "Dinesh", 29000);
		
		accountArr.add(account1);
		accountArr.add(account2);
		accountArr.add(account3);
		accountArr.add(account4);
		accountArr.add(account5);
		
		BankApp app = new BankApp();
		System.out.println(app.checkEquality(accountArr));

	}

}
