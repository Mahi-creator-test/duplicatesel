package Keyword;

import net.bytebuddy.implementation.bind.annotation.Super;

public class superkeyword2 extends SuperKeyword{
	
	
	
	 //super keyword refers to the immediate parent class
	  int a=80;
	
	
	  public void output() {
		  
		  
		  System.out.println(a);
		  System.out.println(super.a);
	  }
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		superkeyword2 word2=new superkeyword2();
		word2.output();

	}

}
