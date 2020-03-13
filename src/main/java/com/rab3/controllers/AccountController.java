package com.rab3.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rab3.Dtos.AccountDto;
import com.rab3.services.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@GetMapping(value="capitalOne")
	public List<AccountDto> getAllAccountInfo() {
	
	
	
	return accountService.getAllAccountInfo();
	}
}
