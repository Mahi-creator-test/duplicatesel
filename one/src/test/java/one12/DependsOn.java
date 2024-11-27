package one12;

import javax.management.RuntimeErrorException;

import org.testng.annotations.Test;

public class DependsOn {
	
	@Test(priority = 1)
	public void signup() {
		
		
		System.out.println("signup successfull");
	}
	
	
	@Test(dependsOnMethods = "signup" ,priority = -1 )
    public void Login() {
		
		
		System.out.println("Log in successfull");
	}
	
	
	
	
	@Test(dependsOnMethods = "Login")
    public void Purchase() {
		
		
		System.out.println("Purchase successfull");
		throw new RuntimeException();
	}
	
	
	@Test(priority = 2)
    public void Payment() {
		
		
		System.out.println("Payment successfull");
	}
	
	
	@Test(dependsOnMethods = "newone.demo12.display")
    public void Signout	() {
		
		
		System.out.println("Signout successfull");
	}
	
	
}

