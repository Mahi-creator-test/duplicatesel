package TestCases;

import static org.testng.Assert.assertEquals;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import CommonFunctions.CommonFunctions;
import Pageobjects.Login_page_objects;
import Pageobjects.Sales_Page_Object;

public class SalesEntry extends CommonFunctions {
	
	String Actual=null;
	
	
	public void login() {
		
		
		
		PageFactory.initElements(driver, Login_page_objects.class);
		
		Login_page_objects.username.sendKeys(prop.getProperty("username"));
		Login_page_objects.Pass.sendKeys(prop.getProperty("Password"));
		Login_page_objects.submit.click();
		
		
		
		}
	
	
	public void menutext() {
		
		
        PageFactory.initElements(driver, Sales_Page_Object.class);
		
		Actual=Sales_Page_Object.salesmenu.getText();
		
		
		
	}
	
	
	
	
	@Test
	public void verifysalesreturn() {
	
		login();
		menutext();
		
		Assert.assertEquals(Actual, "Order Payment Ratio");
		
		
		
		
		
	}

}
