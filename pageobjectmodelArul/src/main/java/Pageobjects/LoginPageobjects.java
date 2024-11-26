package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageobjects {
	
	// username password submitbutton
	
	//without using findelement but using find by and also simplified code
	
	 
	  public static WebElement email;
	  
	  @FindBy(how = How.ID ,using = "password")
	  public static WebElement Pass;
	  
	  
	  @FindBy(id = "submitBTN")
	  public static WebElement submit;
	  
	  
	  
	  //Basic code
	
/*	public static WebElement username(ChromeDriver driver) {
		
		driver.findElement(By.id("email")).sendKeys("user@phptravels.com");
		return null;
		
	}
	
	public static WebElement password(ChromeDriver driver) {
		
		driver.findElement(By.id("password")).sendKeys("demouser");
		return null;
		
	}
	
	public static  WebElement submitbutton(ChromeDriver driver) {
		
		driver.findElement(By.id("submitBTN")).click();
		return null;*/
		
	}


