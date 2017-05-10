package com.wipro.bank.assessment;

import java.util.ArrayList;
import java.util.List;

import com.wipro.bank.entity.Account;

public class App 
{
public static final List<Account> accounts=new ArrayList<Account>();
	
	public void add(Account a)
	{
		accounts.add(a);
		
	}
	public Account getAccountDetailsByID(int id)
	{
		Account result=null;
		for(int i=0;i<accounts.size();i++)
		{
		//	System.out.println("i :"+ i + "id :" + id);
			//System.out.println("data :" + accounts.get(i).getAccountID());
			if(accounts.get(i).getAccountID()==id)
			{
				//System.out.println("1 :"+ result);
				result = accounts.get(i);
			}
		}
		
		return result;
	
	}


}