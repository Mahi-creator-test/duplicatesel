package com.lao.javalearning;

public class employeeNonparameterized {
	
	
	int empid;
	String empname;
	
	//Non parameterized constructor
	public employeeNonparameterized(){
		
		empid=5;
		empname="mahi";
		System.out.println("Employee object is created");
		
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		employeeNonparameterized NP=new employeeNonparameterized();
		System.out.println(NP.empid);
		System.out.println(NP.empname);
		

	}

}
