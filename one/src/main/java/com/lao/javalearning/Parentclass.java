package com.lao.javalearning;

public class Parentclass extends Mainparent {
	
	
	int a=10;
	
	
	public Parentclass(){
		
		int a=90;
		this.a=a;
		
		System.out.println("I am parent class");
		System.out.println(a);
		
	;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parentclass pc=new Parentclass();
		
		

	}

}
