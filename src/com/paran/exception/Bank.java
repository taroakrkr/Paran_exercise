package com.paran.exception;

public class Bank {
	public static void main(String[] args){
		BankAccount mike = new BankAccount("Mike", "K01-456", "110-456-789",30000L);
		long amount = 40000L;
		System.out.println(mike.getOwner().ownerName+"고객님 예금액 : "+ mike.balance+"원");
		System.out.println("요청 출금액 : "+ amount+"원");
		try{
			System.out.println("출금완료\n출금 : "+mike.withdraw(amount)+"원");
			System.out.println("잔액 : "+ mike.balance+"원");
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
		return amount;
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