package one12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BsmartDataProvide {
	
	@Test
	public void demo1() {
		
		  System.setProperty("webdriver.chrome.driver",
				  "D:\\cdriver\\chromedriver-win64\\chromedriver.exe"); ChromeDriver driver=new
				  ChromeDriver(); driver.get("https://bsmartstaging.aanandas.com/");
				  driver.manage().window().maximize();
				  driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
				  driver.findElement(By.id("email")).sendKeys("");
				  driver.findElement(By.id("password")).sendKeys("");
				  driver.findElement(By.xpath(
				  "//*[@id=\"root\"]/form/div/div/div[1]/div/div[2]/div/div/div/div/button")).
				  click();
				 
		
		
		
		
	}
	
	
	
	

}
