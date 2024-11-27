package Arulseleniumbasics;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploadcheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver new\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml");
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.id("j_idt93:j_idt95"));
		ele.click();
		
		Thread.sleep(3000);
		
		File filelocation=new File("C:\\Users\\navee\\Downloads");
		File[] allfiles=filelocation.listFiles();
		
		for (File file : allfiles) {
			
			if(file.getName().equals("TestLeaf Logo")){
				
				
				System.out.println("File found");
				break;
				
			}else {
				
				
				System.out.println("no file found");
				break;
			}
			
		}

	}

	}
