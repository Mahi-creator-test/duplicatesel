package org.selenium.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Letcodebase {
	
	protected RemoteWebDriver driver=null;
	
	String URL="https://bsmartstaging.aanandas.com/";
	
	@BeforeMethod
	public void startapp() {
		
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(URL);
		
		
		
		
		
	}
	@AfterMethod
	public void closeapp() {
		
		driver.quit();
		
	}
	
	

}
