package Annotations;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpdown {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\cdriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://bsmartsg.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		
		//JavascriptExecutor jse=(JavascriptExecutor) driver;
		/*
		 * jse.executeScript("window.scroll(0,450)", ""); Thread.sleep(3000);
		 * 
		 * jse.executeScript("window.scroll(0,-450)", "");
		 */
		
		//bottom
		
		/*
		 * jse.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		 * Thread.sleep(3000); jse.executeScript("window.scrollTo(0, 0);");
		 */
		
		Robot row=new Robot();
		row.keyPress(KeyEvent.VK_PAGE_DOWN);
		row.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(3000);
		
		row.keyPress(KeyEvent.VK_PAGE_UP);
		row.keyRelease(KeyEvent.VK_PAGE_UP);

	}

}
