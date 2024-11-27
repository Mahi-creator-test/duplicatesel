package one12;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThreadpoolTimeoutExpectedException {

	/*
	 * @Test(expectedExceptions = {NoSuchElementException.class})
	 * 
	 * @Test(timeOut = 1000)
	 */
	  
	  @Test(invocationCount = 3 , threadPoolSize = 3)
	 
	public void display() {

		System.setProperty("webdriver.chrome.driver", "D:\\cdriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://sglandv1.demopsts.com/");
		driver.manage().window().maximize();

	}
}