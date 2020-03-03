package com.capg.wallet.transactionmgt.dao;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import com.capg.wallet.transactionmgt.entities.WalletTransaction;
import com.capg.wallet.usermgt.entities.WalletAccount;

public class WalletTransactionDaoImpl implements IWalletTransactionDao {
	public static Map<Integer,WalletTransaction> transactionStore=new HashMap<>();
	private int generateId;

	//method for generation of transaction id
	public int generateId() {
		generateId++;
		return generateId;
	}
	
	//method to store the details of credited amount
	@Override
	public WalletTransaction addAmount(WalletAccount  account, double amount) {
			LocalDateTime dateTime=LocalDateTime.now();
			String desc=amount+" added";			
			int transactionId=generateId();
			WalletTransaction transactions=new WalletTransaction();
			transactions.setTransactionid(transactionId);
			transactions.setDescription(desc);
			transactions.setDateoftransaction(dateTime);
			transactions.setAmount(amount);
			transactions.setAccountbalance(account.getAccountBalance());
	        transactionStore.put(transactionId, transactions);
	        return transactions;        
	}
	
	//method to store the details of deducted amount
	@Override
	public WalletTransaction deductAmount(WalletAccount account, double amount) {
		LocalDateTime dateTime=LocalDateTime.now();
		String desc=amount+" deducted";	
		WalletTransaction transactions=new WalletTransaction();
		int transactionId=generateId();
		transactions.setTransactionid(transactionId);
		transactions.setDescription(desc);
		transactions.setDateoftransaction(dateTime);
		transactions.setAmount(amount);
		transactions.setAccountbalance(account.getAccountBalance());
		transactionStore.put(transactionId, transactions);
		return transactions;
	}
	
	//method to store the information of transaction from the user account 
	@Override
	public void tranferAmount(WalletAccount account_from, WalletAccount account_to,double amount) {
		addAmount(account_to,amount);
		deductAmount(account_from,amount);
		
	}
}
