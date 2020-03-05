package com.capg.wallet.usermgt.dao;

import java.util.Map;

import org.junit.jupiter.api.*;

import com.capg.wallet.usermgt.entities.*;

public class WalletAccountDaoImplTest {
	WalletAccountDaoImpl dao;
	
	@BeforeEach
	public void setup()
	{
		dao=new WalletAccountDaoImpl();
	}
	
	@AfterEach
	public void clear()
	{
		dao=null;
	}

	@Test
	public void testAddAccount_1()
	{
		WalletUser walletUser = new WalletUser();
		walletUser.setUserId(1);
		WalletAccount walletAccount = new WalletAccount();
		UserAndAccount user = new UserAndAccount(walletUser, walletAccount);
		Map<Integer,UserAndAccount> store = WalletAccountDaoImpl.store;
		store.put(walletUser.getUserId(), user);
		dao.addAccount(walletUser);
		boolean flag = store.isEmpty();
		Assertions.assertEquals(false, flag);
		
	}
	
	@Test
	public void testRemoveAccount_1()
	{
		WalletUser walletUser = new WalletUser();
		walletUser.setUserId(1);
		WalletAccount walletAccount = new WalletAccount();
		UserAndAccount user = new UserAndAccount(walletUser, walletAccount);
		Map<Integer,UserAndAccount> store = WalletAccountDaoImpl.store;
		store.put(walletUser.getUserId(), user);
		dao.removeAccount(walletUser.getUserId());
		boolean isEmpty = store.isEmpty();
		Assertions.assertEquals(true, isEmpty);
	}
	
	@Test
	public void testFindWalletById()
	{
		WalletUser walletUser = new WalletUser();
		walletUser.setUserId(1);
		WalletAccount walletaccount=new WalletAccount();
		UserAndAccount user=new UserAndAccount(walletUser,walletaccount);
		Map<Integer,UserAndAccount> store = WalletAccountDaoImpl.store;
		walletaccount.setAccountId(1);
		store.put(walletUser.getUserId(), user);
		WalletAccount account=user.getAccount();
		WalletAccount result=dao.findwalletId(1);
		Assertions.assertEquals(1,result.getAccountId());
		
	}
	
	@Test
	public void testAddAmount()
	{
		int userId=123;
		int accountId=1234;
		double balance=50;
		double amount=10;
		
		WalletUser walletuser=new WalletUser();
		WalletAccount walletaccount=new WalletAccount();
		
		walletaccount.setAccountId(accountId);
		walletaccount.setAccountBalance(balance);
		Map<Integer,UserAndAccount> store = WalletAccountDaoImpl.store;
		UserAndAccount user=store.get(userId);
		//UserAndAccount user=new UserAndAccount(walletuser,walletaccount);
		
		WalletAccount result=dao.addAmount(walletuser, amount);
		
		//Assertions.assertNotNull(result);
		Assertions.assertEquals(balance, result.getAccountBalance());
		
	}
	
	@Test
	public void testDeductAmount()
	{
		int accountId=1234;
		double balance=50;
		double amount=10;
		WalletUser user=new WalletUser();
		WalletAccount account=new WalletAccount();
		account.setAccountId(accountId);
		account.setAccountBalance(balance);
		WalletAccount result=dao.deductAmount(user, amount);
		Assertions.assertNotNull(result);
		Assertions.assertNotEquals(balance, result.getAccountBalance());
		
	}
	
	@Test
	public void testTransferFund()
	{
		int senderAccountId=1234;
		int receiverAccountId=3456;
		double balance=50;
		double amount=10;
		WalletUser senderuser=new WalletUser();
		WalletUser receiveruser=new WalletUser();
		WalletAccount account=new WalletAccount();
		account.setAccountId(senderAccountId);
		account.setAccountId(receiverAccountId);
		account.setAccountBalance(balance);
		dao.transferfund(senderuser,receiveruser, amount);
		
		
	}
}
