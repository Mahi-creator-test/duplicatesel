package one12;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

public class AlwaysRunDescriptionEnable {
	
	
	@Test(description = "Lorem ipsum dummy text" , enabled = false)
    public void signup() {
		
		
		System.out.println("signup successfull");
	}
    
	

  @Test public void Login() {
  
  
  System.out.println("Login successfull");
  
  throw new NoSuchElementException("Element missing"); }
  
  
  @Test(dependsOnMethods = "one12.AlwaysRunDescriptionEnable.Login" , alwaysRun = true) 
  public void purchase() {
  
  
  System.out.println("Purchase successfull"); }
  
  
  
  
  
  
  
  
  }
 