package PomWithoutFindby;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class WithoutFindBy {
	
	
	public static WebElement email;
	public static WebElement password;
	
	@Test
	public void land() {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\cdriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://sltappsdev.singaporeland.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		
		PageFactory.initElements(driver,WithoutFindBy.class);
		
		email.sendKeys("Admin");
		password.sendKeys("1234567");
		
		
		
		
		
		
	}
	
	
	

}
