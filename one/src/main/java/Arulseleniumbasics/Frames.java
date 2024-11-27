package Arulseleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver new\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		WebElement button=driver.findElement(By.id("Click"));
		button.click();
		String a=button.getText();
		System.out.println(a);
		
		driver.switchTo().defaultContent();
		
		
		/*
		 * driver.switchTo().frame(0); driver.switchTo().frame("frame2"); WebElement
		 * button2=driver.findElement(By.xpath("//*[@id=\"Click\"]")); button2.click();
		 * String b=button2.getText(); System.out.println(b);
		 */
		
		int zz=driver.findElements(By.tagName("iframe")).size();
		System.out.println(zz);

	}

}
