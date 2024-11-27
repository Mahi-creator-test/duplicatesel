package org.psts.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.psts.pages.LoginPage;
import org.selenium.base.Letcodebase;
import org.testng.annotations.Test;

public class TC001Login extends Letcodebase {
	
	
	@Test
	public void logintest() {
		
		
		LoginPage lp=new LoginPage();
		boolean usernameLabel=lp.getusernameLabel();
	    assertEquals(usernameLabel, true);
	    
	    boolean PasswordLabel=lp.getPasswordLabel();
	    assertTrue(PasswordLabel);
		
		new LoginPage()
		.enterusername("Admin")
		.enterusername("Admin@123")
		.ClicksubmitButton();
	
		
		
		
		
		
		
		
	}

}
