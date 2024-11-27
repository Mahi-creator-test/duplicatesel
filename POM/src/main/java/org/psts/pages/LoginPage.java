package org.psts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.selenium.base.Letcodebase;

public class LoginPage extends Letcodebase {
	
	
	//RemoteWebDriver driver=null;
	
	//Locators
	
	  
	  public boolean getusernameLabel() {
		
		  return driver.findElement(By.xpath("/html/body/div/form/div/div/div[1]/div/div[2]/div/div/div/div/div[2]/div[1]/span")).isDisplayed();
		  }
	

	  public boolean getPasswordLabel() {
		  
		  return driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div/div[1]/div/div[2]/div/div/div/div/div[2]/div[2]/span")).isDisplayed();
		  }
	
	
	
	
	//Actions
	/**
	 * @description - get the data from the user and type on the username field
	 * @param username - pass the user to be login
	 * @return 
	 */
	public LoginPage enterusername(String username){
		
		driver.findElement(By.id("email")).sendKeys(username);
		return this;
		
		}
	
	public LoginPage enterPassword(String Password){
		
		driver.findElement(By.id("password")).sendKeys(Password);
		return this;
		
	}
    public Dashboard ClicksubmitButton(){
    	
    	 driver.findElement(By.xpath(
				  "//*[@id=\"root\"]/form/div/div/div[1]/div/div[2]/div/div/div/div/button")).
				  click();
    	 return new Dashboard();
		
	}
    
	/*
	 * public void ForgotPassword(){
	 * 
	 * driver.findElement(By.
	 * cssSelector(".MuiTypography-root MuiTypography-body1 css-1ji7djn")).click();
	 * 
	 * }
	 */
   public void login(String username , String Pass) {
	   
	   enterusername(username);
	   enterPassword(Pass);
	   ClicksubmitButton();
   }
}
