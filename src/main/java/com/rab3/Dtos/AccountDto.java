package com.rab3.Dtos;

public class AccountDto {
	
	private Integer id;
	private String accountType;
	private String totalBalance;
	private String accountNum;
	private String routingNum;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getTotalBalance() {
		return totalBalance;
	}
	public void setTotalBalance(String totalBalance) {
		this.totalBalance = totalBalance;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getRoutingNum() {
		return routingNum;
	}
	public void setRoutingNum(String routingNum) {
		this.routingNum = routingNum;
	}
	
	

}
