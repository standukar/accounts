package com.rab3.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rab3.Dtos.AccountDto;
import com.rab3.utils.InMemoryDataBase;

@Service
public class AccountService {
	
	public List<AccountDto> getAllAccountInfo() {
		ArrayList<AccountDto> accountsInfoList = new ArrayList<AccountDto>(InMemoryDataBase.accountList);
			
		
		
		return accountsInfoList;
	}

}

