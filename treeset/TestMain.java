package com.pratian.treeset;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class TestMain {

	public static void main(String[] args) {
		
		TreeSet<Account> account = new TreeSet<Account>();
		
		
		Account account1 = new Account(1, "Ajai", 2000);
		Account account2 = new Account(2, "Crocier",2300);
		Account account3 = new Account(3, "Vino", 2400);
		
		account.add(account1);
		account.add(account2);
		account.add(account3);
	    
	    
		System.out.println("1.Sort Account by Id:");
		System.out.println("2:Sort Account by Name:");
		System.out.println("3:Sort Account by Balance");
		Scanner sc = new Scanner(System.in);
		int i=sc.nextInt();
		switch(i) {
		
		case 1:
			SortAccountId byId = new SortAccountId();
			Collections.sort(account, byId);
			
			break;
		case 2:
			SortName byName = new SortName();
			Arrays.sort(account, byName);
			System.out.println(account);
			break;
		case 3:
			SortBalance byBalance = new SortBalance();
			Arrays.sort(account, byBalance);
			System.out.println(account);
			break;
		}
	

	}

}
