package com.lao.javalearning;

public class StaticMethods {
	
	
	public static void method1() {
		
		
		
		System.out.println("it is static method");
	}
	
	public void method2() {
		
		System.out.println("it is Non-static method");
		
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethods methods=new StaticMethods();
		methods.method2();
		method1();

	}

}
