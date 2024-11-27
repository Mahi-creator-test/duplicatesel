package Arulseleniumbasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver new\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		String oldwindow=driver.getWindowHandle();
		
		WebElement Firstbutton=driver.findElement(By.id("j_idt88:new"));
		Firstbutton.click();
		
		Set<String> handles=driver.getWindowHandles();
		
		for (String newwindow : handles) {
			
			driver.switchTo().window(newwindow);
		}
		
		driver.findElement(By.id("email")).sendKeys("psts");
		driver.close();
		
		driver.switchTo().window(oldwindow);
	
		WebElement Multiple=driver.findElement(By.id("j_idt88:j_idt91"));
		Multiple.click();
		
		int count=driver.getWindowHandles().size();
		System.out.println(count);
		
		Set<String> handles1=driver.getWindowHandles();
		
		
			
			
			
		}
		


	}


