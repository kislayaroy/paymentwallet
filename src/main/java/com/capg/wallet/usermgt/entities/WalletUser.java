package com.capg.wallet.usermgt.entities;


public class WalletUser {
	int userId;
	String userName,password,phoneNumber,loginName;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	
	public WalletUser()
	{}
	
	public WalletUser(String userName,String password,String phoneNumber,String loginName)
	{
		this.userName=userName;
		this.password=password;
		this.phoneNumber=phoneNumber;
		this.loginName=loginName;
	}

	@Override
	public int hashCode()
	{
		return userId;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		
		return true;
	}
	
}
