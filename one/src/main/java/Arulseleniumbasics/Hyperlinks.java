package Arulseleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver new\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml");
		driver.manage().window().maximize();
		
		WebElement homepage=driver.findElement(By.linkText("Go to Dashboard"));
		homepage.click();
		driver.navigate().back();
		
		WebElement withoutclick=driver.findElement(By.partialLinkText("Find the URL without "));
		String destlocation=withoutclick.getAttribute("href");
		System.out.println(destlocation);
		
		WebElement brokenlink=driver.findElement(By.linkText("Broken?"));
		brokenlink.click();
        String title=driver.getTitle();
        System.out.println(title);
        
        if(title.contains("404")) {
        	
        	
        	System.out.println("the link is broken");
        	
        	
        }else {
        	
        	System.out.println("the link is not broken");
        	
        }
		
        driver.navigate().back();
        
        WebElement homepage1=driver.findElement(By.linkText("Go to Dashboard"));
		homepage1.click();
        
        driver.navigate().back();
        
        List<WebElement> count=driver.findElements(By.tagName("a"));
        
        int c=count.size();
        System.out.println(c);
        

	}

}
