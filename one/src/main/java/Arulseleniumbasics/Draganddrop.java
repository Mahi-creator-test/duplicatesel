package Arulseleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver new\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
  
		WebElement from=driver.findElement(By.id("form:drag_content"));
		WebElement to=driver.findElement(By.xpath("//*[@id=\"form:drop_content\"]/p"));
		
		Actions ac=new Actions(driver);
		ac.dragAndDrop(from, to).build().perform();
		
		
		WebElement ele=driver.findElement(By.id("form:conpnl_content"));
		Actions ac1=new Actions(driver);
		ac1.dragAndDropBy(ele, 45, 80).build().perform();
		
		
		
	}

}
