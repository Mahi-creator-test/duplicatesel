package com.lao.javalearning;

public class BankAccount {
	
	
	
	
	Long Accountnumber=123456789l;
	
	String name= "Mahi";
	
	int Balance=3456;
	
	
	
	public void mybalance() {
		
		
		
		System.out.println("My balance is " + Balance);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount ba=new BankAccount();
		ba.mybalance();
		

	}

}
