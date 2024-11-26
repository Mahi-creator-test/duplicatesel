package org.maincode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pageobjects.LoginPageobjects;

public class LoginFlow {
	
	@Test
	public void display() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\cdriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://phptravels.net/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		
		//Basic code
		
//		driver.findElement(By.id("email")).sendKeys("user@phptravels.com");
//		driver.findElement(By.id("password")).sendKeys("demouser");
//		driver.findElement(By.id("submitBTN")).click();
		
		
		//After simplification using page factory
		PageFactory.initElements(driver,LoginPageobjects.class);
		
		
		//LoginPageobjects.username.sendKeys("user@phptravels.com");
		LoginPageobjects.Pass.sendKeys("demouser");
		LoginPageobjects.submit.click();
		
		
	}
	
	
	
	

}
