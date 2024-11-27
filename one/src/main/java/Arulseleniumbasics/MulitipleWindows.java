package Arulseleniumbasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MulitipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver new\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/windows");
		driver.manage().window().maximize();
		driver.findElement(By.id("multi")).click();
		int totalwindows=driver.getWindowHandles().size();
		System.out.println(totalwindows);
		
		Set<String> handles =driver.getWindowHandles();
		
		for (String all : handles) {
			
			
			System.out.println(driver.getTitle());
			
		}
		
		driver.quit();
		

	}

}
