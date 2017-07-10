package com.paran.exception;

public class Bank {
	public static void main(String[] args){
		BankAccount mike = new BankAccount("Mike", "K01-456", "110-456-789",30000L);
		long amount = 40000L;
		System.out.println("예금액 : "+ mike.balance);
		System.out.println("출금액 : "+ amount);
		try{
			System.out.println("출금완료\n잔액 : "+mike.withdraw(amount));
		}catch(BalanceNotEnoughException e){
			System.out.println("출금실패\n잔액이 부족합니다");
		}
	}
}

class BankAccount {
	private AccountHolder owner;
	long balance;
	
	public long withdraw(long amount) throws BalanceNotEnoughException{
		if ( balance - amount < 0 ){
			throw new BalanceNotEnoughException("잔액 부족");
		}
		balance = balance - amount;
		return balance;
	}

	public void deposite(long amount){
		balance = balance + amount;
	}
	public BankAccount(String ownerName, String ownerId, String accountNo, long balance){
		this.setOwner(new AccountHolder(ownerName,ownerId,accountNo));
		this.balance = balance;
	}
	
	public AccountHolder getOwner() {
		return owner;
	}
	public void setOwner(AccountHolder owner) {
		this.owner = owner;
	}
}

class AccountHolder{
	String ownerName;
	String ownerId;
	String accountNo;
	public AccountHolder(String ownerName, String ownerId, String accountNo){
		this.ownerName = ownerName;
		this.ownerId = ownerId;
		this.accountNo = accountNo;
	}
}

class BalanceNotEnoughException extends Exception{
	public BalanceNotEnoughException(){
		super();
	}


	public BalanceNotEnoughException(String message){
		super(message);
	}


}