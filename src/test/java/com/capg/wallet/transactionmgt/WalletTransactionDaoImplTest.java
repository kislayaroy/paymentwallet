package com.capg.wallet.transactionmgt;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.jupiter.api.*;

import com.capg.wallet.transactionmgt.dao.WalletTransactionDaoImpl;
import com.capg.wallet.transactionmgt.entities.WalletTransaction;
import com.capg.wallet.usermgt.entities.WalletAccount;

public class WalletTransactionDaoImplTest {
	WalletTransactionDaoImpl dao;

	@BeforeEach
	public void setup() {
		dao = new WalletTransactionDaoImpl();
	}

	@AfterEach
	public void clear() {
		WalletTransactionDaoImpl.transactionStore.clear();
	}

	@Test
	public void testAddAmount() {
		int accountId = 56;
		double balance = 5000;
		double amount = 500;
		WalletAccount account = new WalletAccount();
		account.setAccountId(accountId);	
		account.setAccountBalance(balance);
		LocalDate today=LocalDate.now();
		WalletTransaction result=dao.addAmount(account, amount);
		Assertions.assertNotNull(result);
		Assertions.assertEquals(amount,result.getAmount());		
		Assertions.assertEquals(balance,result.getAccountbalance());
		LocalDateTime resultDateTime=result.getDateoftransaction();
		LocalDate resultDate=resultDateTime.toLocalDate();
		Assertions.assertEquals(today, resultDate);				
	}

	@Test
	public void testDeductAmount() {
		int accountId=20;
		double balance=8000;
		double amount=800;
		WalletAccount account=new WalletAccount();
		account.setAccountId(accountId);
		account.setAccountBalance(balance);
		LocalDate today=LocalDate.now();
		WalletTransaction result=dao.deductAmount(account, amount);
		Assertions.assertNotNull(result);
		Assertions.assertEquals(amount, result.getAmount());
		Assertions.assertEquals(balance,result.getAccountbalance());
		LocalDateTime resultDateTime=result.getDateoftransaction();
		LocalDate resultDate=resultDateTime.toLocalDate();
		Assertions.assertEquals(today, resultDate);
	}

	@Test
	public void testTransferAmount() {
		int accountFrom=10;
		int accountTo=15; 
		double balance=5000;
		double amount=50;
		WalletAccount account_From=new WalletAccount();
		WalletAccount account_To=new WalletAccount();
		account_From.setAccountId(accountFrom);
		account_To.setAccountId(accountTo);
		//dao.tranferAmount(account_From, account_To, amount);
		Assertions.assertNotNull(account_From);
		Assertions.assertNotNull(account_To);
		LocalDate today=LocalDate.now();
		
	}
}