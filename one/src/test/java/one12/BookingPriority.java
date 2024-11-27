package one12;

import org.testng.annotations.Test;

public class BookingPriority {
	
	@Test(priority = 2)
	public void signup() {
		
		
		System.out.println("signup successfull");
	}
	@Test(priority = 2)
    public void Login() {
		
		
		System.out.println("Log in successfull");
	}
	@Test(priority = 1)
    public void Purchase() {
		
		
		System.out.println("Purchase successfull");
	}
	
	
	
	

}
