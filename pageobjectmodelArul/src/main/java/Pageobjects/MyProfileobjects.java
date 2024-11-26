package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class MyProfileobjects {
	
	
	  @FindBy(xpath = "//*[@id=\"fadein\"]/main/div/div/div/div[2]/ul/li[3]/a")
	  public  static WebElement clickmyprofileButton;
	  
	  
	  @FindBy(name="address2")
	  public static WebElement Enteraddress2;
	  
	  
	  
	  @FindBy(id = "Password")
	  public  static WebElement updatePass;
	  
	  
	  
	  @FindBy(xpath = "//button[@type='submit']")
	  public  static WebElement clickupdatedetailsbutton;
	
	
	/*
	public  static WebElement clickmyprofileButton(ChromeDriver driver) {
		
		driver.findElement(By.xpath("//*[@id=\"fadein\"]/main/div/div/div/div[2]/ul/li[3]/a")).click();
		return null;
		
		
	}
	
	public static WebElement Enteraddress2(ChromeDriver driver) {
		
		driver.findElement(By.name("address2")).sendKeys("xyz");
		return null;
		
	}
	
	
	public  static WebElement updatePass(ChromeDriver driver) {
		
		driver.findElement(By.id("Password")).sendKeys("demouser");
		return null;
		
		
	}
	
	public  static WebElement clickupdatedetailsbutton(ChromeDriver driver) {
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		return null;
	}

}*/
}