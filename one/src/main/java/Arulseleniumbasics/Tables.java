package Arulseleniumbasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver new\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		driver.manage().window().maximize();
		
		List<WebElement> totalcolumn=driver.findElements(By.tagName("th"));
		int tablecolumn= totalcolumn.size();
		System.out.println(tablecolumn);
		
		
		List<WebElement> totalrow=driver.findElements(By.tagName("tr"));
		int tablerow= totalrow.size();
		System.out.println(tablerow);
		
		WebElement GetProgressPercent=driver.findElement(By.xpath("//td[normalize-space()=\"Cantrell\"]//following::td[1]"));
		String percent=GetProgressPercent.getText();
		System.out.println(percent);
		
		List<WebElement> overallprogress=driver.findElements(By.xpath("//td[3]"));
		
		List<Integer> iterationvalues=new ArrayList<Integer>();
		
		
		for (WebElement percentvalues : overallprogress) {
			
			
			  String indicidualvalues= percentvalues.getText();
			  Integer.parseInt(indicidualvalues);
			  iterationvalues.add(Integer.parseInt(indicidualvalues));
			
		}
		System.out.println(iterationvalues);
		
		int smallvalue=Collections.min(iterationvalues);
		System.out.println(smallvalue);
		
		

		
	}

}
