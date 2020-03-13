package com.rab3.utils;

import java.util.ArrayList;
import java.util.List;

import com.rab3.Dtos.AccountDto;

public class InMemoryDataBase {

	public static List<AccountDto> accountList;
	
	static {
		accountList = new ArrayList<AccountDto>();
		
		AccountDto a1 = new AccountDto();
		a1.setAccountType("Checking");
		a1.setAccountNum("245124574");
		a1.setRoutingNum("45744541");
		a1.setTotalBalance("15000");
		
		AccountDto a2 = new AccountDto();
		a2.setAccountType("saving");
		a2.setAccountNum("8545745145");
		a2.setRoutingNum("95784512");
		a2.setTotalBalance("5000");
		
		
		accountList.add(a1);
		accountList.add(a2);
	}
}
