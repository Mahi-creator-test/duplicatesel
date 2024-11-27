package com.lao.javalearning;

public class ReturnTypes {
	
	
	
	   public Long collectedamount=100000000000000000l;
	
	
	   public Long getamountformhim() {
		   
		   
		   System.out.println("I got the amount " +collectedamount);
		return collectedamount;
		  
		   
	   }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReturnTypes RT=new ReturnTypes();
		Long h=RT.getamountformhim();
		System.out.println("got it" +h);
		
		

	}

}
