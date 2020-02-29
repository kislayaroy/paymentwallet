package com.capg.wallet.transactionmgt.dao;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import com.capg.wallet.transactionmgt.entities.WalletTransaction;
import com.capg.wallet.usermgt.entities.WalletAccount;

public class WalletTransactionDaoImpl implements IWalletTransactionDao {
	static Map<Integer,WalletTransaction> transactionStore=new HashMap<>();
	private int generateId;
	public int generateId() {
		generateId++;
		return generateId;
	}
	private LocalDateTime dateoftransaction;
	
	@Override
	public WalletTransaction addAmount(WalletAccount  account, double amount) {
			String desc=amount+" added";			
			int transactionId=generateId();
			WalletTransaction transaction=new WalletTransaction();
			transaction.setTransactionid(transactionId);
			transaction.setDescription(desc);
			transaction.setDateoftransaction(dateoftransaction.now());
			transaction.setAmount(amount);
	        transaction.setAccountbalance(account.getAccountBalance());		
	        transactionStore.put(transactionId, transaction);
	        return transaction;
			
	}
	
	@Override
	public WalletTransaction deductAmount(WalletAccount account, double amount) {
		String desc=amount+" deducted";	
		WalletTransaction transaction=new WalletTransaction();
		int transactionId=generateId();
		transaction.setTransactionid(transactionId);
		transaction.setDescription(desc);
		transaction.setDateoftransaction(dateoftransaction.now());
		transaction.setAmount(amount);
		transaction.setAccountbalance(account.getAccountBalance());
		transactionStore.put(transactionId, transaction);
		return transaction;
	}
	

	@Override
	public void tranferAmount(WalletAccount account_from, WalletAccount account_to,double amount) {
		addAmount(account_to,amount);
		deductAmount(account_from,amount);
	}
}
