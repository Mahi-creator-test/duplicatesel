package one12;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCountandTimout {
	
	
	@Test(invocationCount = 3 , invocationTimeOut = 10000)
	public void display() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\cdriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://sglandv1.demopsts.com/");
		driver.manage().window().maximize();
		
		
		
	}
	

}
