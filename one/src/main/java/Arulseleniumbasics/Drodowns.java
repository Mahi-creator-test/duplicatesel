package Arulseleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drodowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver new\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		
		WebElement drop1=driver.findElement(By.id("fruits"));
		Select sel=new Select(drop1);
		sel.selectByIndex(2);
		
		WebElement lastdrop=driver.findElement(By.id("country"));
		Select SELECT1=new Select(lastdrop);
		SELECT1.selectByValue("Colombia");
		WebElement firstselected= SELECT1.getFirstSelectedOption();
		System.out.println(firstselected.getText());
		
		WebElement mul=driver.findElement(By.id("superheros"));
		Select Mulselect=new Select(mul);
		Boolean result=Mulselect.isMultiple();
		System.out.println(result);
		Mulselect.selectByIndex(3);
		Mulselect.selectByIndex(4);
		List<WebElement> list1= Mulselect.getOptions();
		for (WebElement Alllist : list1) {
			
			System.out.println(Alllist.getText());
			
		}
		
		
		
		
		
		
		
		


	}

}
