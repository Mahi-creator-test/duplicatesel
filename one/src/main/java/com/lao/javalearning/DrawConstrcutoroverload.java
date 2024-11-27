package com.lao.javalearning;

public class DrawConstrcutoroverload {
	
	
	String myname;
	
	
	DrawConstrcutoroverload(){
		
		
		System.out.println("without argument");
		
	}
	
	DrawConstrcutoroverload(String name){
		
		myname=name;
		
		System.out.println("with parameter "+ myname);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DrawConstrcutoroverload DC=new DrawConstrcutoroverload();
		DrawConstrcutoroverload DC1=new DrawConstrcutoroverload("mahi");

	}

}
