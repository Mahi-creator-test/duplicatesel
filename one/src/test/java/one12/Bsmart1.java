package one12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Bsmart1 {
	
	
	
	@Test
   public void Bsmart() {
		

		System.setProperty("webdriver.chrome.driver", "D:\\cdriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://bsmartstaging.aanandas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.quit();
		
	
	
	
	

}
	}

