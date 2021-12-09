package com.pattern.builder;

/**
 * 1. Builder pattern is a creational design pattern which allows to create a complex object step by step
 * 2. It can be used in situations like
 *    2.1 Class constructor accepts high number of parameters
 *    2.2 To avoid incorrect state of the object
 *    
 * Key things to remember.
 * 1. Created object is an immutable. Thats why you don't any setter methods.
 * 2. Include the static inner class so no need to create an object of the main class to access the builder class
 * 3. The Product class ( in this case BankAccount) should accept the instance of builder. 
 *    Should not accept all parameters, if so it'll be again an issue exist while passing multiple parameters to the constructor
 * 4. We can do object state validation with validate() method in the build class
 * @author prabhuddha.bhashitha
 *
 */
public class BuilderMain {

	public static void main(String[] args) {
		
		BankAccount account = new BankAccount.Builder(1234,"Prabu")
										//set the optional fields if necessary
										.inBranch("Colombo")
										.email("abc@gmail.com")
										.withBalance(190.45).build();
		
		System.out.println(account);
		
	}
}
