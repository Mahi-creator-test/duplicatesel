package Arulseleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver new\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/context-menu");
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.id("hot-spot"));
		
		Actions a=new Actions(driver);
		a.contextClick(ele).build().perform();
		
		
		
		
		
		
		
		

	}

}
