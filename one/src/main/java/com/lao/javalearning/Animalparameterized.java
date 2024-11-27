package com.lao.javalearning;

public class Animalparameterized {
	
	String Animal_name;
	String Animal_type;
	
	
	Animalparameterized(String name , String type){
		
		Animal_name=name;
		Animal_type=type;
		
		
	}
	
	public void animaldetails() {
		
		
		System.out.println("Aninal name is" +Animal_name);
		System.out.println("Aninal type is" +Animal_type);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animalparameterized AP=new Animalparameterized("SNAKE", "VENOMOUS");
		AP.animaldetails();
		Animalparameterized AP2=new Animalparameterized("DUCK", "nON-VENOMOUS");
		AP2.animaldetails();
		

	}

}
