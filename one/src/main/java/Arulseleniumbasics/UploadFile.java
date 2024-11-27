package Arulseleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver new\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml");
		driver.manage().window().maximize();
		
		WebElement uploadbutton=driver.findElement(By.id("j_idt88:j_idt89"));
		uploadbutton.click();
		
		String file="\"C:\\Users\\navee\\OneDrive\\Pictures\\Bsmart images\\download.jpg\"";
		
		StringSelection sel=new StringSelection(file);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		
		Robot bot=new Robot();
		bot.keyPress(KeyEvent.VK_CONTROL);
		bot.keyPress(KeyEvent.VK_V);
		bot.keyRelease(KeyEvent.VK_V);
		bot.keyRelease(KeyEvent.VK_CONTROL);
		bot.keyPress(KeyEvent.VK_ENTER);
		bot.keyRelease(KeyEvent.VK_ENTER);
	}

}
