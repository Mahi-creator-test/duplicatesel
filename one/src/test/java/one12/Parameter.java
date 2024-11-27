package one12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parameter {
	    
	    @Parameters({"username" , "Password" , "browser"})
	    @Test
        public void Bsmart(String name,String pass ,String browser) {
	    	
	    	RemoteWebDriver driver=null;
	    	
	    	switch (browser) {
			case "Chrome":
				
				driver=new ChromeDriver();
				
				break;
            case "edge":
            	
            	driver=new EdgeDriver();
				
				break;
				
			default:
				System.err.println("Not a browser");
				break;
			}
		
        System.out.println(name + "   " +pass);
		System.setProperty("webdriver.chrome.driver", "D:\\cdriver\\chromedriver-win64\\chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		driver.get("https://bsmartstaging.aanandas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.findElement(By.id("email")).sendKeys(name);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div/div[1]/div/div[2]/div/div/div/div/button")).click();
	
              
	
	
	
	
	

}}
