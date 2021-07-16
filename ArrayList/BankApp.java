package com.pratian.assignment1;

import java.util.ArrayList;

public class BankApp {
	
	public int checkEquality(ArrayList<Account> accountArr) {
		int count = 0;
		for(int i=0;i<(accountArr.size()- 1);i++) {
			for(int j=i+1;j<accountArr.size();j++) {
				if(accountArr.get(i).getBalance() == accountArr.get(j).getBalance())
					count+=2;
			}
		}
		return count;
		
	}

}
