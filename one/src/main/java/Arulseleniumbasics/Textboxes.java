package Arulseleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver new\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.id("j_idt88:name")).sendKeys("Mahi");
		driver.findElement(By.name("j_idt88:j_idt91")).sendKeys("chennaicity");
		Boolean boo= driver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
		System.out.println(boo);
		driver.findElement(By.id("j_idt88:j_idt95")).clear();
		String name= driver.findElement(By.id("j_idt88:j_idt97")).getAttribute("value");
		System.out.println(name);
		driver.findElement(By.id("j_idt106:j_idt122")).click();	
	

	}

}
