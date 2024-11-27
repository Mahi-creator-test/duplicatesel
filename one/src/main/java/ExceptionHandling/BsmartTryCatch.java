package ExceptionHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

public class BsmartTryCatch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver new\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://phptravels.net/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
	    try {
			driver.findElement(By.id("email")).sendKeys("user@phptravels.com");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			driver.findElement(By.id("password1")).sendKeys("demouser");
			Thread.sleep(3000);
			e.printStackTrace();
			
		}
	    finally {
	    	 driver.findElement(By.id("submitBTN")).click(); 
		}
	   
	    
	   
	

	    
	}
	

}
