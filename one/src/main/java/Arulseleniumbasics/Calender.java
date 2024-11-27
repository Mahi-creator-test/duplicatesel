package Arulseleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver new\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/date-picker.php");
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.id("datetimepicker1"));
		ele.click();
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/span[2]/svg")).click();
		
	    
	}

}
		



