package Arulseleniumbasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver new\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/windows");
		String parentwindow=driver.getWindowHandle();
		System.out.println("First window " +parentwindow);
		driver.manage().window().maximize();
		driver.findElement(By.id("home")).click();
		Set<String> windowhandles=driver.getWindowHandles();
		System.out.println(windowhandles);
		
		List<String> list=new ArrayList<String>(windowhandles);
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(list.get(0));
		driver.close();
		Set<String> windowhandles1=driver.getWindowHandles();
		list.clear();
        list.addAll(windowhandles1);
        driver.switchTo().window(list.get(0));
		
		System.out.println(driver.getCurrentUrl());
	}

}
