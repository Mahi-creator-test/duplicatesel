package org.maincode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pageobjects.LoginPageobjects;
import Pageobjects.MyProfileobjects;

public class UpdateProfileFlow {
	
	
	@Test
	public void updateProfile() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\cdriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://phptravels.net/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		
		/*
		 * LoginPageobjects.username(driver).sendKeys("user@phptravels.com");
		 * LoginPageobjects.password(driver).sendKeys("demouser");
		 * LoginPageobjects.submitbutton(driver).click();
		 */
		/*
		 * MyProfileobjects.clickmyprofileButton(driver).click();
		 * MyProfileobjects.updatePass(driver).sendKeys("demouser");
		 * MyProfileobjects.Enteraddress2(driver).sendKeys("xyz");
		 * MyProfileobjects.updatePass(driver).click();
		 */
		
		
		
		
		
		
		
		
		
		PageFactory.initElements(driver,LoginPageobjects.class);
		
		
		LoginPageobjects.username.sendKeys("user@phptravels.com");
		LoginPageobjects.Pass.sendKeys("demouser");
		LoginPageobjects.submit.click();
		
		
		Thread.sleep(3000);
		
		
		PageFactory.initElements(driver,MyProfileobjects.class);
	    
		MyProfileobjects.clickmyprofileButton.click();
        MyProfileobjects.Enteraddress2.sendKeys("xyz");
        MyProfileobjects.updatePass.sendKeys("demouser");
        MyProfileobjects.clickupdatedetailsbutton.click();
		
		
		
		
//		
//		driver.findElement(By.id("email")).sendKeys("user@phptravels.com");
//		driver.findElement(By.id("password")).sendKeys("demouser");
//		driver.findElement(By.id("submitBTN")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"fadein\"]/main/div/div/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.name("address2")).sendKeys("xyz");
//		driver.findElement(By.id("Password")).sendKeys("demouser");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		
	}

}
