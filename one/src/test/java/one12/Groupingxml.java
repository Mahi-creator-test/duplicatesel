package one12;

import org.testng.annotations.Test;

public class Groupingxml {
	
	
	   @Test(groups = {"smoke" , "Regression"})
       public void signup() {
		
		
		System.out.println("signup successfull");
	}
	   @Test(groups = "smoke")
       public void Login() {
   		
   		
   		System.out.println("Log in successfull");
   	}
	   @Test(groups = "mahi")
       public void Purchase() {
   		
   		
   		System.out.println("Purchase successfull");
	
       }           
	   @Test(groups = "smoke")
       public void Payment() {
   		
   		
   		System.out.println("Payment successfull");
   	}
	/*
	 * @Test(groups = "Regression") public void Signout () {
	 * 
	 * 
	 * System.out.println("Signout successfull"); }
	 */
   	
	
	
	

}
