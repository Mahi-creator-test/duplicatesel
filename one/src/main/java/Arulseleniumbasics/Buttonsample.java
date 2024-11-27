package Arulseleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttonsample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver new\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		WebElement ele= driver.findElement(By.id("j_idt88:j_idt94"));
	    Point poi= ele.getLocation();
	    int xpoint =poi.getX();
	    int ypoint=poi.getY();
	    System.out.println(xpoint);
	    System.out.println(ypoint);
	    
	    WebElement ele1= driver.findElement(By.id("j_idt88:j_idt96"));
	    String colour=ele1.getCssValue("background-colour");
	    System.out.println(colour);
	   
		WebElement hw=driver.findElement(By.id("j_idt88:j_idt98"));
		int x=hw.getSize().getHeight();
		int y=hw.getSize().getWidth();
		
		System.out.println(x);
		System.out.println(y);
 
	}

}
