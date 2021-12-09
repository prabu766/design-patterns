package com.pattern.builder;

/**
 * 
 * @author prabhuddha.bhashitha
 * This class should be an immutable class 
 */
public class BankAccount {

	private final int accountNo;//mandatory
	private final String owner;//mandatory
	private final double balance;//optional
	private final double interestRate;//optional
	private final String branch;//optional
	private final String email;//optional
	
	//constructor must be private here, so objects must be created via builder class
	private BankAccount(Builder accountBuilder) {
		super();
		this.accountNo = accountBuilder.accountNo;
		this.owner = accountBuilder.owner;
		this.balance = accountBuilder.balance;
		this.interestRate = accountBuilder.interestRate;
		this.branch = accountBuilder.branch;
		this.email = accountBuilder.email;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public String getOwner() {
		return owner;
	}

	public double getBalance() {
		return balance;
	}

	public double getInterestRate() {
		return interestRate;
	}
	
	public String getBranch() {
		return branch;
	}
	
	public String getEmail() {
		return email;
	}

	
	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", owner=" + owner + ", balance=" + balance + ", interestRate="
				+ interestRate + ", branch=" + branch + ", email=" + email + "]";
	}


	public static class Builder {
		
		//include all the fields used in main class( BankAccount)
		private final int accountNo;
		private final String owner;
		private double balance;
		private double interestRate;
		private String branch;
		private String email;
		
		//since accountNo and owner mandatory keep the default constructor with those 2 fields
		Builder(int accountNo,String owner){
			this.accountNo = accountNo;
			this.owner = owner;
		}
		
		Builder inBranch(String branch) {
			this.branch = branch;
			return this;
		}
		
		Builder withBalance(double balance) {
			this.balance = balance;
			return this;
		}
		
		Builder withInterestRate(double interestRate) {
			this.interestRate = interestRate;
			return this;
		}
		
		Builder email(String email) {
			this.email = email;
			return this;
		}
		
		public BankAccount build() {
			//can do object state validation also
			//validate();
			return new BankAccount(this);
		}
		
	}

	

	
}