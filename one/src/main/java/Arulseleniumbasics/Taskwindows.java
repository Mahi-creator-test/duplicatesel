package Arulseleniumbasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Taskwindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver new\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/windows");
		driver.manage().window().maximize();
		driver.findElement(By.id("home")).click();
		Set<String> bothwindows=driver.getWindowHandles();
		System.out.println(bothwindows);
		
		List<String> handles=new ArrayList<String>(bothwindows);
		driver.switchTo().window(handles.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(handles.get(0));
		driver.close();
		driver.switchTo().window(handles.get(1));
		driver.close();
		
			
		
		
		

	}

}
